import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

        public static void main(String[] args) throws Exception {
            AnnotationConfigApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(AppConfig.class);

            AccountService accountService = applicationContext.getBean("accountService",
                    AccountService.class);

            System.out.println("Before Transaction");
            System.out.println("");
            System.out.println("Account 1 balance :" + accountService.getAccount(String.valueOf(1234)).getBalance());
            System.out.println("Account 2 balance :" + accountService.getAccount(String.valueOf(2456)).getBalance());
            accountService.transferMoney("1234", "2456", 5.0);
            System.out.println("After Transfer");
            System.out.println("Account 1 balance :" + accountService.getAccount("1234").getBalance());
            System.out.println("Account 2 balance :" + accountService.getAccount("2456").getBalance());
        }
    }