package pp.s1381970.q1_5;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class TypeUseSymbolTable{
	
	private Stack<Map<String, String>> s;
	
	/**
	 * Initializes a new Symbol Table
	 */
	public TypeUseSymbolTable() {
		this.s = new Stack<Map<String, String>>();
		openScope();
	}
	
	/**
	 * Opens a new scoop
	 */
	public void openScope() {
		s.push(new TreeMap<String, String>());
	}
	
	/**
	 * Closes the current scope
	 */
	public void closeScope() {
		if(s.size() <= 1){
			throw new RuntimeException();
		}
		else{
			s.pop();
		}
	}
	
	/**
	 * Tries to add a new id to the current scope with the given type
	 * @param id The ID which should be added
	 * @param type The type of the ID
	 * @return If the ID could be added
	 */
	public boolean add(String id, String type) {
		if(s.peek().containsKey(id)){
			System.out.println(s.peek().get(id));
			return false;
		}
		else{
			s.peek().put(id, type);
			return true;
		}
	}
	
	/**
	 * Checks if the given ID is in the current scope or one of it's parents.
	 * @param id The which is checked.
	 * @return If the given ID is found
	 */
	public boolean contains(String id) {
		boolean result = false;
		for(int i = this.s.size()-1; i >= 0; i--){
			if(this.s.get(i).containsKey(id)){
				result = true;
				break;
			}
		}
		return result;
	}
	
	/**
	 * Gives the type of the given ID
	 * @param id The ID for which the type will be returned
	 * @return The type of the ID or NULL if it's not found
	 */
	public String getType(String id){
		String result = null;
		for(int i = this.s.size()-1; i >= 0; i--){
			if(this.s.get(i).containsKey(id)){
				result = this.s.get(i).get(id);
				break;
			}
		}
		return result;
	}
}
