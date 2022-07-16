package document;

public class Branch {
	
	    Integer indexBranch = 0; 

	    public Branch(int i) {
	        indexBranch= i;
	    }

	    public String toString() {
	        return indexBranch + "";
	    }
	
	
	    public int compareTo(Branch o) {
	        return indexBranch - o.indexBranch;
	    }
	}

