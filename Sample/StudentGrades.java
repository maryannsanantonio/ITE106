import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentGrades {

    static class Student {
        String name;
        List<Double> scores;
        List<Double> weights;

        Student(String name) {
            this.name = name;
            this.scores = new ArrayList<>();
            this.weights = new ArrayList<>();
        }
        
        void addScore(double score, double weight) {
            scores.add(score * (weight / 100)); // Apply weight
            weights.add(weight);
        }
        
        double calculateAverage() {
            double total = 0;
            for (double score : scores) {
                total += score;
            }
            return total / scores.size();
        }

        String getLetterGrade() {
            double average = calculateAverage();
            if (average >= 90) return "A";
            else if (average >= 80) return "B";
            else if (average >= 70) return "C";
            else if (average >= 60) return "D";
            else return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = getIntInput(scanner, "Enter the number of students in the class: ");
        int numAssignments = getIntInput(scanner, "Enter the number of assignments: ");

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the student's name: ");
            String name = scanner.next();
            Student student = new Student(name);
            for (int j = 0; j < numAssignments; j++) {
                double score = getDoubleInput(scanner, "Enter score for assignment " + (j + 1) + ": ");
                double weight = getDoubleInput(scanner, "Enter weight for assignment " + (j + 1) + " (as a percentage): ");
                student.addScore(score, weight);
            }
            students.add(student);
        }

        double totalClassAverage = 0;
        double highestScore = Double.MIN_VALUE;
        double lowestScore = Double.MAX_VALUE;


