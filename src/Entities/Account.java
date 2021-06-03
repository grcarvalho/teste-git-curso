package Entities;

public class Account {
private String holder;
private int number; 
private double amount;

public Account(String holder, int number) {
	super();
	this.holder = holder;
	this.number = number;
}

public Account(String holder, int number, double amount) {
	super();
	this.holder = holder;
	this.number = number;
	this.amount = amount;
}

public String getHolder() {
	return holder;
}
public void setHolder(String holder) {
	this.holder = holder;
}
public void withdraw(double withdraw) {
	amount = amount - withdraw - 5.00;
}

public void deposit(double deposit) {
	amount += deposit;
}

@Override
public String toString() {
	return "Account " + number + ", Holder: " + holder +", Balance: $ " + String.format("%.2f", amount);
}


}
