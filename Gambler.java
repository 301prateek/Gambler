public class Gambler {

	public static void main(String[] args) {
		int totalMoney = 100;
		int betPerGame = 1;
		int totalWon = 0;
		int totalLost = 0;
		
		while(totalLost <= 50 || totalWon < 150) {
			double random = Math.floor(Math.random() * 2);
	
			if( random == 1) {
				betPerGame += 1;
				totalWon = totalMoney + betPerGame;
				System.out.println("Win => "+betPerGame);
				System.out.println("Total Win => "+totalWon);
			}
			else {
				betPerGame -= 1;
				totalLost = totalMoney - betPerGame;
				System.out.println("Loose => "+betPerGame);
				System.out.println("Total Lost => "+totalLost);
			}
		}
	}
}
