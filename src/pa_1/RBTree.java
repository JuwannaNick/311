package pa_1;

import java.util.LinkedList;
import pa_1.Node;

/**
 * @author Nicholas Leslie RBTree class, maintains operations on RBTree.
 */
public class RBTree {

	private Node root;
	private Node nil;
	private Node current;
	private int height;
	private Node left = current.getLeft();

	/**
	 * RB Tree constructor. It initializes nil node as well.
	 */

	// Key-value
	public RBTree() {
		
		root.getLeft() = nil;
		this.root = new Node(null, height, height, false);
		root = null;
		LinkedList<String> T = new LinkedList<String>();

	}

	/**
	 * Returns the root of the tree.
	 * 
	 * @return
	 */

	public Node getRoot() {
		return this.root;

	}

	private void setRoot(Node root) {
		this.root = root;
	}

	/**
	 * Returns reference for the nil node, for the rbTree.
	 * 
	 * @return
	 */
	public Node getNILNode() {
		// TODO: Modify it accordingly.
		return nil;
	}

	/**
	 * Returns the number of internal nodes in the tree.
	 * 
	 * @return
	 */
	public int getSize() {
		// TODO: Modify it accordingly.
		return T.size();
	}

	/**
	 * Returns the height of the tree.
	 * 
	 * @return
	 */
	public int getHeight() {
		// TODO: Modify it accordingly.
		return (int) (Math.log(nodes.size()) / Math.log(2.0));
	}

	public void insertNode(Node node) {
		if (root == null) {
			node.setColor(1);
			nodes.add(node);
			root = nodes.get(0);
		} else {
			nodes.add(node);
			checkRotate();
		}
	}

	private Node rotateRight(Node h) {
		// assert (h != null) && isRed(h.left);
		Node x = h.getLeft();
		h.setLeft(x.getRight());
		x.setRight(h);
		x.setColor(x.getRight().getColor());
		x.getRight().setColor(0);

		// need size method in Node
		x.size = h.size;
		h.size = size(h.getLeft()) + size(h.getRight()) + 1;
		return x;
	}

	public void checkRotate() {

	}

	public void rotateNode() {

	}

	public void deleteNode() {

	}

	// Add more functions as you see fit.
}
