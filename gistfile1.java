package ua.kiev.prog.test3;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysHomeWork4 {

	public static void main(String[] args) {
		int[] a;
		Scanner scanner = new Scanner(System.in);
		int N; 
		float Res=0;
		System.out.print("Введите размерность массива: ");
		N = scanner.nextInt();
		scanner.close();
		a = new int[N];
		for (int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10);
			Res+=a[i];
		}
		System.out.println("Заполненный массив: "+Arrays.toString(a));
		System.out.println("Сумма элементов массива: "+Res);
		Res = Res / a.length;
		System.out.println("Среднее арифметическое элементов массива: "+Res);
		

	}

}
