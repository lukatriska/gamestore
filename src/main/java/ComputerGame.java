public class ComputerGame {

    private float price;
    private ComputerGameParameters parameters;

    public ComputerGame(float price, ComputerGameParameters parameters)
    {
        this.price = price;
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

}
