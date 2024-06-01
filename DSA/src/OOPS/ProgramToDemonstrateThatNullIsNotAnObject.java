package OOPS;

public class ProgramToDemonstrateThatNullIsNotAnObject {
    static void programToDemonstrateThatNullIsNotAnObject() {
        Object o = null;
        Integer i = 90;
        Integer z = null;
        System.out.println(i instanceof Integer);
        System.out.println(z instanceof Integer);
        System.out.println("In Java, instanceof is used to check if an object is /n" +
                " an instance of a particular class or interface. However, it doesn't/n" +
                " work with null references because null isn't an instance of any class or interface.");
    }
}
