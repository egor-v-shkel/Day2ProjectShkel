package by.javatr.shkel.task1;

public class HelloUsername {

	public static void main(String[] args) {
		String str = "Hello, ";
		if(args.length != 0) {
			str += args[0];
		}else {
			str += "anonim!!!";
		}
		System.out.println(str);
	}

}