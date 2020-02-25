import java.io.IOException;

public class Process2 extends Process {

	public Process2() {
			super();
			}
	public void run(String data, String path) {
		getCaller().SysCall2(data, path);
	}


}
