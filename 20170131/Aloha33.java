public class Aloha33{
	public static void main ( String[] args )
	{
		String[] names = new String[3];

		String name = "";
		for (int i = 0; i < 3  ; i++)
		{
			System.out.println("名前を入力してください");
			name = new java.util.Scanner(System.in).nextLine();
			names[i] = name;
		}
		for (int i = 0; i < names.length ; i++)
		{
			System.out.println(names[i]);
		}
	}
}