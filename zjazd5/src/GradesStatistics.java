import java.util.*;

/*
    Author: Marcel Pankanin  
    GradesStatistics class implemented in Java
    Date: 03.05.2020
*/
public class GradesStatistics {
    public static void main(String[] args) {
        int numberOfGrades = 0;
        int lowGrade = 50;
        int highGrade = 60;
        double standardDeviation = 0.0;
        double sumGrades = 0;
        double average = 0;
        double median = 0;
        Random gradeDraw = new Random();
        ArrayList<Integer> gradesAll = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of students:");
        numberOfGrades = userInput.nextInt();
        if (numberOfGrades > 0 && numberOfGrades <= 100) {
            for (int i = 0; i < numberOfGrades; i++) {
                int tempGrade = gradeDraw.nextInt(highGrade - lowGrade) + lowGrade;
                gradesAll.add(tempGrade);
                sumGrades = sumGrades + tempGrade;
            }
        }

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("The grade for student " + (i + 1) + ": " + gradesAll.get(i));
        }
        //this is here to dont print after sort
        System.out.println("The grades are: " + gradesAll);
        //median part
        Collections.sort(gradesAll);
        if (gradesAll.size() % 2 == 0)
            median = ((double) gradesAll.get(gradesAll.size() / 2) + (double) gradesAll.get(gradesAll.size() / 2 - 1)) / 2;
        else
            median = (double) gradesAll.get(gradesAll.size() / 2);
        //deviation part
        double mean = sumGrades / gradesAll.size();
        for (double num : gradesAll) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation / gradesAll.size());
        average = sumGrades / gradesAll.size();
        System.out.printf("The average is: %.2f \n", average, "\n");
        System.out.printf("The median is: %.2f \n", median);
        System.out.println("The minimum is: " + Collections.min(gradesAll));
        System.out.println("The maximum is: " + Collections.max(gradesAll));
        System.out.printf("The standard deviation is: %.2f ", standardDeviation);
    }
}
