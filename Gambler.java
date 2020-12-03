public class Gambler {

	public static void main(String[] args) {
		int totalMoney = 100;
		int betPerGame = 1;
		int totalWon = 0;
		int totalLost = 0;
		int totalDays = 0;
		int amtAfterWin = 0;
		int amtAfterLoss = 0;
		int wins = 0;
		int losses = 0;

		while(totalDays < 30) {
			int random = (int) Math.floor(Math.random() * 2);
			
			if( random == 1) {
				betPerGame += 1;
				totalWon = totalMoney + betPerGame;
				totalDays += 1;
				wins += 1;
				System.out.println("Day : "+totalDays);
				System.out.println("Win => "+betPerGame);
				System.out.println("Total Win => "+totalWon);
				
			}
			else {
				betPerGame -= 1;
				totalLost = totalMoney - betPerGame;
				totalDays += 1;
				losses += 1;
				System.out.println("Day : "+totalDays);
				System.out.println("Loose => "+betPerGame);
				System.out.println("Total Lost => "+totalLost);
			}
		}
		amtAfterWin = totalMoney + totalWon;
		System.out.println("Total Wins : "+wins+", Amount after Winnings in 30 days : "+amtAfterWin);
		amtAfterLoss = totalMoney - totalLost;
		System.out.println("Total Lost: "+losses+", Amount after Losing in 30 days : "+amtAfterLoss);
	}
}
