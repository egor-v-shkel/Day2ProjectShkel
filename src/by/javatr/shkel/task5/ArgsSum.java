package by.javatr.shkel.task5;

public class ArgsSum {
    public static void main(String[] args) {
        int sum = 0;
        boolean correctInput = true;

        if (args.length != 0){
        	for (String str : args) {
        		try {
        			sum += Integer.parseInt(str);
        		} catch (NumberFormatException e) {
        			System.out.println("Check input.");
        			correctInput = false;
        			break;
        		}
        	}
        }

        if (correctInput) System.out.printf("Sum of arguments is: %d.\n", sum);
    }
}