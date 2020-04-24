
public interface ProcessListener {
	public void dispatch() ;
	public void block(Process p);
	public void schedule(Process proc); 
}
