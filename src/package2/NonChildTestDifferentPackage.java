package package2;

public class NonChildTestDifferentPackage {
    public int testDifferentPublicInt = 10;
    private int testDifferentPrivateInt = 11;
    protected int testDifferentProtectedInt = 12;
    int testDifferentDefaultInt =13;

    public void printDifferentPublicMethod(){
        System.out.println("I am Different public method");

    }

    private void printDifferentPrivateMethod(){
        System.out.println("I am Different private method");

    }

    protected void printDifferentProtectedMethod(){
        System.out.println("I am Different protected method");

    }

    void printDifferentDefaultMethod(){
        System.out.println("I am Different default method");

    }
}
