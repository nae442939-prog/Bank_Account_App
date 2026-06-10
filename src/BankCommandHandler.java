public class BankCommandHandler {

    public void handle(String input, BankAccount account, BankView view) {

        String[] parts = input.split(" ");
        String cmd = parts[0];

        if(cmd.equals("save")) {

            int amount = Integer.parseInt(parts[1]);
            account.deposit(amount);

            view.printMessage(amount + "원이 예금되었습니다");

        } else if(cmd.equals("take")) {

            int amount = Integer.parseInt(parts[1]);

            if(account.withdraw(amount)) {
                view.printMessage(amount + "원이 출금 되었습니다");
            } else {
                view.printError("잔액이 부족합니다");
            }

        } else if(cmd.equals("show")) {

            view.printBalance(account.getBalance());

        } else if(cmd.equals("send")) {

            if(parts.length < 3) {
                view.printError("사용법 : send 이름 금액");
                return;
            }

            String target = parts[1];
            int amount = Integer.parseInt(parts[2]);

            if(account.withdraw(amount)) {

                view.printMessage(
                    target + "님에게 " + amount + "원을 송금했습니다."
                );

            } else {

                view.printError("잔액이 부족합니다.");

            }

        } else if(cmd.equals("history")) {

            view.printMessage(account.getHistory());

        } else {

            view.printError("존재하지 않는 명령어 입니다");

        }
    }
}