package bank;

/**
 *@file : BankServiceImpl.java 
 *@author inhyeon
 *@date 2016. 3. 10.
 *@story 뱅크 서비스 비즈니스 로직
 */
public  class AdminBankServiceImpl2 implements AdminBankService2{

	private AccountBean[] accountList;//전체 계좌를 보관하는 객체
	private int count; //전체 통장 계좌 수
	
	public AdminBankServiceImpl2(int size) {
		// accountList 를 초기화 해줌
		accountList = new AccountBean[size];
	}
	
	@Override
	public String openAccount(String name, int password) {
		//계좌번호로 계좌 조회(반드시 하나만 검색됨)
		AccountBean bean = new AccountBean(name, password);
		count++;
		return bean.toString();
	}

	@Override
	public AccountBean findAccountByAccountNo(int accountNo) {
		// 이름으로 계좌 조회(복수개의 결과가능)
		return null;
	}

	@Override
	public AccountBean[] findAccountsByName(String name) {
		// 계좌 해지
		AccountBean[] tempList = new AccountBean[countByName(name)];
		
		
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 계좌 해지
		// 유효성 체크
		for (int i=0; i<count; i++)
		{
			if(true)
			{
				accountList[i]=null;
			}
		}
		return null;
	}

	@Override
	public int countAll() {
		// 전체 계좌수 조회
		return count;
	}

	@Override
	public int countByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
