package ch04;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUM_SIZE = 6;

	public int[] getLottoNumber() {
		// ��ȣ�� ���� ���� �����
		int[] numbers = new int[LOTTO_NUM_SIZE];  
		Random random = new Random(); 
		
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1;
			numbers[i] = selectedNumber;
			// i -> 0 (���� x) 
			// i -> 1(��ȣ�� �ΰ� ����� ����)  ( J : 0 ��° ���� )
			// i���� 1��° �ε����� 0��° �ε����� ���� ������ Ȯ��
			// i���� 2��° �ε����� 0, 1, �ε����� ���� ������ Ȯ�� 
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i = i - 1;
					break; 
				}
			}
		}
		// �迭 ���� 
		Arrays.sort(numbers);
		return numbers; 
	}
	
	// �׽�Ʈ �ڵ� 
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber(); 
		int[] nums = lottoNumber.getLottoNumber();
		for (int i : nums) {
			System.out.print(i + "\t");
		}
	}
}