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
        if(this.horasTrabajadas == 100 && this.horasTrabajadas >= maximoHorasTrabajadas ){
            retorno= (this.horasTrabajadas - maximoHorasTrabajadas)* this.costoHora * 2;
        }else{
            retorno = 0;
        }
      return retorno;
    }
    
    public double calcularImpuesto(int limite0,int limite1,int limite2,int limite3){
        var retorno = 1000d; 
        var ingresoBasico = this.costoHora * this.horasTrabajadas;
        
        if (limite0==0 && limite1 <= 500){
            retorno= ingresoBasico * 0;
        }else{
            if(limite1==500 && limite2 <= 1000){
                retorno= ingresoBasico * 0.05;
            }else{
                if(limite2==1000 && limite3 <= 2000){
                    retorno= ingresoBasico * 0.12;
                }else{
                    if(limite3 > 2000){
                        retorno= ingresoBasico * 0.25;
                    }
                }
            }
            return retorno;
        }
        
    }
      
}
