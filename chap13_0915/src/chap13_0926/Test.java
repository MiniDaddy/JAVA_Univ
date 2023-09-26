package chap13_0926;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		String source = "hi hi hi hi h hi hi hi hi";
//		char intxt[] = new char[source.length()];
//		source.getChars(0, source.length(), intxt,0);
//		FileWriter fw = new FileWriter("temp.txt");
//		fw.write(intxt);
//		
//		fw.close();

		
		int[] num = {1,2,3,4,5};
		String[] st= {"Kim","Park","Jung","Lee"};
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.txt"));
		oos.writeObject(num);
		oos.writeObject(st);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tmp.txt"));
		int[] num2 = (int[])ois.readObject();
		String[] st2 = (String[])ois.readObject();
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		System.out.println();
		for(int i=0; i<st2.length; i++) {
			System.out.print(st2[i]+" ");
		}
	}
}
