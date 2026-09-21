package jdbc.model;

public class Article {
	
	private int idArticle;
	private String Description;
	private String Brand;
	private float UnitaryPrice;
	
	public Article(int idArticle, String Description, String Brand, float UnitatyPrice) {
		this.idArticle = idArticle;
		this.Description = Description;
		this.Brand = Brand;
		this.UnitaryPrice = UnitatyPrice;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public float getUnitaryPrice() {
		return UnitaryPrice;
	}

	public void setUnitaryPrice(float unitaryPrice) {
		UnitaryPrice = unitaryPrice;
	}

	@Override
	public String toString() {
		return "Article [getIdArticle()=" + getIdArticle() + ", getDescription()=" + getDescription() + ", getBrand()="
				+ getBrand() + ", getUnitaryPrice()=" + getUnitaryPrice() + "]";
	}
	
	

}
