public class Aloha{
	public static void main(String[]args){
		String data;
		while (true){
			System.out.print("Input data >");
			data = new java.util.Scanner(System.in).nextLine();
			System.out.println(data);
			if( data.equals("exit") ){
				break;
			}
		}
	}
}