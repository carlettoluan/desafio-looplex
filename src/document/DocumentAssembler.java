package document;

import java.util.Scanner;
import java.util.TreeSet;

public class DocumentAssembler {
	
	public static void main(String[] args) throws Exception {
		Integer selection = 0;
		TreeSet<Branch> branches = new TreeSet<>();
		Scanner scan = new Scanner(System.in);
		
		Menu menu = new Menu();
		
		System.out.println("____________________");
		System.out.println("|                   |");
		System.out.println("|   Bem vindo ao    |");
		System.out.println("|Document Assembler |");
		System.out.println("|___________________|");
		
		while(selection != 6) {
			selection = 0;
			selection = menu.iniciar(scan, selection, branches);
			
		switch(selection) {
		case 1:
			menu.cadastrarBranch(scan, branches);
			break;
		case 2:
			menu.listar(scan, branches);
			break;
		case 3:
			menu.branchAtual = menu.encontrarBranch(scan, branches);
			break;
		case 4:
			menu.novoDocumento(scan);
			break;
		case 5:
			menu.monitorar(scan, branches);;
			break;
		case 6:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida");
			break;
			}
		}
	}
}
