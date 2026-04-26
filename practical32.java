class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    public A(int pubVar, int protVar, int privVar) {
        this.pubVar = pubVar;
        this.protVar = protVar;
        this.privVar = privVar;
    }
}

class B extends A {
    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }

    public void display() {
        System.out.println("Inside bpack.B (extends A):");
        System.out.println("public variable (pubVar)    : " + pubVar);
        System.out.println("protected variable (protVar): " + protVar);
        System.out.println("private variable (privVar)  : Not accessible in subclass");
    }
}

class C {
    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("Inside cpack.C (object of A):");
        System.out.println("public variable (pubVar)    : " + obj.pubVar);
        System.out.println("protected variable (protVar): Not accessible in non-subclass outside package");
        System.out.println("private variable (privVar)  : Not accessible outside class A");
    }
}

public class practical32 {
    public static void main(String[] args) {
        System.out.println("Heet Patel - 240390107029");
        B bObj = new B(100, 200, 300);
        C cObj = new C();

        System.out.println("---- Access Specifier Demonstration ----");
        bObj.display();
        System.out.println();
        cObj.display();
    }
}