package db;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCategory entity provides the base persistence definition of the
 * Category entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String imagePath;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCategory() {
	}

	/** full constructor */
	public AbstractCategory(String name, String imagePath, Set products) {
		this.name = name;
		this.imagePath = imagePath;
		this.products = products;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}