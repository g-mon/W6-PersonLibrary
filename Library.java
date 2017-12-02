import java.util.ArrayList;
public class Library{
    
    private ArrayList<LibraryMember> memberList;
    private ArrayList<Book> bookList;
    
    public Library(){
        memberList=new ArrayList<LibraryMember>();
        bookList=new ArrayList<Book>();
    }
    
    public void enrolMember(LibraryMember lm){
        memberList.add(lm);
    }
    
    public void enrolBook(Book b){
        bookList.add(b);
    }
}
    
    