
/**
 * MainEx 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MainEx
{
    public static void main(String[] args){
        StudentEx s1 = new StudentEx("Jenna", 2005);
        StudentEx s2 = new StudentEx("John", 2010);
        StudentEx s3 = new StudentEx("Maria", 2029);
        StudentEx s4 = new StudentEx("James", 2009);
        
        s1.calculateGugudan(4);
        s4.calculateGugudan(7);
        s2.calculateGugudan(2);
        s3.calculateGugudan(9);
    }
}