package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main extends Thread {
	private int index;

	public main(int i) {
		this.index = i;
	}

	public void run() {
		try {
			System.out.println("[" + this.index + "] start....");
			Thread.sleep(1000);
			System.out.println("[" + this.index + "] end.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		// ExecutorService service = Executors.newFixedThreadPool(4);
		// for (int i = 0; i < 10; i++) {
		//// service.execute(new main(i));
		// service.submit(new main(i));
		//// service.execute(command);
		// }
		// System.out.println("submit finish");
		//// service.shutdown();
		// List<Integer> rules = new ArrayList<Integer>();
		// for (int i = 0; i < 10; i++) {
		// rules.add(i);
		// }
		// for (Integer rule : rules) {
		// if (rule % 2 == 0) {
		// rules.remove(rule%1000);
		// }
		// }
		// for (int i = 0; i < rules.size(); i++) {
		// if (rules.get(i) % 2 == 0) {
		// rules.remove(i);
		// i--;
		// }
		// for (int j = 0; j < 10; j++) {
		// System.out.println(j);
		// if (i == 3) {
		// System.out.println("ÍË³ö");
		// break;
		// }
		// }
		// System.out.println(rules);
		// System.out.println(i);
		// }

		// System.out.println(rules);
		Double s = 1.23;
	    Integer a=3;
	    Object o=s*a;
		System.out.println(o.getClass());
	}

}