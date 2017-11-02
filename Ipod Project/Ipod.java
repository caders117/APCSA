public class  IPod {
    
    private String name;
    private Song song;
    private Song[] songList = new Song[10];
    private int place = 0;
    
    public IPod (String n) {
        name = n; 
    }
    
    public void addSong(String t, String a, int s, String f) {
        song = new Song(t, a, s, f);
        songList[place] = song;
        place++;
    }
    
    public void playSong(int place){
        Mp3Player mp3 = new Mp3Player("C:/Users/rich8125/Downloads/" + songList[place-1].getFileName());
        mp3.play();
    }
    
    public String getSong(int i){
        return songList[i].toString();
    }
    
    public String toString() {
        String t = "";
        
        t = name + "'s iPod\n";
        for(int i = 0; i < songList.length; i++){
            if(songList[i] != null)
                t += (i+1) + ".   " + songList[i] + "\n";
        }   
        return t;
    }
}
