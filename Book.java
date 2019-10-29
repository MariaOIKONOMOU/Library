
package libraryexcersise;


public class Book {
    String title;
    Author author;
    String isbn;
    int physicalCopies;
    int availableCopies;
    int timesRented;

    public Book(String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.physicalCopies = physicalCopies;
        this.availableCopies = availableCopies;
        this.timesRented = timesRented;
    }
    public Book(String title){
        this.title =title;
    }
    
    public boolean isAvailable(){
        if (this.availableCopies>0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean hasAuthor(String author){
        if(this.author.name==author){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", isbn=" + isbn + ", physicalCopies=" + physicalCopies + ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + '}';
    }
  
}
