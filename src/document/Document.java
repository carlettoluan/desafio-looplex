package document;

import java.util.Iterator;
import java.util.TreeSet;

public class Document {



    public static void main(String[] args) {

        String folha = "";

        TreeSet<Leaf> branch = new TreeSet<>();

        TreeSet<Branch> document = new TreeSet<>();
        document.add(new Branch(1));
        branch.add();

        /*        arvore.add("texto1");
        arvore.add("texto2");
        arvore.add("texto3");
        arvore.add("texto4");

  */
        Iterator<Branch> iterator = document.iterator();
	    System.out.println("Tree data set: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }



    }

}
