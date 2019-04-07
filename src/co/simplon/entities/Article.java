package co.simplon.entities;

public class Article {
	private int IdArticle;
	private String Description;
	private String Brand;
	private double UnitaryPrice;

	public Article(int IdArticle,String Description,String Brand,double UnitaryPrice) {
		this.IdArticle=IdArticle;
		this.Description=Description;
		this.Brand=Brand;
		this.UnitaryPrice=UnitaryPrice;
		
	}

	@Override
	public String toString() {
		return "Article [IdArticle=" + IdArticle + ", Description=" + Description + ", Brand=" + Brand
				+ ", UnitaryPrice=" + UnitaryPrice + "]";
	}

	public int getIdArticle() {
		return IdArticle;
	}

	public void setIdArticle(int idArticle) {
		IdArticle = idArticle;
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

	public double getUnitaryPrice() {
		return UnitaryPrice;
	}

	public void setUnitaryPrice(double unitaryPrice) {
		UnitaryPrice = unitaryPrice;
	}
}
