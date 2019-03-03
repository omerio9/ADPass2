import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.*;

public class AccountTest extends TestCase {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown()throws Exception{

    }
             @Test
                    public void test_Acc_balance() {
                 AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
                 AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
                System.out.println("Account 1 balance :" + accountService.getAccount(String.valueOf(1234)).getBalance());
                System.out.println("Account 2 balance :" + accountService.getAccount(String.valueOf(2456)).getBalance());
            }

}
