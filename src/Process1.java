
import java.io.*;
import java.util.*;

public class Process1 extends Process
{
    public Process1()
    {
        super();
    }
   
    public void run() {
   	 try {
   		 SysCaller caller = new SysCaller();
       String path = caller.SysCall4();
       String result = caller.SysCall1(path);
       if(result != null)
       System.out.println(result);
   	 
   }
   	catch(Exception e ) {
   		System.out.println("file not found");
   	}
    }
    
 
}
