package bank;

public class BankServiceImpl implements BankService {

	private AccountBean account;

	@Override
	public String openAccount(String name, int password) {
		// 계좌 개설
		account = new AccountBean(name, password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		// 입금
		int smoney =account.getMoney()+ money;
		account.setMoney(smoney);
		return account.toString();
		
	}

	@Override
	public String withdraw(int money) {
		// 출금
		int tmoney =account.getMoney()- money;
		account.setMoney(tmoney);
		return account.toString();
	}

	@Override
	public String findMoney() {
		// TODO Auto-generated method stub
		return null;
	}
}
