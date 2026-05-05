
/**
 * MyApp 클래스의 설명을 작성하세요.
 *학생 4명 중 한 명에게 구구단을 물어보고 계산하여 답을 해주는 프로그램
 * @author (2023320024위성훈, 2023320045 김동균, 2023320017 정윤재, 2023320002 노승렬)
 * @version (2026.05.05)
 */
import java.util.Scanner;
public class MyApp
{
    public static void main(String[] args){
        Student jenna = new Student("Jenna", 2005);
        Student john = new Student("John", 2010);
        Student maria = new Student("Maria", 2029);
        Student james = new Student("James", 2009);

        Scanner scan = new Scanner(System.in);
        System.out.println("누구에게 몇 단을 물어보시겠습니까?");
        String nameInput = scan.next();
        int danNum = scan.nextInt();

        if (nameInput.equals("Jenna")){
            jenna.calculateGugudan(danNum);
        } else if(nameInput.equals("John")){
            john.calculateGugudan(danNum);
        } else if(nameInput.equals("Maria")){
            maria.calculateGugudan(danNum);
        } else if(nameInput.equals("James")){
            james.calculateGugudan(danNum);
        } else{
            System.out.println("없는 학생입니다.");
        }
    }
}