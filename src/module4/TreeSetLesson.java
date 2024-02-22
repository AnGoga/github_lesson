package module4;


import org.jetbrains.annotations.NotNull;


interface MySet<T extends Comparable<T>> {
    void add(T value);

    boolean find(T value);
}


class MyTreeSet<T extends Comparable<T>> implements MySet<T> {
    private Node<T> root;

    public MyTreeSet() {

    }

    @Override
    public boolean find(T value) {
        return find(value, root);
    }

    private boolean find(T value, Node<T> node) {
        if (node == null) {
            return false;
        }
        int comp = value.compareTo(node.value);
        if (comp == 0) { // node.value == value
            return true;
        }
        if (comp < 0) {
            return find(value, node.left);
        } else {
            return find(value, node.right);
        }
    }

    @Override
    public void add(T value) {
        if (root == null) {
            root = new Node<>(value);
            return;
        }
        add(value, root);
    }

    private void add(T value, @NotNull Node<T> node) {
        int comp = value.compareTo(node.value);

        if (comp <= 0) { // left
            if (node.left == null) {
                node.left = new Node<>(value);
            } else {
                add(value, node.left);
            }
        } else { // right
            if (node.right == null) {
                node.right = new Node<>(value);
            } else {
                add(value, node.right);
            }
        }
    }

    private static class Node<T> {
        Node<T> left;
        Node<T> right;

        T value;

        public Node(T value) {
            this.value = value;
        }
    }
}


class Person implements Comparable<Person> {
    String id;
    int age;
    String name;

    @Override
    public int compareTo(@NotNull Person o) {
        return 0;
    }
}

public class TreeSetLesson {
    public static void main(String[] args) {
        MySet<Integer> set = new MyTreeSet<>();

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }

        System.out.println(set.find(3));
        System.out.println(set.find(-1));
    }
}
