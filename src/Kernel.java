
public class Kernel {

	public static void main(String[]args) {
		Process1 p1 = new Process1();
		Process2 p2 = new Process2();
		Process3 p3 = new Process3();
		Process4 p4 = new Process4();
		Process5 p5 = new Process5();
		//p1.run();
		//p2.run();
		p3.start();
		p4.start();
		//p5.run();
	}
	
}
