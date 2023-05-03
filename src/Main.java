public class Main {
    public static void main(String [] args){
        Luffy luffy = new Luffy("Monkey D Luffy");
        Sanji sanji = new Sanji("Kuro ashi no Sanji");
        Shanks shanks = new Shanks("Akagami no Shanks");

        System.out.println("Bounty Karakter OnePiece");
        luffy.info();
        luffy.bounty();

        sanji.info();
        sanji.bounty();

        shanks.info();
        shanks.bounty();
    }
}
