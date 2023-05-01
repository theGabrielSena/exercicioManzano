package logicaProgramacaoFaccat;

import java.util.Scanner;

public class EX21 {

	public static void main(String[] args) {
		Scanner ns = new Scanner(System.in);
		int horaInicio,horaFim,horasSoma,horaMaxima=24;
		
		System.out.println("Digite o hor�rio em que come�ou a partida de Xadrez");
		horaInicio = ns.nextInt();
		System.out.println("Digite o hor�rio de t�rmino da partida de Xadrez");
		horaFim = ns.nextInt();
		
		horasSoma = horaInicio-horaFim;
		
		if(horasSoma >= horaMaxima) {
			System.out.println("Terminou no outro dia com: "+horasSoma+ " horas");
		}
		else if(horasSoma <= -horaMaxima) {
			System.out.println("Terminou no outro dia com: "+horasSoma+ " horas");
		}
		else {
			System.out.println("A partida teve " +horasSoma+ " horas");
		}
		ns.close();
	}

}
