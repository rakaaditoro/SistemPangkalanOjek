package Parking;

public class RunSistemTempatParkir {

public static void main(String[] args){
    TempatParkir menaraPalma = new TempatParkir("Block A", 200);
    TukangParkir menaraPalma1 = new TukangParkir("Tanda Bukti Sewa Parkir");
    Kostumer menaraPalma2 = new Kostumer();
    menaraPalma.parkirBuka();
    menaraPalma.tempatTersedia();
    //menaraPalma1.kasihTiketParkir();
    //menaraPalma2.motor();
    //menaraPalma2.tiketParkir();
}
}
