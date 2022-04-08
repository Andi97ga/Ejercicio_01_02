/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_02;

/**
 *
 * @author User
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;
    
    public double calcularIngresos(int yearActual){
        var retorno = 1000d;
        if (this.yearIngreso>0 && this.yearIngreso<= yearActual){
            retorno= (((yearActual-yearIngreso)*0.02 * costoHora)+costoHora)* horasTrabajadas;
        }
        return retorno;
    }
    
    public double calcularBonoHorasExtra (int maximoHorasTrabajadas){
      var retorno = 1000d; 
        if(this.horasTrabajadas>maximoHorasTrabajadas ){
            retorno= (this.horasTrabajadas - maximoHorasTrabajadas)* this.costoHora * 2;
        }else{
            retorno = 0;
        }
      return retorno;
    }
    
    public double calcularImpuesto(int limite1,int limite2,int limite3){
        var retorno = 1000d; 
        if(this.calcularIngresos(yearIngreso)>=0 && this.calcularIngresos(yearIngreso)<=limite1)
           retorno=0;
        if(this.calcularIngresos(yearIngreso)>=limite1 && this.calcularIngresos(yearIngreso)<=limite2)
           retorno=this.calcularIngresos(yearIngreso)*0.05;
        if(this.calcularIngresos(yearIngreso)>=limite2 && this.calcularIngresos(yearIngreso)<=limite3)
           retorno=this.calcularIngresos(yearIngreso)*0.12;
        if(this.calcularIngresos(yearIngreso)>limite3)
            retorno=0.25*this.calcularIngresos(yearIngreso);
        return retorno;   
    }
      
}
