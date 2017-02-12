package stopwatch;

/**
 * task 2: append chars to a StringBuilder
 * @author patiphansrisook
 */
public class AppendToStringBuilder implements Runnable{

	private int count;
	private String result;
	
	public AppendToStringBuilder(int count){
		this.count = count;
	}
	
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder(); 
		int k = 0;
		while(k++ < count) {
			builder = builder.append(CHAR);
		}
		// now create a String from the result, to be compatible with task 1.
		this.result = builder.toString();
		
	}
	
	@Override
	public String toString(){
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d\n",count,result.length());
	}

	
}
