package br.com.mariojp.solid.isp;

public class SimplePrinter implements Printable {

    @Override public void print(String content){ 
        System.out.println("Printing..."); 
    }
}
