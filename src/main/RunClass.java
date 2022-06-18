package main;

import basic.Sales;
import basic.Grades;
import utility.ScannerReader;

/**
 *
 * @author Miguel
 */
public class RunClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int productPrice = ScannerReader.readInt("Please enter the product value: ");
        double result = Sales.sellProduct( productPrice );
        System.out.println("Result: "+result);
        
        int n = ScannerReader.readInt("Number of grades?");
        double[] grades = Grades.gradesReader(n);
        double finalGrade = Grades.FinalGradeCalculator(grades);
        
        if (finalGrade<3){
            System.out.println("R - "+finalGrade);
        }else{
            System.out.println("A - "+finalGrade);
        }
    }
    
}
