public abstract class Productforsale {

    protected String type;
    protected double price;
    protected String description;

    public Productforsale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getslaesprice(int quanttit)
    {
        return quanttit *price;
    }

    public void printpricedintem(int qun){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",qun,price,type,description);
    }

    public abstract void showdetails();


}

