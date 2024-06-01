package OOPS;

class GreatGrandFather {
    void print() {
        System.out.print("Great Grand Father");
    }
}

class GrandFather extends GreatGrandFather {
    void print() {
        System.out.print("Grand Father");
    }
}

class Father extends GrandFather {

}

class Child extends Father {

}

public class InheritanceExampleOne {
    public static void main(String aeg[]) {
        GreatGrandFather ggf = new Child();
        ggf.print();
    }
}
