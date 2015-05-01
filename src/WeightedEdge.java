/**
 * WeightedEdge.java 
 * A simple utility class for storing and retrieving weighted graph edges. 
 * @author Chris Campell
 * @date 4/24/2015
 * @version 1.5
 */
public class WeightedEdge implements Comparable<WeightedEdge>{
	private int i; 
	private int j; 
	private int weight; 
	
	/**
	 * Constructor for Objects of type WeightedEdge. 
	 * @param start -the first point. 
	 * @param endpoint -the second point/endpoint. 
	 * @param weight -the weight of the edge. 
	 */
	public WeightedEdge(int start, int endpoint, int weight) {
		this.i = start; 
		this.j = endpoint; 
		this.weight = weight; 
	}
	/**
	 * Accessor method for start point i. 
	 * @return i -the starting point for the edge. 
	 */
	public int getStartPoint() {
		return i; 
	}
	/**
	 * Accessor method for end point j. 
	 * @return j -the end point for the edge. 
	 */
	public int getEndPoint() {
		return j; 
	}
	/**
	 * Accessor method for the edge's weight. 
	 * @return weight -the weight of the edge. 
	 */
	public int getWeight() {
		return weight; 
	}
	/**
	 * Overridden compareTo() compares the weights of two edges.
	 * @param WeightedEdge -The edge to compare against.  
	 */
	@Override
	public int compareTo(WeightedEdge obj) {
		return (this.weight - obj.getWeight()); 
	}
}
