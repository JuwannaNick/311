package pa_1;

/**
 * Team members:
 * 
 * @author John Doe
 * @author Jane Doe
 * 
 *         Node class for RBTree.
 */
public class Node {

	/**
	 * Returns the parent of this node.
	 * 
	 * @return
	 */

	// left and right children of the Node and parent of Node
	private Node left, right, parent;

	// 0 means red and 1 means black
	private int color;

	// maintains size of subtree count
	private int size;

	// stores the Endpoint's Value
	private int key;

	// Endpoint that this node represents
	private Endpoint endpoint;

	// True if the node is a nil node and false if it is not a nil node
	private boolean isNil;

	// p-value: true = left Endpoint and false=right Endpoint
	boolean p;

	// emax endpoint: the side of which max val originates from
	Endpoint emax;

	public Node(Endpoint e, int color, int size, boolean p) {
		this.isNil = false;
		this.endpoint = e;
		this.key = e.getValue();
		this.color = color;
		this.size = size;
		this.p = p;

	}

	public Node(Endpoint e, Node parent) {
		this.isNil = true;
		this.endpoint = e;
		this.key = 0;
		this.color = 1;
		this.size = 0;
		this.setParent(parent);
		this.setLeft(null);
		this.setRight(null);
	}

	/**
	 * links the node's left child.
	 * 
	 * @param Node
	 *            left
	 */
	public void setLeft(Node left) {
		this.left = left;
		this.left.setParent(this);
	}

	/**
	 * links the node's right child.
	 * 
	 * @param Node
	 *            right
	 */
	public void setRight(Node right) {
		this.right = right;
		this.right.setParent(this);
	}

	/**
	 * links the node's parent.
	 * 
	 * @param Node
	 *            parent
	 */
	public void setParent(Node parent) {
		this.parent = parent;
	}

	/**
	 * Returns the parent.
	 * 
	 * @return
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * Returns the left child.
	 * 
	 * @return
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * Returns the right child.
	 * 
	 * @return
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * Returns the endpoint value, which is an integer.
	 * 
	 * @return
	 */
	public int getKey() {

		return this.key;
	}

	/**
	 * Returns the value of the function-p-based on this endpoint.
	 * 
	 * @return
	 */
	public int getP() {
		if (p) {
			return +1;
		}
		return -1;
	}

	/**
	 * Returns the val of the node as described in this assignment.
	 * 
	 * @return
	 */
	public int getVal() {
		if (isNil) {
			return 0;
		} else
			return this.left.getVal() + this.right.getVal() + this.getP();

	}

	/**
	 * Returns themaxvalof the node as described in this assignment.
	 * 
	 * @return
	 */
	public int getMaxVal() {
		if (isNil) {
			return 0;
		} else {
			// first set to the left node
			int maxVal = this.getLeft().getMaxVal();

			int thisNode = this.getLeft().getVal() + this.getP();
			int rightNode = thisNode + this.getRight().getMaxVal();

			if (maxVal < thisNode) {
				maxVal = thisNode;

			}
			if (maxVal < rightNode) {
				maxVal = rightNode;

			}
			return maxVal;
		}
	}

	/**
	 * Returns theEndpointobject that this node represents.
	 * 
	 * @return
	 */
	public Endpoint getEndpoint() {
		return this.endpoint;
	}

	/**
	 * Returns anEndpointobject that represents emax. Calling this method on the
	 * root node will give the End point object whose getValue() provides a point of
	 * maximum overlap.
	 * 
	 * @return
	 */
	public Endpoint getEmax() {
		if (isNil) {
			return this.getEndpoint();
		} else {
			// first set to the left node
			int maxVal = this.getLeft().getMaxVal();
			emax = this.getLeft().getEndpoint();

			int thisNode = this.getLeft().getVal() + this.getP();
			int rightNode = thisNode + this.getRight().getMaxVal();

			if (maxVal < thisNode) {
				emax = this.getEndpoint();
			}
			if (maxVal < rightNode) {
				emax = this.getRight().getEndpoint();
			}
			return emax;
		}
	}

	/**
	 * Returns 0 if red. Returns 1 if black.
	 * 
	 * @return
	 */
	public int getColor() {
		return color;
	}

	public void setisNil(int a) {
		if (a == 0) {
			isNil = true;
		} else {
			isNil = false;
		}
	}
	
	public void setColor(int n) {
		if (n == 1) {
			color = 1;
		}
		else {
			color = 1;
		}
	}

	// Add more functions as you see fit.

}
