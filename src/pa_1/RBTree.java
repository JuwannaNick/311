package pa_1;

import java.util.ArrayList;
import java.util.List;
import pa_1.Node;
/**
 * @author Nicholas Leslie 
 * RBTree class, maintains operations on RBTree.
 */
public class RBTree {
	
	private Node root;
	private Node current;
	private Node parent;
	private Node left;
	private Node right;
	
	private Node nil;

	/**
	 * RB Tree constructor. It initializes nil node as well.
	 */
	public RBTree() {
		RBTree t = new RBTree();
		root = null;
		
	}

	/**
	 * Returns the root of the tree.
	 * 
	 * @return
	 */
	public Node getRoot() {
		// TODO: Modify it accordingly.
		return root;
	}

	/**
	 * Returns reference for the nil node, for the rbTree.
	 * 
	 * @return
	 */
	public Node getNILNode() {
		// TODO: Modify it accordingly.
		if (RBTree = null) {
			
		}
		return null;
	}

	/**
	 * Returns the number of internal nodes in the tree.
	 * 
	 * @return
	 */
	public int getSize() {
		// TODO: Modify it accordingly.
		return 0;
	}

	/**
	 * Returns the height of the tree.
	 * 
	 * @return
	 */
	public int getHeight() {
		// TODO: Modify it accordingly.
		return 0;
	}

	// Add more functions as you see fit.
}
