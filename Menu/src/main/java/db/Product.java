package db;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
public class Product extends AbstractProduct implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Integer id) {
		super(id);
	}

	/** full constructor */
	public Product(Integer id, Category category, String name,
			String descryption, Integer raiting, Double price, String imagePath) {
		super(id, category, name, descryption, raiting, price, imagePath);
	}

}
