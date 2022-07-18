package document;

import java.util.Scanner;
import java.util.TreeSet;

class Menu {
	public Menu() {}
	public int iniciar(Scanner scan, Integer selection, TreeSet<Branch> branches) {
		
		while(selection < 1 || selection > 6) {
			System.out.println("Selecione 6 a qualquer momento para sair.");
			System.out.println("");
			if (branches.isEmpty()) {
				System.out.println("A árvore de documentos está vazia");
			}
			System.out.println("Gostaria de criar uma nova branch?");
			System.out.println("1. Sim");
			System.out.println("2. Não, mostre o status");
			if (!branches.isEmpty()) {
				System.out.println("3. Adicionar nova leaf (documento) na branch atual.");
				System.out.println("4. Adicionar novo documento");
				System.out.println("5. Monitoramento avançado");
			}
			System.out.println("6. sair");
			selection = scan.nextInt();
		}
		return selection;
	}
	
	public void cadastrarBranch(Scanner scan, TreeSet<Branch> branches) {
		System.out.println("Digite o nome da branch");
		String name = scan.next();
		branches.add(new Branch(name));
	}
	
	public void listar(Scanner scan, TreeSet<Branch> branches) {
		for(Branch branch : branches) {
			System.out.println(branch);
		}
	}
	
	public void novoDocumento(Scanner scan, TreeSet<Branch> branches) {
		System.out.println("Digite o nome do novo documento (leaf)");
		String name = scan.next(branches.put(scan, branches));
		
	}
	
	public void monitoramento() {
		System.out.println();
	}
	
}