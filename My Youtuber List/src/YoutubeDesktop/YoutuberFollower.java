package YoutubeDesktop;

import java.util.ArrayList;

public class YoutuberFollower extends Persona {
    
    ArrayList<String> youtubers;
    Youtuber youtuber;
    
    public YoutuberFollower(){
        
    }

    public void seguirYoutuber(String nombreDeYoutuber) {
        
        if (youtuber.nombre.equals(nombreDeYoutuber)) {
            
            youtubers.add(nombreDeYoutuber);
            
        }
    }

    public void dejarSeguirYoutuber(String nombreDeYoutuber) {
        
        if (youtuber.nombre.equals(nombreDeYoutuber)) {
            
            youtubers.remove(nombreDeYoutuber);
            
        }
    }

    public boolean buscarYoutubers(String nombreDeYoutuber) {

        for (int i = 0; i < youtubers.size(); i++) {
            
            if (youtubers.get(i).equals(nombreDeYoutuber)) {
                
                return true;
                
            }
        }
        return false;
    }   
}