package YoutubeDesktop;

public class Video {
    
    String nombreDeVideo;
    String uRL;
    Youtuber youtuber;
    
    public Video(){
        
    }
    
    public Video(String nombreDeVideo, String uRL){
        
        this.nombreDeVideo = nombreDeVideo;
        this.uRL = uRL;
        this.youtuber = youtuber;
        
    }

    public String getNombreDeVideo() {
        return nombreDeVideo;
    }

    public void setNombreDeVideo(String nombreDeVideo) {
        this.nombreDeVideo = nombreDeVideo;
    }

    public String getuRL() {
        return uRL;
    }

    public void setuRL(String uRL) {
        this.uRL = uRL;
    }

    public Youtuber getYoutuber() {
        return youtuber;
    }

    public void setYoutuber(Youtuber youtuber) {
        this.youtuber = youtuber;
    }
}