package stopwatch;

/**
 * task 3: add double primitives from an array.
 * You need a large counter value to get a measurable time.
 * @author patiphansrisook
 */
public class SumDoublePrimitive implements Runnable{

	static final int ARRAY_SIZE = 500000;
	private int counter;
	private double sum;

	public SumDoublePrimitive(int counter){
		this.counter = counter;
	}
	@Override
	public void run() {

		// create array of values to add before we start the timer
		double[] values = new double[ARRAY_SIZE];
		for(int k=0; k<ARRAY_SIZE; k++) values[k] = k+1;

		this.sum = 0.0;
		// count = loop counter, i = array index value
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;  // reuse the array when get to last value
			sum = sum + values[i];
		}
	}
	
	@Override
	public String toString(){
		return String.format("Sum array of double primitives with count=%,d\nsum = %.0f\n",counter,sum);
	}
}
