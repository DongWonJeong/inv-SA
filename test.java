import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] computer = new int[3];
        int[] user = new int[3];
        Random computerNum = new Random();

        System.out.println("컴퓨터가 숫자를 생성하였습니다. 숫자를 입력하세요.");

        // 중복되지 않는 숫자 3개 뽑기
        for (int i = 0; i < computer.length; i++) {
            boolean unique;
            do {
                unique = true;
                computer[i] = computerNum.nextInt(10);
                for (int j = 0; j < i; j++) {
                    if (computer[i] == computer[j]) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
        }

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            attempts++;

            System.out.print(attempts + "번째 시도: ");
            for (int i = 0; i < user.length; i++) {
                user[i] = scanner.nextInt();
            }

            int strikes = 0;
            int balls = 0;

            // 스트라이크와 볼 계산
            for (int i = 0; i < computer.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (computer[i] == user[j]) {
                        if (i == j) {
                            strikes++;
                        } else {
                            balls++;
                        }
                    }
                }
            }

            System.out.println(balls + "B " + strikes + "S");

            // 게임 종료 조건
            if (strikes == 3) {
                System.out.println(strikes + "S");
                System.out.println(attempts + "번 만에 게임을 종료합니다.");
                break;
            }
        }

    }
}
