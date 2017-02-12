package stopwatch;

import java.math.BigDecimal;

/**
 * task 5: add BigDecimal objects from an array.
 * You need a large counter value to get a measurable time.
 * @author patiphansrisook
 */
public class SumBigDecimal implements Runnable{

	static final int ARRAY_SIZE = 500000;
	private int counter;
	BigDecimal sum;
	
	public SumBigDecimal(int counter){
		this.counter = counter;
	}
	@Override
	public void run() {
		// create array of values to add, before we start the timer
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
		
		this.sum = new BigDecimal(0.0);
		for(int count=0, i=0; count<counter; count++, i++) {
			if (i >= values.length) i = 0;
			sum = sum.add( values[i] );
		}
	}
	
	@Override
	public String toString(){
		return String.format("Sum array of BigDecimal with count=%,d\nsum = %.0f\n",counter,sum);
	}
}
