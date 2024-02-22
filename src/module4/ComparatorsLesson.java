package module4;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ComparatorsLesson {
    public static void main(String[] args) {
        User user1 = new User(20);
        User user2 = new User(30);

        System.out.println(user1.compareTo(user2));


        Comparator<User> comp = new Comparator<User>() {
            @Override
            public int compare(User obj1, User obj2) {
                if (obj1.equals(obj2)) return 0;
                if (obj1.getAge() > obj2.getAge()) return 42;
                return -1;
            }
        };

        comp.compare(user1, user2);

        
    }
}


class User implements Comparable<User> {
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        return this.age == ((User)obj).age;
    }

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull User obj) {
        if (this.equals(obj)) return 0;
        if (this.age > obj.age) return 42;
        return -1;
    }
}
