
package libraryexcersise;

public class Labrarian {
    Library library;

   public Labrarian(){
       
   }

    public Labrarian(Library library) {
        this();
        this.library = library;
    }
    
    public void findMeBook(String bookTitle){
        library.printBookDetails(bookTitle);
        
}
    
    public void findMeBooksFromAuthor(Author author){
           library.printBooksFromAuthor(author);
    }

    public void findMeAvailableBooks(){
     library.printAvailableBooks();

    }
      public void findMostPopularBook(){
           library.printTheMostPopularBook();
      }
       
      public boolean rentBok(Book bookToRent){
           if(bookToRent.isAvailable() == true){
            bookToRent.availableCopies--;
            bookToRent.timesRented++;
            System.out.println(bookToRent + ": Rental completed");
        }else{
            System.out.println(bookToRent + ": Sorry, this book is not available!");
        }
        return true; 
    }
      }
    

  

