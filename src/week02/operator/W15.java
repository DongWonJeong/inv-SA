package week02.operator;

public class W15 {
    public static void main(String[] args) {
        // for문
        // (초기값; 조건문; 증가연산)
//        for(int i=0; i<4; i++){
//            System.out.println(i+"번째 출력!");
//        }

        //향상된 for문
        //배열과 함께 사용
//        int[] numbers = {3,6,9,1,2,15};
//        for(int i: numbers){
//            System.out.print(i+" ");
//        }

        int[] numbers = {3,6,9,1,2,15};
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
