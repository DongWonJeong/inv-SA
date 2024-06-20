import java.util.Random;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {

        // 중복되지 않는 숫자 3개 뽑기
        int[] computer = new int[3];
        int[] user = new int[3];

        Random computerNum = new Random();

        System.out.println("컴퓨터가 숫자를 생성하였습니다. 숫자를 입력하세요.");

        //중복 확인하기
        do {
            for (int i = 0; i < computer.length; i++) {
                computer[i] = computerNum.nextInt(10);
            }
        } while (computer[0] == computer[1] || computer[0] == computer[2] || computer[1] == computer[2]);

        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        while (true) {
            attempts++;

            // 사용자로부터 숫자 입력 받기
            for (int number = 1; ; number++) {
                System.out.print(attempts + "번째 시도: ");
                for (int i = 0; i < user.length; i++) {
                    user[i] = scanner.nextInt();
                }

                //스트라이크, 볼
                int strikes = 0;
                int balls = 0;

                //배열의 길이만큼 컴퓨터와 유저 숫자 비교하기
                for (int i = 0; i < computer.length; i++) {
                    for (int j = 0; j < computer.length; j++) {
                        if (computer[i] == user[i]) {
                            if (i == j) {
                                strikes++;
                            } else {
                                balls++;
                            }
                            //결과
                            System.out.println(balls + "B" + strikes + "S");

                            //게임 종료
                            if(strikes == 3){
                                System.out.println(strikes + "S");
                                System.out.println( attempts + "번 만에 게임을 종료합니다.");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
