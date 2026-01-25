public class Varargs {
    void main(){
        // varargs allow method to accept varying/undefined number of args
        // works by using three dots ... (ellipsis)
        System.out.println("Adding 1 and 2 : " + add(1,2));
        System.out.println("Adding 1,2 and 3 : " + add(1,2,3));
        System.out.println("Calling add method without any args gives us: " + add());
    }
    static int add(int...numbers){
        int add=0;
        for(int number:numbers){
            add+=number;
        }
        return add;
    }
}
