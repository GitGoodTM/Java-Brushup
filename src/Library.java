public class Library {
    private String name;
    private int yearOfEst;
    private Books[] books;

    Library(String name, int yearOfEst, Books[] books){
        this.name = name;
        this.yearOfEst = yearOfEst;
        this.books=books;
    }

    void displayLibraryInfo(){
        System.out.println("Name of the Library: "+ name + " Est:" + yearOfEst);
        System.out.println("Books available:");
        for (Books book: books){
            book.displayBookInfo();
        }
    }
}
