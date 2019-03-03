import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AccountTest extends TestCase {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

             AccountService accountService = applicationContext.getBean("accountService",AccountService.class);

             @Test
                    public void test_Acc_balance() {
                System.out.println("Account 1 balance :" + accountService.getAccount(String.valueOf(1234)).getBalance());
                System.out.println("Account 2 balance :" + accountService.getAccount(String.valueOf(2456)).getBalance());
            }

}
