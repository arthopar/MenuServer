package dto;
import java.io.Serializable;


public class CategoryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5035678653470477716L;

	private Integer categoryId;
	private String name;
	private String imagePath;
	
	public CategoryDto() {
		super();
	}
	
	public CategoryDto(db.Category dbObject) {
		super();
		
		this.categoryId = dbObject.getId();
		this.name = dbObject.getName();
		this.imagePath = dbObject.getImagePath();
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
}
