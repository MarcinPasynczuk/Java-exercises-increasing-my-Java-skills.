import java.util.logging.Level;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >=0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }


    public int addToner(int tonerAmount){
        if (tonerAmount>0 && tonerAmount<=100) {
            if (this.tonerLevel+tonerAmount<=100){
                this.tonerLevel+=tonerAmount;
                return tonerLevel;
            }else {
                return -1;
            }

            }
        else {
            return -1;
        }


        }
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (int) Math.ceil(pages / 2.0);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }



    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
