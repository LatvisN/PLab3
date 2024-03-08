public class Pants implements Clothes, Object{
    private int price;

    public Pants(){
        super ();
        price = 12;
    }

    public int GetPrice (){
        return price;
    }

    public float NewPrice (){
        price = price * 5;
        return price;
    }

    public void print (){
        System.out.println("Штаны. Старая цена - "+GetPrice()+"р. "+"Новая цена- "+NewPrice()+"р.");
    }
}
