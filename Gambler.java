public class Gambler {

	public static void main(String[] args) {
		int totalMoney = 100;
		int betPerGame = 1;

		double random = Math.floor(Math.random() * 2);

		if( random == 1) {
			betPerGame += 1;
			totalMoney += betPerGame;
			System.out.println("Win => "+betPerGame+" TotalMoney => "+totalMoney);
		}
		else {
			betPerGame -= 1;
			totalMoney = totalMoney - 1;
			System.out.println("Loose => "+betPerGame+" TotalMoney => "+totalMoney);
		}
	}
}
