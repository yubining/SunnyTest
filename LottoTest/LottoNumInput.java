package LottoTest;

import java.util.Scanner;

public class LottoNumInput {

	private int Lottoselect, LottoSheet;
	private static Scanner sn;
	

	public void connectCustomer() {

		while (true) {
			System.out.println("�ڵ��Է��� 1 , �����Է��� 2�� �����ּ���");
			sn = new Scanner(System.in);
			Lottoselect = sn.nextInt();
			try {

				if (Lottoselect == 1) {
					System.out.println("�ڵ��Է��� �����Ͽ����ϴ�.\n������ ��ðڽ��ϱ�?");
					LottoSheet = sn.nextInt();

				} else if (Lottoselect == 2) {
					System.out.println("�����Է��� �����Ͽ����ϴ�.\n������ ��ðڽ��ϱ�?");
					LottoSheet = sn.nextInt();
				}
			} catch (Exception e) {
			}
			if (Lottoselect == 1 || Lottoselect == 2)
				break;
			System.out.println("�ٽ��Է��ϼ���");
		}

	}

	public int getLottoSheet() {
		return LottoSheet;

	}

	public int getLottoselect() {
		return Lottoselect;
	}

}
