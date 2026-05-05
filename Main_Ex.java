import java.util.Scanner;

public class Main_Ex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        String name = sc.nextLine();

        int stId = sc.nextInt();
        student = new Student(name, stId);


        String input = sc.nextLine();
        student.calculateGugudan(input);

        sc.close();
    }
}