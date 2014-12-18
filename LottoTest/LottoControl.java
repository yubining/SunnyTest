package LottoTest;


class LottoControl {

	private int LottoSheet;
	int result;
	private int[] matchnum, number, UserInput;

	LottoNumInput LottoIn;
	LottoExam LottoEx;
	LottoOutput LottoOut;

	public void Controller() {

		LottoIn = new LottoNumInput();
		LottoIn.connectCustomer();
		LottoSheet = LottoIn.getLottoSheet();
		int Select = LottoIn.getLottoselect();

		for (int i = 0; i < LottoSheet; i++) {
			LottoEx = new LottoExam();
			LottoEx.OutoLotto(Select);
			LottoEx.ManualLotto(Select);
		}
		LottoEx.WinLotto();
		LottoEx.BonusLotto();

		LottoOut = new LottoOutput();
		LottoOut.GetOut(LottoSheet);

	}
	public static void main(String[] args) {
		LottoControl con = new LottoControl();
		con.Controller();
	}
}
