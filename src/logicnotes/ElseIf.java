package logicnotes;


import java.util.Scanner;


public class ElseIf {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso:");

        float peso = sc.nextFloat();

        System.out.println("Ingrese su altura: ");

        float altura = sc.nextFloat();


        float imc = Math.round(peso/(altura * altura));

       if(imc < 18.5){
           System.out.println("Su IMC es: " + imc + "Corresponde a bajo peso");
       } else if(imc >= 18.5 && imc < 25){
           System.out.println("IMC:" + imc + "corresponde a peso normal");
       }else if(imc >= 25 && imc < 30){
              System.out.println("IMC:" + imc + "corresponde a sobrepeso");
       }else{
           System.out.println("IMC:" + imc + "corresponde a obesidad");
       }
    }
}
