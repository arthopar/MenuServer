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
	private int price;
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
