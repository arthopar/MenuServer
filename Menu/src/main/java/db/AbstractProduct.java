package db;

/**
 * AbstractProduct entity provides the base persistence definition of the
 * Product entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProduct implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3098717311271716542L;
	private Integer id;
	private Category category;
	private String name;
	private String descryption;
	private Double raiting;
	private Integer price;
	private String imagePath;
	private Integer minut;
	private Integer calories;
	
	// Constructors

	/** default constructor */
	public AbstractProduct() {
	}

	/** minimal constructor */
	public AbstractProduct(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractProduct(Integer id, Category category, String name,
			String descryption, Double raiting, Integer price, String imagePath, Integer minut, Integer calories) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.descryption = descryption;
		this.raiting = raiting;
		this.price = price;
		this.imagePath = imagePath;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescryption() {
		return this.descryption;
	}

	public void setDescryption(String descryption) {
		this.descryption = descryption;
	}

	public Double getRaiting() {
		return this.raiting;
	}

	public void setRaiting(Double raiting) {
		this.raiting = raiting;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getMinut() {
		return minut;
	}

	public void setMinut(Integer minut) {
		this.minut = minut;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

}