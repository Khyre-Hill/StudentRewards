package assg2_hilkh19;

/*
 * author - Khyre Hill
 */
public class StudentAccountDemo {

	public static void main(String[] args) {
		
		/*
		 * calls default constructor
		 * constructor called to $500 balance
		 * creates rewards account with no balance in it
		 * creates rewards account with $500 balance
		 */
		StudentAccount studentA = new StudentAccount();
		StudentAccount studentB = new StudentAccount(500);
		RewardsAccount studentC = new RewardsAccount();
		RewardsAccount studentD = new RewardsAccount(500);
		
		/*
		 * test all methods using created values
		 */
		studentA.setBal(100);
		studentA.charge(50);
		studentA.deposit(100);
		System.out.println("Account Number:" + studentA.getAccNum());
		System.out.println("StudentA Balance:" + studentA.getBal());
		studentA.transferIn(studentB, 600);
		studentC.transferOut(studentD, 700);
		
		
		/*
		 * prints all student info onto screen
		 */
		studentA.PrintInfo();
		studentB.PrintInfo();
		studentC.PrintInfo();
		studentD.PrintInfo();
	}

}


