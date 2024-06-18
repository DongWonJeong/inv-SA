package week02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String collection = sc.nextLine();
        String title = sc.nextLine();

        if(Objects.equals(collection, "List")){
            ArrayList<String> strList = new ArrayList<>();
            while(true){
                String recipy = sc.nextLine();
                if(Objects.equals(recipy, "끝")){
                    break;
                }
                strList.add(recipy);
            }
            title = "[" + collection + "으로 저장된" + title + "]";
            System.out.println(title);

            for(int i=0; i < strList.size(); i++) {
                int number = i+1;
                System.out.println(number + "." + strList.get(i));
            }
        } else if(Objects.equals(collection, "Set")){
            LinkedHashSet<String> strSet = new LinkedHashSet<>();
            while(true){
                String recipy = sc.nextLine();
                if(Objects.equals(recipy, "끝")){
                    break;
                }
                strSet.add(recipy);
            }
            title = "[" + collection + "으로 저장된" + title + "]";
            System.out.println(title);

            int i = 1;
            for (String text : strSet){
                System.out.println(i + "." + text);
                i++;
            }
        } else if(Objects.equals(collection, "Map")){
            Map<Integer, String> strMap = new HashMap<>();
            int lineNumber = 1;
            while(true) {
                String recipy = sc.nextLine();
                if (Objects.equals(recipy, "끝")) {
                    break;
                }
                strMap.put(lineNumber++, recipy);
            }
            title = "[" + collection + "으로 저장된" + title + "]";
            System.out.println(title);

            for (int i = 0; i < strMap.size(); i++) {
                int number = i + 1;
                System.out.println(number + ". " + strMap.get(i + 1));
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
