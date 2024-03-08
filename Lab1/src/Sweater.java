public class Sweater implements Clothes, Object{
    private int price;

    public Sweater(int pr){
        price = pr;
    }

    public int GetPrice (){
        return price;
    }

    public float NewPrice (){
        price = price * 2;
        return price;
    }

    public void print (){
        System.out.println("Свитер. Старая цена - "+GetPrice()+"р. "+"Новая цена- "+NewPrice()+"р.");
    }
}
