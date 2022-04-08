/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_02;

/**
 *
 * @author User
 */
public class Ejercicio_01_02 {

    public static void main(String[] args) {
        System.out.println(" DATOS DEL EMPLEADO ");
        var empleado1 = new Empleado();
        empleado1.nombre =" Juan Jose Rivera Sanchez";
        empleado1.horasTrabajadas = 100;
        empleado1.costoHora = 6d;
        empleado1.yearIngreso = 2010;
        
        System.out.println("Nombres completos: "+ empleado1.nombre);
        System.out.println("Horas trabajadas: "+ empleado1.horasTrabajadas+ " horas");
        System.out.println( "Costo de Horas: "+empleado1.costoHora + " USD ");
        System.out.println( "Año de ingreso: "+ empleado1.yearIngreso);
         
        var yearTrabajado= empleado1.calcularIngresos(2022);
          System.out.println("Porcetanje de antiguedad: "+yearTrabajado+" USD");
                          
       var bono= empleado1.calcularBonoHorasExtra(100);
          System.out.println("El bono de las horas extras es: "+bono+" USD"); 
          
          
      
          
      ///////////EMPLEADO 2 ////////////
      System.out.println("/ //// DATOS DEL EMPLEADO 2 /////// ");
        var empleado2 = new Empleado();
        empleado2.nombre =" Mariana";
        empleado2.horasTrabajadas = 200;
        empleado2.costoHora = 5d;
        empleado2.yearIngreso = 2020;
        
        System.out.println("Nombres completos: "+ empleado2.nombre);
        System.out.println("Horas trabajadas: "+ empleado2.horasTrabajadas+ " horas");
        System.out.println( "Costo de Horas: "+empleado2.costoHora + " USD ");
        System.out.println( "Año de ingreso: "+ empleado2.yearIngreso);
         
        var yearTrabajado2= empleado2.calcularIngresos(2022);
          System.out.println("Porcetanje de antiguedad: "+yearTrabajado2+" USD");
                          
       var bono2= empleado2.calcularBonoHorasExtra(100);
          System.out.println("El bono de las horas extras es: "+bono2+" USD");
    }
}
