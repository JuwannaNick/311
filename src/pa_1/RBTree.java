package pa_1;

import java.util.ArrayList;
import java.util.List;
import pa_1.Node;

/**
 * @author Nicholas Leslie RBTree class, maintains operations on RBTree.
 */
public class RBTree {

	private Node root;
	private Node nil;
	private int height;
	private int size;
	private ArrayList<Node> nodes;

	/**
	 * RB Tree constructor. It initializes nil node as well.
	 */
	public RBTree() {
		nil.setisNil(true);
		nodes =  new ArrayList<Node>();
		root = null;
	}

	/**
	 * Returns the root of the tree.
	 * 
	 * @return
	 */
	public Node getRoot() {
		return root;

		// done
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
		return nodes.size();
	}

	/**
	 * Returns the height of the tree.
	 * 
	 * @return
	 */
	public int getHeight() {
		// TODO: Modify it accordingly.
		return (int) (Math.log(nodes.size())/Math.log(2.0));
	}
	
	public void insertNode(Node node) {
		if(root == null) {
			node.setColor(1);
			nodes.add(node);
			root = nodes.get(0);
		}
		else {
			nodes.add(node);
			checkRotate();
		}
	}
	
	public void checkRotate() {
		
	}
	
	public void rotateNode() {
		
		
		
	}
	
	public void deleteNode() {
		
	}

	// Add more functions as you see fit.
}
