import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("\f");
        Scanner scan = new Scanner(System.in);
        IPod ipod = new IPod("Cade");
        
        ipod.addSong("I want you back", "Jackson 5", 179, "I want you back.mp3");
        ipod.addSong("Bohemian Rhapsody", "Queen", 179, "Bohemian Rhapsody.mp3");
        ipod.addSong("You Should Be Dancing", "Bee Gees", 179, "You Should Be Dancing.mp3");
        ipod.addSong("Gucci Gang", "Lil Pump", 125, "Gucci Gang.mp3");
        
        System.out.println(ipod);
        System.out.print("Which song do you want to play? ");
        int song = scan.nextInt();
        ipod.playSong(song);
        System.out.println("Playing " + ipod.getSong(song-1));
    }
}
