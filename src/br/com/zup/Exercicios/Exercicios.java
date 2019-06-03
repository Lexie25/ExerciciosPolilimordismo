package br.com.zup.Exercicios;
import java.util.Scanner;
public class Exercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Você terá 10 chances ! ");
		System.out.print("Digite 1 numero de 0 a 50 :");
		int ns = (int) (Math.random()*51);
		System.out.println(ns);
		int nu = scan.nextInt();
		int vidas = 10;
		
		while(nu != ns && vidas > 0 ) {
			vidas --;
			System.out.println("Digite novamente! ");
			nu = scan.nextInt();
		}
		
		if(nu == ns) { 
			System.out.println("Parabéns você ganhou !");
		}else if (vidas == 0){
			System.out.println("Você perdeu !");
		}
	}
}


