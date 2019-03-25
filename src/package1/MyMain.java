package package1;
import package2.ChildTestClassDifferentPackage;
import package2.NonChildTestDifferentPackage;







public class MyMain {
    public int testMainPublicInt = 10;
    private int tesMaintPrivateInt = 11;
    protected int testMainProtectedInt = 12;
    int testMainDefaultInt =13;

    public void printMainPublicMethod(){
        System.out.println("I am Main public method");

    }

    private void printMainPrivateMethod(){
        System.out.println("I am Main private method");

    }

    protected void printMainProtectedMethod(){
        System.out.println("I am Main protected method");

    }

    void printMainDefaultMethod(){
        System.out.println("I am Main default method");

    }
    public static void main(String[] args) {

        MyMain mc = new MyMain();


        TestClass tc = new TestClass();//diffeent class from main class




        NonChildTestDifferentPackage tcdp = new NonChildTestDifferentPackage();

        //different package thats reason not seeing(only two method able see
        ChildTestClassDifferentPackage ctdp = new ChildTestClassDifferentPackage();


              ChildTestClass     ctc = new ChildTestClass();



    }
}
