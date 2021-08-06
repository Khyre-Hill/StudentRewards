package assg2_hilkh19;

/*
 * author - Khyre Hill
 */
public class RewardsAccount extends StudentAccount  {

	public double reward;
	
	
	public RewardsAccount() {
		reward = 0;
	}
	
	public RewardsAccount(double balance) {
		if(balance >= 100)
			reward = 5.0;
	}
	
	
	/*
	 * gets reward balance
	 */
	public double getRewards() {
		return reward;
	}
	
	
	/*
	 * shows that if balance is at least $25 then can be credited reward
	 * once reward is gifted the balance must be set back to 0
	 */
	public double reedemRewards() {
		if(this.reward >= 25) {
			double balance = getBal();
			setBal(balance + reward);
			reward = 0;
		}
		else {
			System.out.println("Insufficient amount for redeeming rewards.");
		}
	
	
}
	
	
	/*
	 * returns string in a specific format
	 */
	public String ToString() {
		return "Account number:" + getAccNum() + "Current Balance:" + getBal() + "Rewards Balance:" + this.reward;
	}
	
	
	/*
	 * if deposit amount is at least $100 then add a $5 reward
	 */
	public void deposit(double amount) {
		if (amount > 0) {
			double balance = getBal();
			setBal(balance + amount);
			if (amount >= 100)
				reward += 5;
			System.out.println("The account balance sucessfully updated. ");
		}
	}
	
	
	/*
	 * prints all info to the screen
	 */
	public void printInfo() {
		System.out.println("Account number:" + getAccNum());
		System.out.println("Current balance:" + getBal());
		System.out.println("Rewards balance:" + reward);
	}
	
	
}
