package pa_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * Team members: Caining Wang
 * @author John Doe
 * @author Jane Doe
 * 
 * A wrapper class for RBTree
 */

public class Intervals {
	
	//counter used to set ID for each interval
	private static final AtomicInteger count = new AtomicInteger(0); 
	
	//consecutive ID for each interval
	private int ID = 0; //If deletion is done, this could be used to keep track of edpoints for the same interval.
	
	//left endpoint
	private int left;
	
	//right endpoint
	private int right;
	
	//the red-black tree used
	private RBTree tree;
	
	//collection of intervals
	private ArrayList<Intervals> intvs =  new ArrayList<Intervals>();
	
	/**
	 * Constructor with no parameters.
	 */
	public Intervals() {
	
	}
	
	/**
	 * 
	 * Adds the interval with left endpoint a and right endpoint b 
	 * to the collection of intervals. Each newly inserted interval 
	 * must be assigned an ID. The IDs should be consecutive; that is, 
	 * the ID of the interval inserted on the ith call of this method should be i.
	 * For example if intervalInsert is called successively to insert intervals 
	 * [5,7],[4,9],[1,8], then the IDs of these intervals should be 1,2,3, respectively.These IDs are permanent
	 *  for the respective intervals. Keep track of the IDs, as multiple intervals that have the same endpoints
	 *   on both sides can be added. intervalInsertshould run in O(logn)time
	 * @param a
	 * @param b
	 */
	void intervalInsert(int a, int b) {
		Intervals temp = new Intervals();
		temp.setLeft(a);
		temp.setRight(b);
		temp.setID(count.incrementAndGet());
		intvs.add(temp);
	}
	
	/**
	 * To delete an interval from delete.
	 * 
	 * 
	 * Deletes the interval whose ID (gener-ated byintervalInsert) isintervalID. Returnstrueif 
	 * deletion was successful. This method should run in O(logn)time.Note.TheintervalDeletemethod 
	 * isoptional; that is, you are not requiredto implement it. However, your codemustprovide 
	 * anintervalDeletemethodeven if you choose not to implement interval deletion. If you do not
	 *  implementdeletion, theintervalDeletemethod should consist of just one line that returnsfalse.
	 * @param intervalID
	 * @return
	 */
	boolean intervalDelete(int intervalID) {
		//TODO: Complete it as needed (This is optional so you can leave it as it is)
		
		return false;
	}
	
	/**
	 * Finds the endpoint that has maximum overlap and returns its value. This method should run in constant time.
	 * @return
	 */
	int findPOM() {
		int maxIntv = 0, maxEndpoint = 0,  maxLap = 0;
		int lap, tempEndpoint;
		for(int i = 0; i < intvs.size(); i++) {			
			for(int a = 0; a < 2; a++) {
				lap = 0;
				tempEndpoint = intvs.get(i).getEndpoint(a);				
				for(int j = 0; j < intvs.size(); j++) {
					if ( intvs.get(j).getLeft() <= tempEndpoint && tempEndpoint < intvs.get(j).getRight()) {
						lap++;
					}				
				}
				if ( lap > maxLap) {
					maxLap = lap;
					maxIntv = i;
					maxEndpoint = a;
				}
			}			
		}
		
		return intvs.get(maxIntv).getEndpoint(maxEndpoint);
	}
	
	/**
	 * Returns the red-black tree used, which is an object of typeRBTree.
	 * @return
	 */
	RBTree getRBTree() {
		return tree;
	}
	
	
	//Add more functions as  you see fit.
	/**
	 * Set the left endpoint for a interval
	 * @param endpoint
	 */
	void setLeft(int endpoint) {
		left = endpoint;
	}
	
	/**
	 * Get the the interval's left endpoint
	 * @return
	 */
	int getLeft() {
		return left;
	}
	
	/**
	 * Set the right endpoint for a interval
	 * @param endpoint
	 */
	void setRight(int endpoint) {
		right = endpoint;
	}
	
	/**
	 * Get the the interval's right endpoint
	 * @return
	 */
	int getRight() {
		return right;
	}
	
	/**
	 * Get the the interval's endpoint
	 * @param a
	 * @return
	 */
	int getEndpoint(int a) {
		if(a == 0) {
			return left;
		}
		else {
			return right;
		}
		
	}
	 
	/**
	 * Set an ID for a interval
	 * @param id
	 */
	void setID(int id) {
		ID = id;
	}
	
	/**
	 * Get the the interval's ID
	 * @return
	 */
	int getID() {
		return ID;
	}
	/**
	 * This is a suggested way on how to add intervals and call POM()
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		int points[][] = {{0, 4}, {1, 6}, {3, 9}, {7, 11}};
		Intervals intv = new Intervals();
		
		for(int i=0; i<points.length; i++) {
			System.out.println("Inserting: "+ Arrays.toString(points[i]));
			intv.intervalInsert(points[i][0], points[i][1]);
		}
		System.out.println("POM is: "+ intv.findPOM()); //Should return 3.
	}

}
