package stopwatch;

/**
 * Task timer will call stopwatch to mesure a time
 * @author patiphansrisook
 *
 */
public class TaskTimer {
	
	public void measureAndPrint(Runnable r){
		Stopwatch s = new Stopwatch();
		s.start();
		r.run();
		s.stop();
		System.out.print(r.toString());
		System.out.printf("Elapsed time %.6f sec\n\n",s.getElapsed());
	}
}
