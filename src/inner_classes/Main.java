package inner_classes;




class Parcel {
    public enum Status {
        GOING, DELIVERED, DONE;
    }

    private Status status ;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}


interface OnClickListener {
    void onClick(View view);
}

class View {
    OnClickListener onClick;

    void setOnClickListener(OnClickListener onClick) {
        this.onClick = onClick;
    }
}


//class Printer {
//    void print() {
//        System.out.println(1);
//    }
//}

/*
class OutClass {
    int a;

    OutClass(int a) {
        this.a = a;
    }

    static class InnerClass {
        int b = 200;

    }
}
*/
