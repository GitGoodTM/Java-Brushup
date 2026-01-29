public class Books {
    private String subject;
    private int pages;

    Books(String subject, int pages){
        this.subject = subject;
        this.pages = pages;
    }

    public void displayBookInfo(){
        System.out.println("Subject: " + subject +" " + "pages: "+ pages);
    }
}
