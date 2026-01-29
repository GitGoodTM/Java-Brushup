public class AggregationExample {
    // aggregation represents the "has-a" relationship between objects
    // one object can have another object as a part of its structure
    // but the sub object can exist without the envelope object

    public static void main(String[] args) {

        //Books can be aggregated in a library as well as they can exist out of libraries

        Books book1 = new Books("Physics",100);
        Books book2 = new Books("Chemistry",123);
        Books book3 = new Books("Maths", 200);

        Books[] books = {book1,book2,book3};

        Library library = new Library("State Central Library, Trivandrum", 1829, books);

        library.displayLibraryInfo();
    }
}
