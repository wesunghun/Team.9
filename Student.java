
/**
 * Student 클래스의 설명을 작성하세요.
 *Student객체를 생성하고 구구단을 계산하는 메소드
 * @author (2023320024위성훈, 2023320045 김동균, 2023320017 정윤재, 2023320002 노승렬)
 * @version (2026.05.05)
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
     * 구구단을 계산하는 메소드
     *
     * @param  dan  메소드의 파라미터
     * 
     */
    public void calculateGugudan(int dan)
    {
        // 여기에 코드를 작성하세요.
        for (int i = 1; i < 10; i++){
            System.out.print(dan + "x" + i + "=" + (dan * i));
            System.out.print("\t");
        }
        System.out.println();
    }
}