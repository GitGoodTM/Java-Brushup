public class Product <T, U> {

    T item;
    U price;

    Product(T item, U price){
        this.item=item;
        this.price=price;
    }

    public void getProduct(){
        System.out.println("Product: "+ item +" Price: "+ price);
    }

}
