package document;

import java.util.Scanner;
import java.util.TreeSet;

public class DocumentAssembler {
	
	public static void main(String[] args) throws Exception {
		Integer selection = 0;
		TreeSet<Branch> branches = new TreeSet<Branch>();
		Scanner scan = new Scanner(System.in);
		
		Menu menu = new Menu();
		
		System.out.println("____________________");
		System.out.println("|                   |");
		System.out.println("|   Bem vindo ao    |");
		System.out.println("|Document Assembler |");
		System.out.println("|___________________|");
		
		while(selection != 5) {
			selection = 0;
			selection = menu.iniciar(scan,  selection, branches);
			
		switch(selection) {
		case 1:
			menu.cadastrar(scan, branches);
			break;
		case 2:
			menu.listar(scan, branches);
			break;
		case 3:
			menu ;
			break;
		case 4:
			menu ;
			break;
		case 5: 
			menu ;
			break;
		default:
			System.out.println("Opção inválida");
			break;
			}
		}
		
	}
}
