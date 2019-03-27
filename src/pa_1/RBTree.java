package pa_1;

import java.util.ArrayList;
import java.util.List;
import pa_1.Node;

/**
 * @author Nicholas Leslie RBTree class, maintains operations on RBTree.
 */
public class RBTree {

	private Node nil;
	private Node root;
	private int height;

	/**
	 * RB Tree constructor. It initializes nil node as well.
	 */
	public RBTree() {
		private ArrayList<RBTree> T =  new ArrayList<RBTree>();
		nil.setisNil(0);
		root = nil;

		

		// done

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
		return 0;
	}

	/**
	 * Returns the height of the tree.
	 * 
	 * @return
	 */
	public int getHeight() {
		// TODO: Modify it accordingly.
		return height;
	}
	
	public void insertNode() {
		//cover the four rules.
	}
	
	public void rotateNode() {
		
	}
	
	public void deleteNode() {
		
	}

	// Add more functions as you see fit.
}
