package cap03;

public class Painting {
	private String title;
	private String artist;
	private String medium;
	private Double price;
	private Double galleryComission;
	public Painting() {
		title = "default";
		artist = "no artist";
		medium = "no medium";
		price = 0.0;
		galleryComission = 0.0;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public void setPrice(Double price) {
		this.price = price;
		galleryComission = price*0.20;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getMedium() {
		return medium;
	}
	public Double getPrice() {
		return price;
	}
	public Double getGalleryComission() {
		return galleryComission;
	}
	
}
