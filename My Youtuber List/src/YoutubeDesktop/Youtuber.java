package YoutubeDesktop;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Youtuber extends Persona {

    ArrayList<String> cantidadVideos;
    Video video;
    ArrayList<String> videosDelYoutuber;
    Youtube youtube;

    public Youtuber() {
        this.cantidadVideos = new ArrayList<String>();
        this.video = new Video();
        this.videosDelYoutuber = new ArrayList<String>();
        this.youtube = new Youtube();

    }

//    public Fecha agregarFecha(){
//        
//        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
//        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
//        int anio = Integer.parseInt(JOptionPane.showInputDialog("Anio"));
//        Fecha fecha = new Fecha(dia, mes, anio);
//        return fecha;
//        
//    }
    public void agregarVideos(String nombreDeVideo) {

        video.setNombreDeVideo(nombreDeVideo);
        cantidadVideos.add(nombreDeVideo);

    }

    public void eliminarVideos(String nombreDeVideo) {

        if (video.nombreDeVideo.equals(nombreDeVideo)) {

            cantidadVideos.remove(nombreDeVideo);

        }
    }

    public boolean buscarVideos(String nombreDeVideo) {

        for (int i = 0; i < cantidadVideos.size(); i++) {

            if (cantidadVideos.get(i).equals(nombreDeVideo)) {

                return true;

            }
        }
        return false;
    }

    public boolean existeYoutuber(String nombreDeYoutuber) {

        for (int i = 0; i < youtube.youtubers.size(); i++) {

            if (youtube.youtubers.get(i).equals(nombreDeYoutuber)) {

                return true;

            }
        }
        return false;
    }

    public int cantidadvideos(String youtuber) {

        int acumulador = 0;

        for (int i = 0; i < videosDelYoutuber.size(); i++) {

            if (videosDelYoutuber.get(i).equals(youtuber)) {

                acumulador += 1;

            }
        }
        return acumulador;
    }

}
