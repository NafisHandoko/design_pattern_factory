public class Ayam extends AbstractHewan {
    public Ayam() {
        super("petok petok", 2);
        this.intro();
    }

    public void intro() {
        System.out.printf("Ini adalah ayam, kakinya ada: %d%n", super.kaki);
    }

    public void bersuara() {
        System.out.println(super.suara);
    }
}
