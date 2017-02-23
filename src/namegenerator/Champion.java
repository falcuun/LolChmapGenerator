package namegenerator;

public class Champion {

    private String name;
    private int price;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public Champion setName(String name) {
        this.name = name;
        return this;
    }

    public Champion setPrice(int price) {
        this.price = price;
        return this;
    }
    
    public String toStringName(){
        return name;
    }
    public String toStringPrice(){
        return "" + price;
    }
}
