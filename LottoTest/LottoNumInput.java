package LottoTest;

import java.util.Scanner;

public class LottoNumInput {

	private int Lottoselect, LottoSheet;
	private static Scanner sn;
	

	public void GetLottoNum() {

		while (true) {
			System.out.println("자동입력은 1 , 직접입력은 2를 눌러주세요");
			sn = new Scanner(System.in);
			Lottoselect = sn.nextInt();
			try {

				if (Lottoselect == 1) {
					System.out.println("자동입력을 선택하였습니다.\n몇장을 사시겠습니까?");
					LottoSheet = sn.nextInt();

				} else if (Lottoselect == 2) {
					System.out.println("직접입력을 선택하였습니다.\n몇장을 사시겠습니까?");
					LottoSheet = sn.nextInt();
				}
			} catch (Exception e) {
			}
			if (Lottoselect == 1 || Lottoselect == 2)
				break;
			System.out.println("다시입력하세요");
		}

	}

	public int LottoSheetPass() {
		return LottoSheet;

	}

	public int LottoselectPass() {
		return Lottoselect;
	}

}
