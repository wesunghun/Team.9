
/**
 * Student 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Student
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String name;
    private int stID;
    
    /**
     * Student 클래스의 객체 생성자
     */
    public Student(String name, int stID)
    {
        // 인스턴스 변수 초기화
        this.name = name;
        this.stID = stID;
    }
    
    /**
     * Student 클래스의 객체 생성자
     */
    public Student(String name)
    {
        // 인스턴스 변수 초기화
        this.name = name;
    }
    
    /**
     * Student 클래스의 객체 생성자
     */
    public Student(int stID)
    {
        // 인스턴스 변수 초기화
        this.stID = stID;
    }
    
    /**
     * Student 클래스의 객체 생성자
     */
    public Student()
    {
        // 인스턴스 변수 초기화
        
    }
    
    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
<<<<<<< HEAD
    public void calculateGugudan()
    {
        // 여기에 코드를 작성하세요.
        for (int row = 1; row < 10; row++){
            for (int col = 1; col < 10; col++){
                System.out.print(row + "x" + col + "=" + (row * col));
            }
        }
        System.out.println();
=======
    public void calculateGugudan(int dan)
    {
        // 여기에 코드를 작성하세요.
        return x + y;
>>>>>>> a383ade45bd395fc2faaeb37052f197379bf55aa
    }
}