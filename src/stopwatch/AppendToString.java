package stopwatch;

/**
 * task 1: append chars to a string.
 * @author patiphansrisook
 */
public class AppendToString implements Runnable {
	
	private int count;
	private String result;
	
	public AppendToString(int count){
		this.count = count;
	}
	
	@Override
	public void run() {
		final char CHAR = 'a';
		this.result = "";
		int k = 0;
		while(k++ < count) {
			result = result + CHAR;
		}
	}
	
	@Override
	public String toString(){
		return String.format("Append %,d chars to String\nfinal string length = %d\n",count,result.length());
	}
	
}
