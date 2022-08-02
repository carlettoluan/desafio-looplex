package document;

import java.util.Scanner;
import java.util.TreeSet;

class Menu {
	public Menu() {}
	
	Branch branchAtual;
	
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
				System.out.println("3. Selecionar branch?");
				if(branchAtual != null) {
					System.out.println("4. Adicionar leaf (novo documento)");
					System.out.println("5. Imprimir documentos");
				}
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
	
	public void imprimir(Scanner scan, TreeSet<Branch> branches) {
		System.out.println(branches.last());
	}
	
	public void novoDocumento(Scanner scan) {
		
		System.out.println("Insira o nome da nova 'leaf'");
		String leafText = scan.next();
		
		branchAtual.addLeaf(leafText);
	}
	
	public Branch encontrarBranch(Scanner scan, TreeSet<Branch> branches) {
		System.out.println("Digite o nome da branch que você deseja encontrar...");
		String name = scan.next();
		for(Branch branch: branches) {
			if(branch.getName().equalsIgnoreCase(name)) {
				return branch;
			}
		}
		return null;
	}
	
	public void monitorar(Scanner scan, TreeSet<Branch> branches) {
		System.out.println("Quantidade de branches: " + branches.size());
		System.out.println("Primeira branch: " + branches.first());
		System.out.println("Ultima branch: " + branches.last());
	}
	
}