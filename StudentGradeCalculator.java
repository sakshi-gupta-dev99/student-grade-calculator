import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name:");
        String name = sc.nextLine();

        if(name.isEmpty() || name.trim().isEmpty()) {
            System.out.print("Name cannot be empty!");
            sc.close();
            return;
        }

        System.out.print("Enter marks of 5 subjects(out of 100):");
        float m1 = sc.nextFloat();
        float m2 = sc.nextFloat();
        float m3 = sc.nextFloat();
        float m4 = sc.nextFloat();
        float m5 = sc.nextFloat();

        if(m1 > 100 || m1 < 0 || m2 > 100 || m2 < 0 ||
           m3 > 100 || m3 < 0 || m4 > 100 || m4 < 0 ||
           m5 > 100 || m5 < 0) {
            System.out.print("Invalid marks");
            sc.close();
            return;
        } 
        
        if(m1 < 33 || m2 < 33 || m3 < 33 || m4 < 33|| m5 < 33) {
            System.out.print("Fail");
        } else {
           float totalMarks  = m1 + m2 + m3 + m4 + m5;
           double percentage = (totalMarks / 500.0) * 100;
           String grade = getGrade(percentage);

           System.out.println("\n--------Result--------");
           System.out.println("Name:" +name);
           System.out.println("Total Marks:" +totalMarks +"/500");
           System.out.println("Percentage:" +percentage +"%");
           System.out.println("Grade:" +grade);
        }
        sc.close();
    }
    public static String getGrade(double per) {
        if(per >= 90) return "A+";
        if(per >= 75) return "A";
        if(per >= 60) return "B";
        if(per >= 39) return "C";
        return "Fail"; 
    }
}
