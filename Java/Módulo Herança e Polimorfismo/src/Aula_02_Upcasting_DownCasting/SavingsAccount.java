package Aula_02_Upcasting_DownCasting;

public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number,holder,balance);//passando os parâmetros desse classe p/ o construtor mãe (Account)
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	public void updateBalance() {
		//balance é o atributo protected da classe Account
		balance+=balance * interestRate;//pega o balance e calcula com base na taxa de juros.
		//1000 = 1000 + 1000 * 5%(0,05) = 1050
	}
	
	
	  
}
