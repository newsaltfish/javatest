package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test extends Thread {
	private int index;

	public Test(int i) {
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

	// main函授
	public static void main(String args[]) {
		String[] strs = "1.2.2.3.2.31.2".split("\\.");
		for (int i = 0; i < strs.length; i++) {			
			System.out.println(strs[i]);
		}

	}

	// java λ 表达式
	private void testLambda() {
		ExecutorService service = Executors.newFixedThreadPool(4);
		System.out.println("main process start");
		for (int i = 0; i < 10; i++) {		
			service.execute((Runnable) () -> {
				System.out.println("hi");
			});			
			// service.execute(new Test(i));
			// service.submit(new Test(i));
		}
		// service.shutdown();
		System.out.println("main process end");
	}

	// list删除
	private void testListDelete() {
		List<Integer> rules = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			rules.add(i);
		}
		for (Integer rule : rules) {
			if (rule % 2 == 0) {
				rules.remove(rule % 1000);
			}
		}
		for (int i = 0; i < rules.size(); i++) {
			if (rules.get(i) % 2 == 0) {
				rules.remove(i);
				i--;
			}
			for (int j = 0; j < 10; j++) {
				System.out.println(j);
				if (i == 3) {
					System.out.println("退出");
					break;
				}
			}
			System.out.println(rules);
			System.out.println(i);
		}

		System.out.println(rules);
	}

	// 类型转换
	private void testTypeChange() {
		Double s = 1.23;
		Integer a = 3;
		Object o = s * a;
		System.out.println(o.getClass());
	}
}