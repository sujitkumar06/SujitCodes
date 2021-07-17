package equals_hashcode_override;

import java.util.HashSet;
import java.util.Iterator;

class Book
{
    int bookId;
    String name;
    
    public Book(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }
    
    
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
    
    @Override
    public boolean equals(Object obj) 
    {
        //return this.getBookId() == ((Book) obj).getBookId();
    if((this.getBookId() == ((Book) obj).getBookId())&& (this.getName() == ((Book) obj).getName())) 
    	
    	return true;
    else
    	return false;
    	
    }
    

    
    @Override
    public int hashCode()
   {
        return bookId;
    }


    public static void main(String arg[]) 
    {
        Book book1 = new Book(123, "Java");
        Book book2 = new Book(123, "Java");
        Book book3 = new Book(12, "Java");
        Book book4 = new Book(123, "sas");
        
        HashSet<Book> setOfBook = new HashSet<Book>();
        setOfBook.add(book1);
        setOfBook.add(book2);
        setOfBook.add(book3);
        setOfBook.add(book4);

        
       
       System.out.println("hascode : "+ book1.hashCode());
       
        System.out.println("Size of HashSet : "+ setOfBook.size());
        
        Iterator<Book> l= setOfBook.iterator();
       while(l.hasNext())
        System.out.println(l.next());
    }

    
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + "]";
	}
    }
