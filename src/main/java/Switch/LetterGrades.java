package Switch;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS x type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()){
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10){
                case 9: // Grade was between 90
                case 10:// and 100, inclusive
                    ++aCount;
                    break;
                case 8: // Grade was between 80 and 89
                    ++bCount;
                    break;
                case 7: // Grade was between 70 and 79
                    ++cCount;
                    break;
                case 6: // Grade was between 60 and 69
                    ++dCount;
                    break;
                default: // Grade was less than 60
                        ++fCount;
                    break;
            }
        }
        //Display grade report
        System.out.printf("%nGrade report: %n");

        if(gradeCounter != 0){

            double average = (double) total / gradeCounter;
            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);

            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade: ",
                    "A: ", aCount,
                    "B: " , bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);

        }else{
            System.out.printf("No grades were entered");
        }
    }
}
