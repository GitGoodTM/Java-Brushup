public class StringBufferAndStringBuilderExample {
    // StringBuffer and StringBuilder help us to make strings mutable

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sooraj");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" Kumar");
        System.out.println(sb);
        System.out.println(sb.capacity());
        //StringBuffer is thread safe, StringBuilder is not

        //sb.setCharAt();
        //sb.charAt();
        //sb.deleteCharAt();
        //sb.delete();
    }
}
