package level3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();

        // Calculate percentage
        double percentage = (physics + chemistry + maths) / 3;

        String grade, remarks;

        // Determine grade and remarks
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Output
        System.out.println("Average Mark: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
