import java.util.Random;
import java.util.Scanner;

public class FirstTest_int {
    public static void main(String[] args) {
        // computer random number, user random number
        int[] computer = new int[3];
        int[] user = new int[3];

        // Random 메서드
        Random computerNum = new Random();

        // computer <- Random number
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        for(int i=0; i<computer.length; i++){
            computer[i] = computerNum.nextInt(10);
            // 모두 같을 때
            if(computer[0] == computer[1] && computer[0] == computer[2]){
                for(int j=0; j<computer.length; j++){
                    computer[j] = computerNum.nextInt(10);
                }
            }
        }

        //user -> number
        Scanner input = new Scanner(System.in);

        for(int number = 1; ;number++){
            System.out.print(number + "번쨰 시도 : ");
            for(int i=0; i<user.length; i++){
                user[i] = input.nextInt();
            }

            int strike = 0;
            int ball = 0;

            // computer 와 user 숫자 비교
            for(int i=0; i<computer.length; i++){
                for(int j=0; j<user.length; j++){
                    if(computer[i] == user[j]){
                        if(i==j){
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            System.out.println(ball + "B" + strike + "S");
            // 3S일때 프로그램 종료
            if(strike == 3){
                System.out.println(strike + "S");
                System.out.println(number+"번 만에 게임을 종료합니다.");
                break;
            }
        }
    }
}
