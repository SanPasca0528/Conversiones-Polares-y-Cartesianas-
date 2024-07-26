/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.Math;
import java.util.Scanner;

public class Conversiones 
{
	public static void main(String[] args) {
	    Scanner leer = new Scanner(System.in);
		System.out.println("Hello World");
		
		double x;
		double y;
	    double distancia;
		double angulo;
		int opcion;
		System.out.println("Seleccione la opcion :");
		System.out.println("1.Convertir de  cartesianas a polares ");
		System.out.println("2.Convertir de polares a cartesianas");
		System.out.println("Salir");
		
		opcion=leer.nextInt();
		
		
		switch (opcion) { 
		    case 1:
		        System.out.println("Ingrese la coordenada x:");
		        x=leer.nextDouble();
		        
		        System.out.println("Ingrese la coordenada y:");
		        y=leer.nextDouble();
		         
		         
		        distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                angulo = Math.atan2(y, x); 
		        
		         System.out.println("Las coordenadas polares son ("+distancia+","+angulo+")");
		        
		        break;
            case 2:
                System.out.println("Ingrese la distancia:");
                
                distancia=leer.nextDouble();
		        System.out.println("Ingrese la angulo:");
		        angulo=leer.nextDouble();
		        
		        x=distancia*Math.cos(Math.toRadians(angulo));
		        y=distancia*Math.sin(Math.toRadians(angulo));
		        
		        System.out.println("Las coordenadas cartesianas son ("+x+","+y+")");
		        
		        
               
                break;
            case 3 :
                
                break;
    default:
    
  }
		
		
		
		
		
	}
}
