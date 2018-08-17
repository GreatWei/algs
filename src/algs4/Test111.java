package algs4;

import java.util.Arrays;
import java.util.Scanner;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Test111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println((0 + 15) / 2);
		StdOut.println(2.0e-6);
		StdOut.println(2.0e-6 * 100000000.1);
		StdOut.println(true && false || true && true);

		System.out.println(((1 + 2.236) / 2));
		System.out.println(4 + 1 + 5.0);
		System.out.println(4.1 >= 4);

		// while (!StdIn.isEmpty()) {
		// System.out.println(StdIn.readInt());
		// }
		// boolean flag = false; //
		// Scanner scanner =new Scanner(System.in);
		// double x=scanner.nextDouble();
		// double y=scanner.nextDouble();
		// if((x>=0&&x<=1)&&(y>=0&&y<=1))
		// flag=true;
		// System.out.println(flag);
		// scanner.close();
		// int c;
		// if (2 > 1)
		// c = 0;

		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println("f:" + f + "--g:" + g);
			System.out.println();
			f = f + g;
			g = f - g;
		}

		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > 0.001) {
			t = (9.0 / t + t) / 2.0;
			System.out.println("t:" + t);
		}
		System.out.printf("%.5f\n", t);

		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i < 1000; i *= 2) {
			System.out.println(i);
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		System.out.println(sum);

		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));

		String string = "";
		for (int n = 846; 0 < n; n /= 2)
			string = (n % 2) + string;
		System.out.println(string);

		boolean[][] b = { { true, true, false, false }, { false, false, true, true } };
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j])
					System.out.print("[" + i + "][" + j + "]" + "*");
				else
					System.out.print("[" + i + "][" + j + "]" + " ");
			}
			System.out.println();
		}
		
		int []a= new int [10];
		for(int i=0;i<10;i++) {
			a[i]=9-i;
		}
		for(int i=0;i<10;i++) {
			a[i]=a[a[i]];
		}
		System.err.println(Arrays.toString(a));
		
	}

}
