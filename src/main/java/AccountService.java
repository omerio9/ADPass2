public interface AccountService {
    public void transferMoney(
            String sourceAccountId, String targetAccountId, double amount);

    public void depositMoney(String accountId, double amount) throws Exception;
    public Account getAccount(String accountId);

}
