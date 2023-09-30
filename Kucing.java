public class Kucing extends AbstractHewan {
    public Kucing() {
        super("meong", 4);
        this.intro();
    }

    public void intro() {
        System.out.printf("Ini adalah kucing, kakinya ada: %d%n", super.kaki);
    }

    public void bersuara() {
        System.out.println(super.suara);
    }
}
