package Training;


public class TukangOjek {
    String nama;
    boolean helm;
    String motor;
    int duit;

    public TukangOjek(String nama) {
        this.nama = nama;
    }

    public void adaHelm() {
        System.out.println("Helm Ada!");
        this.helm = true;
    }

    public void tidakAdaHelm() {
        System.out.println("Helm Tidak Ada!");
        this.helm = false;

    }
}
