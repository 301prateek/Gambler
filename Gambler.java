public class Gambler {

	public static void main(String[] args) {
		int totalMoney = 100;
		int betPerGame = 1;
		int totalWon = 0;
		int totalLost = 0;
		int totalDays = 0;
		
		while(totalDays < 20) {
			double random = Math.floor(Math.random() * 2);
	
			if( random == 1) {
				betPerGame += 1;
				totalWon = totalMoney + betPerGame;
				totalDays += 1;
				System.out.println("Day : "+totalDays);
				System.out.println("Win => "+betPerGame);
				System.out.println("Total Win => "+totalWon);
				
			}
			else {
				betPerGame -= 1;
				totalLost = totalMoney - betPerGame;
				totalDays += 1;
				System.out.println("Day : "+totalDays);
				System.out.println("Loose => "+betPerGame);
				System.out.println("Total Lost => "+totalLost);
			}
		}
	}
}
