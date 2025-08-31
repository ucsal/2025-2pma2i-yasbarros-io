package br.com.mariojp.solid.isp;

public class OfficeService {
    private final Printable printer;
    
    public OfficeService(Printable printer){ 
        this.printer = printer;
    }

    public void printReport(String content){
        printer.print(content);
    }

    
}
