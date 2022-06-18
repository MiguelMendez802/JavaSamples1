package basic;

import utility.ScannerReader;

/**
 *
 * @author Miguel
 */
public class Grades {
    
    /*
    Escribir un algoritmo que lea 5 notas de un estudiante 
    y calcule su nota final, sabiendo que todas las notas tienen
    el mismo peso o porcentaje. Si la nota definitiva es menor a 3,
    debera imprimir un mensaje indicando que reprobo o si es mayor
    o igual a 3, debera imprimir un mensaje indicando que aprobó.
    */
    
    public static double[] gradesReader( int gradesNumber ){
        
        double[] grades = new double[gradesNumber];
        
        for (int i=0; i < gradesNumber; i++){
            grades[i] = ScannerReader.readDouble("Please give the "+ (i+1) +" grade");
        }
        
        return grades;
    }
    
    public static double FinalGradeCalculator( double[] grades ){
        
        double finalGrade = 0;
        
        for(int i=0; i < grades.length; i++){
            finalGrade += grades[i];
        }
        
        finalGrade /= grades.length;
        
        return finalGrade;
    }
    
}
