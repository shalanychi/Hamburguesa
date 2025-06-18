package calculadoraswitch;
import java.util.Scanner;
public class calculadoraSwitch {
    
    public static void main(String args[]) {
    
    Scanner leer= new Scanner (System.in);
    
    int operacion ;
    int numero1 , numero2, resultado;
    
    System.out.println("elija la operacion que desea realizar");
    System.out.println("1 suma");
    System.out.println("2 resta");
    System.out.println("3 multiplicacion");
    System.out.println("4 divicion");
    System.out.println("5 potencia");
    
    operacion = leer.nextInt();
    switch(operacion)
    {
       case1
        System.out.println ("ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println ("ingrese el segundo numero");
        numero2=leer.nextInt();
        
        resultado=numero1+numero2;
        System.out.println("el resultado es "+ resultado);
    
    break;
        case2
        System.out.println ("ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println ("ingrese el segundo numero");
        numero2=leer.nextInt();
        
        resultado=numero1-numero2;
        System.out.println("el resultado es "+ resultado);
    break;
        case3 
        System.out.println ("ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println ("ingrese el segundo numero");
        numero2=leer.nextInt();
        
        resultado=numero1*numero2;
        System.out.println("el resultado es "+ resultado);
    break;
        case4
        System.out.println ("ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println ("ingrese el segundo numero");
        numero2=leer.nextInt();
        
        resultado=numero1/numero2;
        System.out.println("el resultado es "+ resultado);
    break;
        case5 
        System.out.println ("ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println ("ingrese el segundo numero");
        numero2=leer.nextInt();
        
        resultado=numero1^numero2;
        System.out.println("el resultado es "+ resultado);
    break;
        

}  
 } 
    
    
    
