
/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
import java.util.Scanner;
public class MyApp
{
    public static void main(String[] args){
        Student jenna = new Student("Jenna", 2005);
        Student john = new Student("John");
        Student maria = new Student(2029);
        Student james = new Student();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("누구에게 몇 단을 물어보시겠습니까?(이름과 단수를 공백으로 분리하여 입력하세요.)");
        String nameInput = scan.next();
        String danInput = scan.nextInt();
        while(true){
        if (nameInput.equals("Jenna")){
            jenna.calculateGugudan();
            break;
        } else{
            System.out.println("이름을 다시 입력하십시오.");
        }
        }
    }
}