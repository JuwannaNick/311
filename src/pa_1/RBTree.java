package pa_1;

/**
 * @author Nicholas Leslie RBTree class, maintains operations on RBTree.
 */
public class RBTree {

	private Node root;
	private Node nil;
	private int size;
	private int height;
	private final static int RED = 0;
	private final static int BLACK = 1;

	/**
	 * RB Tree constructor. It initializes nil node as well.
	 */
	public RBTree() {
		nil = new Node(new Endpoint(0), true);
		nil.setisNil(true);
		root = nil;
		size = 0;
		height = 0;
	}

	/**
	 * Returns the root of the tree.
	 * 
	 * @return
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * Returns reference for the nil node, for the rbTree.
	 * 
	 * @return
	 */
	public Node getNILNode() {
		return nil;
	}

	/**
	 * Returns the number of internal nodes in the tree.
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Returns the height of the tree.
	 * 
	 * @return
	 */
	public int getHeight() {
		return (int) (Math.log(size) / Math.log(2.0));
	}

	public void insertNode(Node z) {
		size++;
		if (root == nil) {
			root = z;
			z.setLeft(nil);
			z.setRight(nil);
			z.setColor(BLACK);
		} else {
			Node y = nil;
			Node x = root;
			while (x != nil) {
				y = x;
				if (z.getKey() < x.getKey()) {
					x = x.getLeft();
				} else {
					x = x.getRight();
				}
			}
			z.setParent(y);
			if (y == nil) {
				root = z;
			} else if (z.getKey() < y.getKey()) {
				y.setLeft(z);
			} else {
				y.setRight(z);
			}
			z.setLeft(nil);
			z.setRight(nil);
			z.setColor(RED);
			RBInsertFixup(z);
		}

	}

	public void RBInsertFixup(Node z) {
		Node y;
		while (z.getParent().getColor() == RED) {
			if (z.getParent() == z.getParent().getLeft()) {
				y = z.getParent().getRight();
				if (y.getColor() == RED) {
					z.getParent().setColor(BLACK);
					y.setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					if(z.getParent().getParent() == null) {
						RightRotate(z);
					}
					else {
						z = z.getParent().getParent();
					}
					
				} else {
					if (z == z.getParent().getRight()) {
						z = z.getParent();
						LeftRotate(z);
					}
					z.getParent().setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					RightRotate(z.getParent().getParent());
				}
			} else {
				y = z.getParent().getLeft();
				if (y.getColor() == RED) {
					z.getParent().setColor(BLACK);
					y.setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					if (z.getParent().getParent().getKey() == null) {
						LeftRotate(z);
					}
					else {
						z = z.getParent().getParent();
					}
					
				} else {
					if (z == z.getParent().getLeft()) {
						z = z.getParent();
						RightRotate(z);
					}
					z.getParent().setColor(BLACK);
					z.getParent().getParent().setColor(RED);
					LeftRotate(z.getParent().getParent());
				}

			}

		}
		root.setColor(BLACK);

	}

	public void LeftRotate(Node h) {
		Node x = h.getLeft();
		h.setLeft(x.getRight());
		x.setRight(h);
		x.setColor(x.getRight().getColor());
		x.getRight().setColor(0);
	}

	public void RightRotate(Node h) {
		Node x = h.getRight();
		h.setRight(x.getLeft());
		x.setLeft(h);
		x.setColor(x.getLeft().getColor());
		x.getLeft().setColor(0);
	}

	// Add more functions as you see fit.
}	