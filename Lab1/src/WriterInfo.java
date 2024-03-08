public class WriterInfo {
    public static void main(String[] args) {

        Sweater s1 = new Sweater(15);
        s1.print();

        Pants p1 = new Pants();
        p1.print();

        Windbreaker w1 = new Windbreaker(10,"Ветровка");
        w1.print();

        DownJacket d1 = new DownJacket(20,"Пуховик",50, 100);
        d1.print();
    }
}
