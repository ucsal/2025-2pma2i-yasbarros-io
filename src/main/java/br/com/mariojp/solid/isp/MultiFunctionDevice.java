package br.com.mariojp.solid.isp;

public class MultiFunctionDevice implements Printable, Scannable {

    @Override
    public void print(String content) {
        System.out.println("Printing...");
    }

    @Override
    public void scan(String targetFile) {
       System.out.println("Scanning...");
    }
 
}
