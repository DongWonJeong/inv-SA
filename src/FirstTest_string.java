import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class FirstTest_string {
    public static void main(String[] args) {
        // computer random number, user number
        String[] computer = new String[3];
        String[] user = new String[3];

        // Random 메서드
        Random random = new Random();

        // computer <- Random number
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        for (int i = 0; i < computer.length; i++) {
            // 정수를 문자열로 변환하여 저장
            computer[i] = Integer.toString(random.nextInt(10));

            // 모두 같을 때
            for (int j = 0; j < i; j++) {
                if (computer[i].equals(computer[j])) {
                    i--;
                    break;
                }
            }
        }

        Scanner input = new Scanner(System.in);

        for (int number = 1; ; number++) {
            System.out.print(number + "번째 시도 : ");
            String userInput = input.nextLine();


            for (int i = 0; i < user.length; i++) {
                // 입력을 문자열 배열로 변환
                user[i] = Character.toString(userInput.charAt(i));
            }

            int strike = 0;
            int ball = 0;

            // computer 와 user 숫자 비교
            for (int i = 0; i < computer.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (Objects.equals(computer[i], user[j])) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            // 3S일 때 프로그램 종료
            if (strike == 3) {
                System.out.println(strike + "S");
                System.out.println(number + "번 만에 게임을 종료합니다.");
                break;
            }
            System.out.println(ball + "B" + strike + "S");
        }
    }
}
