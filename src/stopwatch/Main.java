package stopwatch;

import java.io.IOException;

/**
 * The main Task will run the program
 * @author patiphansrisook
 *
 */
public class Main {

	/**
	 * Run the tasks.
	 */
	public static void main (String[] args) throws IOException{
		TaskTimer taskTimer = new TaskTimer();
		taskTimer.measureAndPrint(new AppendToString(50000));
		taskTimer.measureAndPrint(new AppendToString(100000));
		taskTimer.measureAndPrint(new AppendToStringBuilder(100000));
		
		int counter = 1000000000;
		taskTimer.measureAndPrint(new SumDoublePrimitive(counter));
		taskTimer.measureAndPrint(new SumDouble(counter));
		taskTimer.measureAndPrint(new SumBigDecimal(counter));
	}
}
