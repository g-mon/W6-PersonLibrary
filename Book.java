public class Book{
    
    private String title;
    private Person author;
    private int loanPeriod;
    
    public Book(String title, Person author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
}