package exp2;

public class book extends officeSupplies {

	public String publisher;
	public String[] author;
	public int numberOfPages;
	
public book(int cost, String releaseDate,String publisherName, String coverTitle,String author,int numPages){
		
		this.price = cost;
		this.releaseDate = releaseDate;
		this.publisher = publisherName;
		this.coverTitle = coverTitle;
		this.author = author.split(",");;
		this.numberOfPages = numPages;
		
	}
}
