package exp2;

public class cdDVD extends officeSupplies {
	
	public String composer;
	public String[] song;
	
public cdDVD(int cost, String releaseDate,String coverTitle, String composerName,String songs){
		
		this.price = cost;
		this.releaseDate = releaseDate;
		this.composer = composerName;
		this.coverTitle = coverTitle;
		song = songs.split(",");
		
		
	}

}
