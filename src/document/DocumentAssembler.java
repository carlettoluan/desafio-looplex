package document;

import java.util.Scanner;
import java.util.TreeSet;

public class DocumentAssembler {
	
	public static void main(String[] args) throws Exception {
		
		Integer selection = 0;
		TreeSet<Branch> branches = new TreeSet<Branch>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("_____________________");
		System.out.println("|                    |");
		System.out.println("|   Bem vindo ao     |");
		System.out.println("| Document Assembler |");
		System.out.println("|____________________|");
		
		System.out.println("Selecione 0 a qualquer momento para sair.");
		System.out.println("");
		
		while(!selection.equals(0)); {
		
		if (branches.isEmpty()) {
			System.out.println("Àrvore de documentos está vazia");
			selection = scan.nextInt();
		} else {
				
			System.out.println("Gostaria de criar nova branch?");
			System.out.println("1. Sim");
			System.out.println("2. Não, mostre o status");
		
			selection = scan.nextInt();
				} 
		
		if(selection == 1) {
			// ${BRANCH}+[0];
				Branch branch1 = new Branch("Branch1");
				branches.add(branch1);
			} else if (selection == 2) {
				for(Branch branch : branches) {
					System.out.println(branches);
				}
			
			} else {
				System.out.println("Favor informar valor válido");;
			}
				
		}
		
		
		/*
		

	if(branches.isEmpty()) {
			System.out.println("Árvore de documentos está vazia.");
			
			System.out.println("Gostaria de criar novo documento?");
			System.out.println("1. Sim");
			System.out.println("2. Não");
			selection = scan.nextInt();
			
		} else {
			for (Branch branch : branches) {
				System.out.println(branch);
			}

	
			System.out.println("Favor selecionar opção válida");
			System.out.println("1 - Criar nova 'branch'");
			System.out.println("1 - Criar nova 'branch'");
	*/
		scan.close();
			
		}}
