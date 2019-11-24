package by.javatr.shkel.task2;

public class BackwardArgs{
  public static void main(String[]args){
    for(int i = args.length - 1; i >= 0; i--) {
        System.out.println("Backward argument[" + i + "] = " + args[i]);
    }
  }
}


