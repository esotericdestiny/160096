import java.io.*;
public class CopyByteImage{
	public static void main(String[]args){
FileInputStream inFile = null;
FileOutputStream outFile = null;

try{
	inFile = new FileInputStream("Cartoon.jpg");
	outFile = new FileOutputStream("resultcartoon.jpg");
	System.out.println("Streamを作りました。");
	//int data = inFile.read();
	int data;
	while((data = inFile.read())!=-1){
	outFile.write(data);
	System.out.println("画像ファイルをコピーしています。");
	}
	inFile.close();
	System.out.println("コピー終わりました。");
	outFile.close();
}catch(IOException e){
	System.err.println("エラーです");
	System.exit(1);
		}
}
}
