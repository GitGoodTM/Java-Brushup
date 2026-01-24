public class BreakAndContinue {
    void main(){
        // break is used to get out of a loop
        // continue is used to skip an iteration
        int i,j,k;

        for(i=0;i<3;i++){
            // loop 1
            System.out.println("loop 1 iteration " + (i+1));
            if(i==2){
                System.out.println("break in loop 1");
                break;
            }else if(i==1){
                System.out.println("continue in loop 1");
                continue;
            }
            for(j=0;j<3;j++){
                //loop 2
                System.out.println("loop 2 iteration " + (j+1));
                if(j==2){
                    System.out.println("break in loop 2");
                    break;
                }else if(j==1){
                    System.out.println("continue in loop 2");
                    continue;
                }
                for(k=0;k<3;k++){
                    //loop 3
                    System.out.println("loop 3 iteration " + (k+1));
                    if(k==2){
                        System.out.println("break in loop 3");
                        break;
                    }else if(k==1){
                        System.out.println("continue in loop 3");
                        continue;
                    }
                }
            }
        }
    }
}
