package week02.operator;

public class W02 {
    public static void main(String[] args) {
        // 사칙연산
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        System.out.println(4%2);

        //우선순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        //변수를 이용한 연산
        int a = 10;
        int b = 20;
        int c;

        //덧셈
        c = a+b;
        System.out.println(c);

        //뺄셈
        c = a-b;
        System.out.println(c);

        //곱셈
        c = a*b;
        System.out.println(c);

        //나눗셈
        c = a/b;
        System.out.println(c);

        //나머지
        c = a%b;
        System.out.println(c);
    }
}
