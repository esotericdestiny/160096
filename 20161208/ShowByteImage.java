import java.io.*;
public class ShowByteImage{
	public static void main(String[]args){
FileInputStream inFile = null;

try{
	inFile = new FileInputStream("Cartoon.jpg");
	//int data = inFile.read();
	int n=0;
	int data;
	while((data = inFile.read())!=-1){
	System.out.println(n+":"+data);
	n++;
	}
	inFile.close();
}catch(IOException e){
	System.err.println("エラーです");
	System.exit(1);
		}
}
}
