public abstract class Jacket implements Clothes, Object{
    public int price;
    String type;

    public Jacket(int pr, String type){
        this.price = pr;
        this.type = type;
    }

    public int GetPrice (){
        return price;
    }

    public abstract String GetType();

    public float NewPrice (){
        price = price * 3;
        return price;
    }

    public void print () {
        System.out.println("Куртка. Старая цена - "+GetPrice()+"р. "+"Новая цена- "+NewPrice()+"р.");
    }
}
