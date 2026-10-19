import java.util.Arrays;

public class StudentGradeManager {

    int[] grades = {18, 15, 20, 12, 17};

    public String getGradesAsString(){

        return Arrays.toString(grades);
    }

    public int calculateTotal(){

        int total = 0;

        for (int grade : grades){
           total += grade;
        }
        return total;
    }

    public double   calculateAverage(){

        if (grades.length == 0) {
            throw new IllegalStateException("Grades array is empty");
        }
        return (double) calculateTotal() / (grades.length);

    }

    public int findMaxGrade(){

        int max = grades[0];

        for (int grade : grades){
            if (grade > max)
                max = grade;
        }
        return max;
    }

    public int findMinGrade(){

        int min = grades[0];

        for (int grade : grades ){
            if (grade < min)
                min = grade;
        }
        return min;
    }

    public String sortGrades(){
        Arrays.sort(grades);
        return Arrays.toString(grades);
    }

    public int countPassedStudents(){

        int count = 0;

        for (int grade : grades){
            if (grade >= 10)
                count++;
        }
        return count;
    }



    public static void main(String[] args){
        StudentGradeManager student = new StudentGradeManager();
        System.out.println("========== Student Grade Manager ==========");
        System.out.println("Grades: " + student.getGradesAsString());
        System.out.println("Total: " + student.calculateTotal());
        System.out.println("Average: " + student.calculateAverage());
        System.out.println("Max Grade: " + student.findMaxGrade());
        System.out.println("Min Grade: " + student.findMinGrade());
        System.out.println("Sorted Grades: " + student.sortGrades());
        System.out.println("Passed Students: " + student.countPassedStudents());
        System.out.println("===========================================");

    }
}
