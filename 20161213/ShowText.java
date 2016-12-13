import java.io.*;

public class ShowText{
	public static void main(String[]args){
		String fileName = args[0];
		FileReader fr = null;
		BufferedReader in = null;
		System.out.println(args[0]);
		try{
			fr = new FileReader (fileName);
			in = new BufferedReader(fr);
			while(true){
				String data = in.readLine();
				System.out.println(data);
				if(data == null)
					break;
			}

		}catch(IOException e){
			System.out.println("IO ERROR");
		}
	}
}