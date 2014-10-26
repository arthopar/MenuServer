package db;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
public class Product extends AbstractProduct implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = -879881721297418071L;

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Integer id) {
		super(id);
	}

	/** full constructor */
	public Product(Integer id, Category category, String name,
			String descryption, Double raiting, Integer price, String imagePath, Integer minut, Integer calories) {
		super(id, category, name, descryption, raiting, price, imagePath, minut, calories) ;
	}

}
