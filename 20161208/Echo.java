public class Echo{
	public static void main(String[]args){
		while (true){
	System.out.println("名前を入力してください");
	String name= new java.util.Scanner(System.in).nextLine();
	System.out.println(name);
	if(name.equals("")){
		break;
	}
	}
	}
}