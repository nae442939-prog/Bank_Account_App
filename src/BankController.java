import java.util.Scanner;

public class BankController {
    
    private Scanner sc;
    private BankAccount account;
    private BankView view;
    private BankCommandHandler handler;

    public BankController() {
        this.sc = new Scanner(System.in);
        this.account = new BankAccount();
        this.view = new BankView();
        this.handler = new BankCommandHandler();
    }
   
    public void run() {
        while(true) {
            view.printMenu(account.getBalance());
            System.out.println("명령어 입력 > ");
            String input = sc.nextLine();
            

            if(input.equals("exit")) {
                view.printMessage("프로그램을 종료합니다");
                break;
            }
            handler.handle(input, account, view);
        }
    }
}
