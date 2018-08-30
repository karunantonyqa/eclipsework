
public class MorseNode {
	
	private char letter;
	private MorseNode left;
	private MorseNode right;
	private MorseNode parent;
	public static final char EMPTY = ' ';
	
	public MorseNode() {
		letter = EMPTY;
		left = null;
		right = null;
		parent = null;
	}
	
	public MorseNode(MorseNode parent, MorseNode left, MorseNode right, char letter) {
		this.parent=parent;
		this.left=left;
		this.right=right;
		this.letter=letter;
	}

	public char getLetter() {
		return letter;
	}

	public MorseNode getLeft() {
		return left;
	}

	public MorseNode getRight() {
		return right;
	}

	public MorseNode getParent() {
		return parent;
	}
	
	

}
