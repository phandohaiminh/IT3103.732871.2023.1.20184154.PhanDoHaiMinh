package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
		super(id, title, category, cost, director);
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("the " + track.getTitle() + " has been added");
		}
		else System.out.println("the track " + track.getTitle() + " is already");
	}
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("the " + track.getTitle() + " has been removed");
		}
		else System.out.println("that the track " + track.getTitle() + " is not in");
	}
	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	@Override
	public void play() {
		for (Track track : tracks) {
			track.play();
		}
	}
	public String toString() {
		return "CD " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getArtist() + " : " + this.getCost() + "$";
	}
}
