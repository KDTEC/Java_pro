package file;
import java.io.*;
public class File1 {
	public static void main(String a[])
	{
		String str="This example demonstrates you how to write to file using FileWriter";
		int b=10;
		File file=null;
		FileWriter fw=null;
		try {
			file=new File("file1.txt");
			fw=new FileWriter(file);
			fw.write(str);
			fw.write(b);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("File is created");
		FileReader fr=null;
		try {
			fr=new FileReader("file1.txt");
			int c;
			System.out.println();
			System.out.println("******OUTPUT*******");
			System.out.println();
			while((c=fr.read())!= -1)
			{
				System.out.print((char)c);
			}
			System.out.println();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally {
			if(fr!=null)
			{
				try {
					fr.close();
				}
				catch(IOException ioe)
				{
					System.out.println(ioe);
				}
			}
		}
	}

}
