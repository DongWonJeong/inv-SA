package code;

import java.util.Random;
import java.util.Scanner;

public class SpartaProject {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //랜덤 숫자 3가지 뽑기   + 숫자 중복 없애기 //i(0),i(1)j(0),i(2)j(0,1),i(3)j(0,1,2)이런식으로 비교해서 중복 없게 하는..
        int [] numbers = new int[3];  //숫자3칸

        for (int i = 0; i< numbers.length; i++) {  //i는 length보다 작을때까지 돌아감.
            numbers[i] = random.nextInt(9) + 1; //0~9까지 숫자!'
            for(int j=0; j< i; j++) {   //첫번째 i숫자를 뽑아서, j가 i보다 작을때까지
                if(numbers[i] == numbers[j]) {
                    i--;
                    break;
                    //만약 Number에서 i랑 j가 같은 숫자가 나온다면 다시 하도록, 같은게 없을때까지 뽑아야하니깐
                    //다시 값을 뽑도록 해야함.
                }
            }
        }
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

        System.out.println("숫자를 입력하세요:");
        int count = 1; //시도횟수

        while (true) {
            String userInput = scanner.nextLine();

            //사용자가 입력한 값이 3자리가 맞는지 OR 숫자만 쳤는지
            if (userInput.length() == 3) {

                count++;
            } else {
                System.out.println("숫자 3개를 입려하세요:");
                continue;
            }
            int strike = 0;
            int ball = 0;

            //사용자 입력을 숫자 배열로 변환
            int [] users = new int[3];
            for (int i = 0; i < 3; i++) {
                users[i] = Character.getNumericValue(userInput.charAt(i));
            }  //Character.getNumericValue(문자(char)를 숫자(int)로 변환하는 메서드)

            //numbers랑 users 가 같다면 strike/ 아니라면 ball
            for (int i=0; i<numbers.length; i++) {
                for (int j=0; j< users.length; j++) {
                    if(numbers[i] == users[j]) {
                        if(i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            System.out.println(count + "번째 시도: " + userInput);
            System.out.println(strike + "S " + ball + "B");
            //모든 숫자와 위치가 맞으면 종료
            if (strike == 3 ) {
                System.out.println(count + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
