package document;

public class Leaf {
	Integer indexLeaf = 0;
    String text;

    public Leaf(int i) {
        indexLeaf = i;
    }

    public String toString() {
        return indexLeaf+ "";
    }

    public int compareTo (Leaf o) {
            return indexLeaf - o.indexLeaf;
    }

}
