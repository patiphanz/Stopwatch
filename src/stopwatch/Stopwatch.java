package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author patiphansrisook
 * @version 1.0
 */
public class Stopwatch {
	
	private boolean running;
	private double startTime;
	private double stopTime;
	
	public Stopwatch(){
		this.running = false;
	}
	/**
	 * Start the stopwatch if it is not already running;
	 */
	public void start( ){
		if(!isRunning()) running = !running;
		startTime = System.nanoTime();
		
	}
	
	/**
	 * Stop the stopwatch if it is running.
	 */
	public void stop(){
		if(isRunning()) running = !running;
		
	}
	
	/**
	 * 
	 * @return the elapsed time in seconds with deciminal
	 */
	public double getElapsed(){
		stopTime = System.nanoTime();
		return (stopTime - startTime)/1000000000;
	}
	
	/**
	 * 
	 * @return true if the stopwatch is running, false if stopwatch is stopped.
	 */
	public boolean isRunning(){
		return this.running;
	}
	
}
