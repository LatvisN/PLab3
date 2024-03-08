public class Windbreaker extends Jacket{

    public Windbreaker(int pr, String type){
        super (pr, type);
    }

    public int GetPrice (){
        return price*3;
    }

    public void print () {
        System.out.println(GetType()+". Старая цена - "+GetPrice()+"р. "+"Новая цена- "+NewPrice()+"р.");
    }

    public String GetType(){
        return type;
    }

    public float NewPrice (){
        price = price * 10;
        return price;
    }
}
