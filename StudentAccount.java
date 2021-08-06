package assg2_hilkh19;

/*
 * author - Khyre Hill
 */

public class StudentAccount {

	private int AccNum;
	private double Bal;
	private static int counter = 0;
	
	
	/*
	 * param balance type double
	 */
	public StudentAccount(double balance){
		this.Bal = balance;
		++counter;
		AccNum = counter;
	}
	
	
	/*
	 * base constructor named studentaccount
	 */
	public StudentAccount() {
		this.Bal = 0;
		++ counter;
		AccNum = counter;
	}
	
	
	/*
	 * returns account number (AccNum)
	 */
	public int getAccNum() {
		return AccNum;
	}
	
	
	/*
	 * returns the balance (Bal)
	 */
	public double getBal() {
		return Bal;
	}
	
	
	/*
	 * Sets Balance 
	 * 
	 */
	public void setBal(double balance) {
		this.Bal = balance;
	}
	
	
	/*
	 * returns counter get method
	 * number of accounts created
	 */
	public static int getcounter() {
		return counter;
	}
	
	
	/*
	 * prints out deposit
	 * shows how much will be deposited into account
	 */
	public void deposit(double amount) {
		if (amount > 0) {
			this.Bal += amount;
			System.out.println("The account balance sucessfully updated");
		}
	}
	
	
	/*
	 * shows how much will be charged to the account 
	 * double value as parameter
	 */
	public void charge(double amount) {
		if (amount > 0) {
			this.Bal -= amount;
			System.out.println("The account balance sucessfully updated");
		}
	}
	
	
	/*
	 * sets parameter type double amount
	 * StudentAccount ba = balance amount
	 * allows money transfer
	 */
	public void transferIn(StudentAccount ba, double amount) {
		if(amount > 0) {
			this.Bal -= amount;
			ba.Bal += amount;
		}
	}
	
	/*
	 * ba = balance amount
	 * dont get this confused with transfer in
	 */
	public void transferOut(StudentAccount ba, double amount) {
		if(amount > 0) {
			this.Bal += amount;
			ba.Bal -= amount;
		}
	}
	
	/*
	 * prints account information to screen
	 */
	public void PrintInfo() {
		System.out.println("Account Number" + this.AccNum);
		System.out.println("Current Balance" + this.Bal);
	}
	
	/*
	 * returns string in specific format
	 */
	public String toString() {
		return "Account Number: " + this.AccNum + "Current balance: + this.Bal";
	}
}
