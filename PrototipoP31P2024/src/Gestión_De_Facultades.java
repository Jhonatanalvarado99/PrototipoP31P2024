
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhony
 */
public class Gestión_De_Facultades {
  
     public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 
        
        String[] alumnos = new String[5];
        int [][] votos = new int[10][5];  
        int [] totalVotos = new int[10];  
        
        // Ingresar nombres de alumnos
        System.out.println("Ingrese los nombres de 5 estudiantes:");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
    
    
}



}
     
}