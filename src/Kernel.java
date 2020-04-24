import java.util.Scanner;

public class Kernel {

	public static void main(String[]args) {
		Scheduler s = new Scheduler();
		Process p1 = new Process1(s);
		Process p2 = new Process2(s);
		Process p3 = new Process3(s);
		Process p4 = new Process4(s);
		Process p5 = new Process5(s);	
		//Scanner sc = new Scanner(System.in);
		
//		s.schedule(p1);
//		s.schedule(p2);
//		s.schedule(p3);
//		s.schedule(p4);
//		s.schedule(p5);
		s.start();
		
		
	}
	
}
