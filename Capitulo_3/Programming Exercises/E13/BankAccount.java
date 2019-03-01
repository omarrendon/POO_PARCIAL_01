package cap03;

public class BankAccount {
	Integer accNumber;
	String ownerName;
	Double balance;
	public BankAccount() {
		accNumber = 11111;
		ownerName = "No name";
		balance = 0.0;
	}
	public void setAccNumber(Integer accNumber) {
		this.accNumber = accNumber;
	}
	public void setOwnerName(String name) {
		ownerName = name;
	}
	public void setBalance(Double money) {
		balance = money;
	}
	public Integer getAccNumber() {
		return accNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public Double getBalance() {
		return balance;
	}
	public void deductMonthlyFee() {
		balance-=4;
	}
	public static void explainAccountPolicy() {
		System.out.println("The $4 service fee will be deducted each month");
	}
	
	
}
