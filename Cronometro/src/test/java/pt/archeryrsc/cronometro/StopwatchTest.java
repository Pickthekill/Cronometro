package pt.archeryrsc.cronometro;

import org.junit.Before;
import org.junit.Test;

import pt.archeryrsc.cronometro.util.Stopwatch;

public class StopwatchTest {
	Stopwatch stopwatch;
	
	@Test
	public void test() {
		stopwatch.start();
		int i = 0;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopwatch.stop();
		System.out.println(stopwatch);
	}
	@Before
	public void init() {
		stopwatch = new Stopwatch();
	}
}
