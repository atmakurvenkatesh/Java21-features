package package1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class VirtualThreads {
	public static void main(String[] args) throws InterruptedException {

		long start = System.currentTimeMillis();
		var max_rounds = 40000;
		var counter = new AtomicInteger();
		var threads = IntStream.range(0, max_rounds).mapToObj(i -> Thread.ofVirtual().unstarted(() -> {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			}
			counter.incrementAndGet();
		})).toList();
		for (var thread : threads) {
			thread.start();
		}
		for (var thread : threads) {
			thread.join();
		}
		System.out.println("number of rounds done : " + counter);
		System.out.println("time taken to execute : " + (System.currentTimeMillis() - start) / 1000 + " Seconds");
	}
}
