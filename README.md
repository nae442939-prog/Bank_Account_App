# Bank_Account_App — 콘솔 은행 계좌

더조은컴퓨터아카데미 풀스택 부트캠프 Java 실습 (2026.06)

예금 · 출금 · 송금 · 거래 내역을 명령어로 다루는 콘솔 프로그램입니다.
계좌(Model) · 화면(View) · 흐름(Controller) · 명령 처리(CommandHandler)로 나눠 MVC 구조를 연습했고,
잔액보다 많이 출금하는 것 같은 잘못된 입력은 오류 메시지로 알려 줍니다.

| 명령어 | 하는 일 |
|---|---|
| `save 금액` | 예금 |
| `take 금액` | 출금 |
| `show` | 잔액 조회 |
| `send 이름 금액` | 송금 |
| `history` | 거래 내역 |
| `exit` | 종료 |

## 실행

JDK 를 설치한 뒤 VS Code 에서 `src/BankApp.java` 를 실행합니다.
