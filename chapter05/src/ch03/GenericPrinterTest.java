package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 사용할 때 자료형을 넣어 주면 된다.
		// 사용방법 ; T 대신에 사용할 때 어떤 자료형을 사용할지 지정해 주면 된다.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();

		// 재료 넣기
		genericPrinter1.setMaterial(powder);

		// 재료 꺼내기
		Powder tempPowder = genericPrinter1.getMaterial();
		System.out.println(tempPowder);

		System.out.println("-----------------------------");
		// 문제 1. 프라스틱으로 제네릭 클래스를 선언하고 재료 셋팅 후 재료를 꺼내 봅니다.

		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		genericPrinter2.setMaterial(plastic);
		Plastic plastic2 = genericPrinter2.getMaterial();
		System.out.println(plastic2);
		
		System.out.println("------------------");
		//GenericPrinter toString();
		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);

	}

}



