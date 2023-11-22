package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost, director, length);
	}
	public boolean equals(DigitalVideoDisc disc) {
		return this.getTitle().equals(disc.getTitle()) ? true : false;
	}
	public boolean isMatch(String title) {
		return this.getTitle().equals(title) ? true : false;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public String toString() {
		return "DVD " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + "$";
	}
}
