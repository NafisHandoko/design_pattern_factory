public abstract class AbstractHewan{
    protected String suara;
    protected int kaki;

    public AbstractHewan(String _suara, int _kaki){
        this.suara = _suara;
        this.kaki = _kaki;
    }

    public abstract void intro();
    public abstract void bersuara();
}