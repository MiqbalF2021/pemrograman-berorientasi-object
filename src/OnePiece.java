abstract class OnePiece {
    protected String nama;

    public OnePiece(String nama){
        this.nama = nama;
    }

    public abstract void bounty(); //method abstract

    public void info(){
        System.out.println("Nama Karakter : " + nama);
    }
}
