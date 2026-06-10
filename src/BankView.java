public class BankView {

    public void printMenu(int balance) {

        System.out.println("나의 은행 계좌");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("현재 잔액은 " + balance + "원 입니다");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|예금: save 금액|출금: take 금액|조회: show|송금: send 이름 금액|거래내역: history|종료: exit");
        System.out.println("--------------------------------------------------------------------");
    }

    public void printBalance(int balance) {
        System.out.println("현재 잔액 " + balance + "원");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printError(String error) {
        System.out.println("[오류] " + error);
    }
}