public class ComputerGame {

    private float price;
    private int inStock;
    private ComputerGameParameters parameters;

    public ComputerGame(float price, int inStock, ComputerGameParameters parameters)
    {
        this.price = price;
        this.inStock = inStock;
        this.parameters = parameters;
    }

    public float getPrice()
    {
        return price;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public ComputerGameParameters getParameters()
    {
        return parameters;
    }

    public void setParameters(ComputerGameParameters parameters)
    {
        this.parameters = parameters;
    }

    public int getInStock()
    {
        return inStock;
    }

    public void setInStock(int inStock)
    {
        this.inStock = inStock;
    }

    @Override
    public String toString()
    {
        return "ComputerGame{" +
                "price=" + price +
                ", parameters=" + parameters +
                '}';
    }
}
