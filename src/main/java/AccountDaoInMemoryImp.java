import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccountDaoInMemoryImp implements AccountDao {


    private Map<String, Account> accountsMap = new HashMap<>();
   // Set<Map> set = new HashSet<Map>(accountsMap);

    Account account1 = new Account();
    Account account2 = new Account();
    {


        account1.setId("1234");
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        account2.setId("2456");
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);
        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);





    }
        @Override
        public void insert (Account account){
        accountsMap.put(account.getId(), account);

    }
        @Override
        public void delete (Account account){
        accountsMap.remove(account.getId(), account);

    }
        @Override
        public void update (Account account){
        accountsMap.put(account.getId(), account);

    }
        @Override
        public Account find ( String accountId){
        return accountsMap.get(accountId);
    }



}