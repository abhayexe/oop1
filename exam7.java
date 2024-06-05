public class exam7{
    public static void main(String args[]){
        for(int i = 1; i<= 3; i++){
            multithread m1 = new multithread(i);
            m1.start();
            m1.join();//stop executing the program until the thread completes
        }
        // throw new RuntimeException();
    }
}
class multithread extends Thread{
    private int n;
    public multithread(int n){
        this.n = n;
    }
    @Override
    public void run(){
        for(int i = 1; i<= 5; i++){
            System.out.println(i+" from thread "+n);
            // if(n == 3){
            //     throw new RuntimeException();
            // }
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                
            }
        }
    }
}