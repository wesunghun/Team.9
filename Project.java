
/**
 * Project 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Project
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 변경하세요.
    private String name;
    private String stID;
    private int dan;

    /**
     * Project 클래스의 객체 생성자
     */
    public Project()
    {
        // 인스턴스 변수 초기화
        this.name = "";
        this.stID = "";
        this.dan = 0;
    }

    /**
     * Project 클래스의 객체 생성자
     */
    public Project(String name,String stID, int dan)
    {
        // 인스턴스 변수 초기화
        this.name = name;
        this.stID = stID;
        this.dan = dan;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public String getName()
    {
        // 여기에 코드를 작성하세요.
        return name;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String getSTID()
    {
        // 여기에 코드를 작성하세요
        return stID;
    }
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public int getDan()
    {
        // 여기에 코드를 작성하세요
        return dan;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSTID(String stID){
        this.stID = stID;
    }
    
    public void setDan(int dan){
        this.dan = dan;
    }
    
    public void calculateGugudan(){
        System.out.println(name + "에게" + dan + "단을 입력해주세요~");
        for (int i = 1; i <= 9; i++){
            System.out.println(dan + " * " + i + " = " +(dan * i));
        }
    }
}