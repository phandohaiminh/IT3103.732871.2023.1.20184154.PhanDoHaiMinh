// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Lab02

public class Aims {
    public static void main(String[] args) {
        Cart order = new Cart();
        DigitalVideoDisc dv1 = new DigitalVideoDisc("The Lions King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dv2 = new DigitalVideoDisc("Star Wars","Science Fiction","Geogre Lucas",124,24.95f);
        DigitalVideoDisc dv3 = new DigitalVideoDisc("Aladdin","Annimation","John Musker",90,  18.99f);
        
        order.addDigitalVideoDisc(dv1);
        order.addDigitalVideoDisc(dv2);
        order.addDigitalVideoDisc(dv3);


        float totalCost= order.totalCost();

        System.out.println("totalCost = "+totalCost);
        order.removeDigitalVideoDisc(dv1);
        order.removeDigitalVideoDisc(dv2);
        System.out.println("total order:"+order.getQtyOrder());
    }
}
