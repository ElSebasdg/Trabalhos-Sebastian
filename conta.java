import java.util.Scanner;
import static java.lang.System.*;
public class teste2 {

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		double a, b;
		String c;
		
		System.out.print("Insira uma conta a efetuar com os operadores +,-,*,/ separados por espaços: ");
		a=sc.nextInt();
		c=sc.next();
		b=sc.nextInt();
		
		if(c=="+" && c=="-" && c=="*" && c=="/") err.println("Operador inválido!");
		else{
			switch (c){
			
			case "+":
				out.println(a+b);
				break;
			case "-":
				out.println(a-b);
				break;
			case "*":
				out.println(a*b);
				break;
			case "/":
				out.println(a/b);
				break;
			}
		}
	}
}

		
	


