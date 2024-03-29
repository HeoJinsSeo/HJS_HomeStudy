package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		int sum = x + y + z;
		// 강제형변환 : (double) sum / 3
		double avg =(double) sum / 3;		// double 실수형
		// sum = (int) avg;
		
		// 자동 형변환
		// - 작은타입을 큰타입에 대입할 때, 자동으로 큰 타입으로 변환되는 것
		// 강제 형변환
		// - 큰타입을 작은타입에 대입할 때, 명시적으로 타입을 변환하는 것
		
		// sum(int) + 3(int)
		// (int) + (int) = (int) 
		//   10  /   3   =  3.3333...  
		//   10  /   3   =  3 (정수타입이라서 소수점 표현 불가)
		// int 타입끼리 연산하면 결과도 int
		
		// (정수) + (실수)	= (실수)
		// (int) + (double) = (double)
		//  4byte    8byte
		// 일반적으로, 작은타입과 큰타입 연산하면 연산결과는 큰타입이 된다.
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		sc.close();
		
	}

}
