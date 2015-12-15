package javacore;
import java.io.File;
public class FileCreate {

	public static void main(String[] args) {
		try
		{
			File dir=new File("dir3");
			dir.mkdirs();
			File file=new File(dir,"file3");
			file.createNewFile();
		}
		catch(Exception e){}
	}

}
