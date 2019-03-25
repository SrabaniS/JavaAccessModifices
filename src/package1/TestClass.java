package package1;

public class TestClass  {

    public int testPublicInt = 10;
    private int testPrivateInt = 11;
    protected int testProtectedInt = 12;
    int testDefaultInt =13;

    public void printPublicMethod(){
        System.out.println("I am public method");

    }

    private void printPrivateMethod(){
        System.out.println("I am private method");

    }

    protected void printProtectedMethod(){
        System.out.println("I am protected method");

    }

    void printDefaultMethod(){
        System.out.println("I am default method");

    }
}
