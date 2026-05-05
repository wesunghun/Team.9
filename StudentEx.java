
/**
 * StudentEx 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class StudentEx
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String name;
    private int stID;

    /**
     * StudentEx 클래스의 객체 생성자
     */
    public StudentEx(String name, int stID)
    {
        // 인스턴스 변수 초기화
        this.name = name;
        this.stID = stID;
    }

    public void calculateGugudan(int dan){
        System.out.println(this.name + "에게, \"" + dan + "단을 입력해주세요~\"");

        System.out.print("\"");

        for(int i = 1; i <= 9; i++){
            System.out.print(dan + "x" + i + "=" + (dan * i));

            if (i < 9){
                System.out.print(" ");
            }
        }

        System.out.println("\"\n");
    }
}