package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        //최대값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        //최대값 초기화 세팅
        int max = arr[0];

        //최대값 구하는 로직
        for(int i: arr){
            if(i>max){
                max = i;
            }
        }
        System.out.println("최대값은 => "+ max);
    }
}
