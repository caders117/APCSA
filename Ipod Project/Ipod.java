public class  IPod {
    
    private String name;
    private Song song;
    private Song[] songList = new Song[10];
    
    public IPod (String n) {
        name = n;
    }
    
    public void addSong(String t, String a, int s, String f, int place) {
        song = new Song(t, a, s, f);
        songList[place] = song;
    }
    
    public void playSong(int place){
        Mp3Player mp3 = new Mp3Player("C:/Users/rich8125/Desktop/Ipod Project/Songs/" + songList[place].getFileName());
        mp3.play();
    }
    
    public String getSong(int i){
        return songList[i].toString();
    }
    
    public String toString() {
        String t = "";
        
        t = name + "'s iPod\n";
        for(int i = 0; i < songList.length; i++){
            t += i + "    " + songList[i] + "\n";
        }   
        return t;
    }
}
