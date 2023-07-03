package exceptions;

class WithDrawException extends RuntimeException {
	public WithDrawException(String msg) {
		super(msg);
	}
}

class BalanceException extends WithDrawException {
//	class BalanceException extends RuntimeException {
//	class BalanceException extends Exception { // will give a error, can not be a 'check' exception

	public BalanceException(String msg) {
		super(msg);
	}

}

public class Account {

	double balance;

	public void withdraw(double amount) {
		try {
			throw new BalanceException("Do not implemented");
		} catch (WithDrawException error) {
			throw new RuntimeException(error.getMessage());
		}
	}

	public static void main(String[] args) {

		try {
			Account acc = new Account();
			acc.withdraw(500.0);
		} catch (WithDrawException error) {
			System.out.println(error.getMessage());
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}

	}

}