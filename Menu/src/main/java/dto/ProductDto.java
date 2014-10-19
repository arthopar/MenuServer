package dto;

import java.io.Serializable;

public class ProductDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5172686590827527119L;

	private Integer categoryId;
	private Integer productId;
	
	private String name;
	private String description;
	private Integer raiting;
	private Double price;
	private Integer minutes;
	private Integer calories;
	private String imagePath;
	
	public ProductDto(db.Product dbObject) {
		super();
		
		this.categoryId = dbObject.getId();
		this.name = dbObject.getName();
		this.imagePath = dbObject.getImagePath();
		this.description = dbObject.getDescryption();
		this.raiting = dbObject.getRaiting();
		this.price = dbObject.getPrice();
		this.minutes = dbObject.getMinut();
		this.calories = dbObject.getCalories();
	}
	
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getRaiting() {
		return raiting;
	}
	public void setRaiting(Integer raiting) {
		this.raiting = raiting;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
