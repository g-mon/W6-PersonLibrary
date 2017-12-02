import java.util.ArrayList;
public class LibraryMember{
    
    private Person member;
    private int loanLimit;
    private ArrayList<Book> BooksOnLoan;
    
    public LibraryMember(Person member){
        this.member=member; //the Person whose account it is must be specified
        loanLimit=2;
        BooksOnLoan= new ArrayList<Book>();
    }

    public void borrow(Book b, int d){
        int bookCount=BooksOnLoan.size();
        if(bookCount<=loanLimit){
            BooksOnLoan.add(b);
        }
        else{
            System.out.println("You have exceeded the number of books you are allowed to borrow.");
        }
    }
    public void returnBook(Book b){
        BooksOnLoan.remove(b);
    }
    
    public void printBorrowed(){
        int index=0;
        System.out.println(member.getName()+" is currently borrowing the following books:");
        while(index<=loanLimit-1){
            System.out.println(BooksOnLoan.get(index).getTitle());
            index++;
        }
    }
            
   
}