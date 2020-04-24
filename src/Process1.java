
import java.io.*;
import java.util.*;

public class Process1 extends Process
{
    public Process1(Scheduler s)
    {
        super(s);
    }
   
    public void run() {
   	 try {
   		 readingData r = new readingData();
   		 PrintOnScreen p = new PrintOnScreen();
   		 TakeTextInput t = new TakeTextInput();
   	   setEnumState(EnumState.RUNNING);
   	   SysCaller caller = new SysCaller();
   	   r.semReadWait(this);
   	   p.semPrintWait(this);
   	   t.semTakeWait(this);
   	   if(this.getEnumState()==EnumState.BLOCKED)
   		   return;
       String path = caller.SysCall4();
       String result = caller.SysCall1(path);
       if(result != null)
       System.out.println(result);
       r.semReadPost();
       p.semPrintPost();
       setEnumState(EnumState.FINISHED);
       getListener().dispatch();
   	 
   }
   	catch(Exception e ) {
   		System.out.println("file not found");
   		getListener().dispatch();
   	}
    }
    
 
}
