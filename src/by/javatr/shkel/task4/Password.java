package by.javatr.shkel.task4;

public class Password {
    public static void main(String[] args) {
        final String PASSWORD = "UnsafePassword";

        if (args.length != 0 && PASSWORD.equals(args[0])) 
            System.out.println("Passwords match!");
        else
            System.out.println("Passwords missmatch!");
    }
}