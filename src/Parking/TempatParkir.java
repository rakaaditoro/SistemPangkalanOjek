package Parking;

public class TempatParkir {
    String areaParkir;
    int dayaTampung;
    boolean parkirBuka;
    boolean tempatTersedia;

    public TempatParkir(String areaParkir, int dayaTampung){
        this.areaParkir = areaParkir;
        this.dayaTampung = dayaTampung;
        System.out.println (this.areaParkir);
        System.out.println (this.dayaTampung);
    }
    public void parkirBuka(){
        System.out.println ("Tempat Parkir Buka");
        this.parkirBuka = true;
    }
    public void parkirTutup(){
        System.out.println("Tempat Parkir Tutup");
        this.parkirBuka = false;
    }
    public void tempatTersedia(){
        System.out.println("Tempat Parkir Tersedia");
        this.tempatTersedia = true;
    }
    public void tempatTidakTersedia(){
        System.out.println("Tempat Parkir Penuh");
        this.tempatTersedia = false;
    }

}