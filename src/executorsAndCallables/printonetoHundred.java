package executorsAndCallables;

public class printonetoHundred implements Runnable{
    int num ;
    printonetoHundred(int num){
        this.num=num ;
    }
    @Override
    public void run() {
        System.out.println(num + " this is printed by : " + Thread.currentThread().getName());
    }
}
