package db;

import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */
public class Category extends AbstractCategory implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 676855231416193111L;

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String name, String imagePath, Set<?> products) {
		super(name, imagePath, products);
	}

}
