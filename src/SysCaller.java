import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class SysCaller {
	private Scanner sc =new Scanner(System.in);
	
	public String SysCall1(String path){
		
		try {
	        File file = new File(path);
	        BufferedReader br = new BufferedReader(new FileReader(file));

	       String y ="";
	        String st;
	        while ((st = br.readLine()) != null) {
	            y+=st;
	            y+="\n";
	        }
	        br.close();
	
	        return y ; }
	catch (Exception e) {
	System.out.println("File not found");
	return null;
				}
	    
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
	public void SysCall3(String data) {
		System.out.println(data);
	}
	public String SysCall4() {
		String input = sc.nextLine();
		return input;
	}
	
	public boolean canReadLine() {
		return sc.hasNextLine();
	}
}
