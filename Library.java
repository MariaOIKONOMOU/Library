

package libraryexcersise;


public class Library {
    Book[] book;
boolean result;

    public Library(Book[] book) {
        this.book = book;
    }

  
    public void printAvailableBooks(){
         System.out.println("Available books: ");
        for(Book book : book){
            if(book.isAvailable()==true){
                System.out.println(book);
            }
        }
    }
    
    public void printBooksFromAuthor(Author authorToSearch){
          System.out.println(authorToSearch + " books: ");
        for(Book book : book){
            if(book.author == authorToSearch)
                System.out.println(book);
        }
    }
    
    public void printTheMostPopularBook(){
        int max=book[0].timesRented;
        int index = 0;
        for(int i=1; i<book.length;i++){
            if(book[i].timesRented>max){
                max = book[i].timesRented;
                index = i;
            }
        }
        System.out.println("The most popular book is: " + book[index]);
    }
   
    public void printBookDetails(String bookTitle){
        
         for(Book book : book){
            if(book.title == bookTitle){
                System.out.println(book);
            }
        }
        
        
        
    }
}
