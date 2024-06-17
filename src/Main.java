// 클래스
// public : 제어자
import java.util.Scanner;
public class Main {

     // JDK 역할
    // 1. compiler: .java -> .class, 2.JRE, 3. JDB:디버깅

    // main 메소드 -> 자바 프로젝트는 제일 먼저 클래스의 main 메소드를 실행.
    // void : 매서드의 출력값의 데이터 타입.(출력X)

    //input
    //Sring[] args : 매개변수 자리
    public static void main(String[] args) {

        //객체 : 특징(속성, 변수), 행동(메소드)
        //print : 줄 바꿈 x
        //println : 줄 바꿈 O
        //변수 선언 : 타입 이름 = 값;
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        double score = sc.nextDouble();
        sc.nextLine();
        String recipe1 = sc.nextLine();
        String recipe2 = sc.nextLine();
        String recipe3 = sc.nextLine();
        String recipe4 = sc.nextLine();
        String recipe5 = sc.nextLine();
        String recipe6 = sc.nextLine();
        String recipe7 = sc.nextLine();
        String recipe8 = sc.nextLine();
        String recipe9 = sc.nextLine();
        String recipe10 = sc.nextLine();

        int int_score = (int)score;
        double persent_score = (int_score * 100)/5;

        System.out.println("[" + title + "]");
        System.out.println("별점: " + int_score + "(" + persent_score +"%)");
        System.out.println("1." + recipe1);
        System.out.println("2." + recipe2);
        System.out.println("3." + recipe3);
        System.out.println("4." + recipe4);
        System.out.println("5." + recipe5);
        System.out.println("6." + recipe6);
        System.out.println("7." + recipe7);
        System.out.println("8." + recipe8);
        System.out.println("9." + recipe9);
        System.out.println("10." + recipe10);
    }
}
