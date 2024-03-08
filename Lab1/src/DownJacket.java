public class DownJacket extends Jacket{
    private int length;
    private int wool;

    public DownJacket(int pr, String type,int len, int w){
        super(pr,type);
        length = len;
        wool = w;
    }

    public int GetPrice (){
        return price*2;
    }

    public int GetWool (){
        return wool;
    }

    public void print () {
        System.out.println("Пуховик. Старая цена - "+GetPrice()+"р. "+"Новая цена- "+NewPrice()+"р.");
    }

    public String GetType(){
        return type;
    }

    public float NewPrice (){
        price = price * 12;
        return price;
    }
}
