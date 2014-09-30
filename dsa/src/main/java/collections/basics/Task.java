/**
 * 
 */
package collections.basics;

/**
 * @author ganesh
 *
 */

enum Priority {
	HIGH, MEDIUM, LOW
};

public class Task implements Comparable<Task> {

	private Priority priority;

	protected String details;

	public int compareTo(Task o) {
		return toString().compareTo(o.toString());
	}

	/**
	 * @return the priority
	 */
	public Priority getPriority() {
		return priority;
	}

}
