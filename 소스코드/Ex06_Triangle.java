package Day01;

import java.util.Scanner;

/**
 * 삼각형의 밑변과 높이를 입력받아, 삼각형의 넓이를 구하는 프로그램
 * @author h
 *
 */
public class Ex06_Triangle {
	
	// main : ctrl + space
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이");
		System.out.print("밑변 : ");
		double width = sc.nextDouble();		// 실수(double)값 하나를 입력받음
		
		System.out.print("높이 : ");
		double height = sc.nextDouble();	// 실수(double)값 하나를 입력받음
		
		// 삼각형의 넓이 구하는 공식
		// (넓이) = (밑변) x (높이) / 2
		double area = width * height / 2;
		System.out.println("넓이 : " + area);
		
		sc.close();
	}

}




