import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class SysCaller {
	
	public SysCaller() {
		
	}
	public void SysCall2(String data,String path)
	{
		try {
		FileOutputStream outputStream = new FileOutputStream(path);
	    byte[] strToBytes = data.getBytes();
	    outputStream.write(strToBytes);
	 
	    outputStream.close();
	 }
		catch(IOException e) {
			System.out.println("file not found");
		}
	}

}
