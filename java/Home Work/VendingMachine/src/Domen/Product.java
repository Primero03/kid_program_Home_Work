package Domen;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;

        if(price > 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 10;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product: price: "+ this.price+"; name: "+this.name;
    }
    
}
