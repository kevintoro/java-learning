/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Clases.*;
import java.util.ArrayList;


public class personas {
    
    static ArrayList<persona> listaPersonas =  new ArrayList <persona> ();
    static ArrayList<persona> personayoutuber = new ArrayList <persona> ();
    static ArrayList<youtuber> listaYoutubers =  new ArrayList <youtuber> ();
    static ArrayList<video> listaVideos =  new ArrayList <video> ();
    static ArrayList<youtubeFollower> listaYoutuberFollower =  new ArrayList <youtubeFollower> ();
    static ArrayList<persona> personayoutuberfollower = new ArrayList <persona> ();
    
    //Gestionar Persona
    
    public void agregarPersona(persona ingresarpersona){
        listaPersonas.add(ingresarpersona);
    }
    
    public  ArrayList<persona> listaPersonasTodas(){
        return listaPersonas;
    }
    
    public void imprimirlistaPersona(){
        for( int i = 0 ; i  < listaPersonas.size(); i++){
           System.out.println("Lista --->"+listaPersonas.get(i).getNombres());
        }
    }
    
    public void eliminarPersona(persona deletepersona){
    
    }
    
    //Gestionar Youtuber
    public void agregarYoutuber(youtuber ingresaryoutuber){
        listaYoutubers.add(ingresaryoutuber);
    }
    
    public ArrayList<persona> buscarYoutuber(youtuber consultaryoutuber){
        
        persona validarpersona = new persona();
        
        for( int i = 0 ; i  < listaPersonas.size(); i++){
            if(listaPersonas.get(i).getIdpersona()==consultaryoutuber.getIdyoutuber()){
                validarpersona.setIdpersona(listaPersonas.get(i).getIdpersona());
                validarpersona.setNombres(listaPersonas.get(i).getNombres());
                validarpersona.setFechanacimiento(listaPersonas.get(i).getFechanacimiento());
                personayoutuber.add(validarpersona);
                //System.out.println("Lista Personas --->"+i+" "+listaPersonas.get(i).getNombres());
            }
        }
        return personayoutuber;
    }
    
    public persona consultarYoutuber(int idyoutuber, String nomyoutuber){
        
        persona personalyoutuber = null;
        
        for( int i = 0 ; i  < listaPersonas.size(); i++){
            if((listaPersonas.get(i).getIdpersona()==idyoutuber) || (listaPersonas.get(i).getNombres().equals(nomyoutuber))){
                personalyoutuber = new persona();
                personalyoutuber.setIdpersona(listaPersonas.get(i).getIdpersona());
                personalyoutuber.setNombres(listaPersonas.get(i).getNombres());
                personalyoutuber.setFechanacimiento(listaPersonas.get(i).getFechanacimiento());
            }
        }
        return personalyoutuber;
    }
    
    public ArrayList comboYoutuber(){
        return personayoutuber;
    }
    
    public ArrayList<youtuber> comboYoutuberVideo(){
        return listaYoutubers;
    }
    
    public boolean eliminarYoutuber(int idyoutuber, String nomyoutuber){
        
        boolean valeliminacion = false;
        
        for( int i = 0 ; i  < listaPersonas.size(); i++){
            if((listaPersonas.get(i).getIdpersona()==idyoutuber) || (listaPersonas.get(i).getNombres().equals(nomyoutuber))){
                
                for( int j = 0 ; j  < listaYoutubers.size(); j++){
                    if((listaYoutubers.get(j).getIdyoutuber()==listaPersonas.get(i).getIdpersona())){
                        listaYoutubers.remove(listaYoutubers.get(j));
                        valeliminacion = true;
                    }
                }
                
                for( int k = 0 ; k  < personayoutuber.size(); k++){
                    if((personayoutuber.get(k).getIdpersona()==listaPersonas.get(i).getIdpersona())){
                        personayoutuber.remove(personayoutuber.get(k));
                        valeliminacion = true;
                    }
                }
                
                listaPersonas.remove(listaPersonas.get(i));
                valeliminacion = true;
            }
        }
        
        return valeliminacion;
    }
    
    //Gestionar YoutuberFollower
    public void agregarYoutubeFollower(youtubeFollower ingresaryoutubeFollower){
        listaYoutuberFollower.add(ingresaryoutubeFollower);
    }
    
     public ArrayList<persona> buscarYoutuberFollower(youtubeFollower consultaryoutuberfollower){
        
        persona validarpersona = new persona();
        
        for( int i = 0 ; i  < listaPersonas.size(); i++){
            if(listaPersonas.get(i).getIdpersona()==consultaryoutuberfollower.getIdyoutuberFollower()){
                validarpersona.setIdpersona(listaPersonas.get(i).getIdpersona());
                validarpersona.setNombres(listaPersonas.get(i).getNombres());
                validarpersona.setFechanacimiento(listaPersonas.get(i).getFechanacimiento());
                personayoutuberfollower.add(validarpersona);
                //System.out.println("Lista Personas --->"+i+" "+listaPersonas.get(i).getNombres());
            }
        }
        return personayoutuberfollower;
    }
     
    public persona consultarYoutuberFollower(int idyoutuberfollower, String nomyoutuberfollower){
        
        persona personalyoutuberfollower = null;
        
        for( int i = 0 ; i  < listaPersonas.size(); i++){
            if((listaPersonas.get(i).getIdpersona()==idyoutuberfollower) || (listaPersonas.get(i).getNombres().equals(nomyoutuberfollower))){
                personalyoutuberfollower = new persona();
                personalyoutuberfollower.setIdpersona(listaPersonas.get(i).getIdpersona());
                personalyoutuberfollower.setNombres(listaPersonas.get(i).getNombres());
                personalyoutuberfollower.setFechanacimiento(listaPersonas.get(i).getFechanacimiento());
            }
        }
        return personalyoutuberfollower;
    }
     
    public boolean eliminarYoutuberFollower(int idyoutuberfollower, String nomyoutuberfollower){
        
        boolean valeliminacion = false;
        
        for( int i = 0 ; i  < listaPersonas.size(); i++){
            if((listaPersonas.get(i).getIdpersona()==idyoutuberfollower) || (listaPersonas.get(i).getNombres().equals(nomyoutuberfollower))){
                
                for( int j = 0 ; j  < listaYoutuberFollower.size(); j++){
                    if((listaYoutuberFollower.get(j).getIdyoutuberFollower()==listaPersonas.get(i).getIdpersona())){
                        listaYoutuberFollower.remove(listaYoutuberFollower.get(j));
                        valeliminacion = true;
                    }
                }
                
                for( int k = 0 ; k  < personayoutuberfollower.size(); k++){
                    if((personayoutuberfollower.get(k).getIdpersona()==listaPersonas.get(i).getIdpersona())){
                        personayoutuberfollower.remove(personayoutuberfollower.get(k));
                        valeliminacion = true;
                    }
                }
                
                listaPersonas.remove(listaPersonas.get(i));
                valeliminacion = true;
            }
        }
        
        return valeliminacion;
    }
    
    //Gestionar Video de Youtuber
    
    public video seleccionarVideoReproducir(String nombreyoutuber, String titulovideo){
        
        video videoreproducir = new video();
        
        ArrayList<video> videosyoutuber = new ArrayList<video> ();
        
        for(int i=0; i< personayoutuber.size(); i++){
            
            if(personayoutuber.get(i).getNombres().equals(nombreyoutuber)){
            
                for(int j=0; j< listaYoutubers.size(); j++){
                    
                    if(listaYoutubers.get(j).getIdyoutuber() == personayoutuber.get(i).getIdpersona()){
                        
                        videosyoutuber = listaYoutubers.get(j).getVideosyoutuber();
                        
                        for(int k = 0; k < videosyoutuber.size(); k++){
                            if(videosyoutuber.get(k).getTitulovideo().equals(titulovideo)){
                                videoreproducir.setIdyoutubervideo(videosyoutuber.get(k).getIdyoutubervideo());
                                videoreproducir.setTitulovideo(videosyoutuber.get(k).getTitulovideo());
                                videoreproducir.setURLvideo(videosyoutuber.get(k).getURLvideo());
                            }
                        }
                        
                    }
                    
                }
                
            }
          
        }
        
        return videoreproducir;
    
    }
    
    public persona videoYoutuber(String nombreyoutuber){
        
        persona validarpersona = new persona();
        
        for( int i = 0 ; i  < personayoutuber.size(); i++){
            if(personayoutuber.get(i).getNombres().equals(nombreyoutuber)){
                validarpersona.setIdpersona(personayoutuber.get(i).getIdpersona());
                validarpersona.setNombres(personayoutuber.get(i).getNombres());
                validarpersona.setFechanacimiento(personayoutuber.get(i).getFechanacimiento());
            }
        }
        
        return validarpersona;
    }
    
    public void agregarYoutuberVideo(video ingresarvideo){
        
        listaVideos.add(ingresarvideo);
        
        ArrayList<video> vidyoutuber =  new ArrayList <video> ();
        
        for( int i = 0 ; i  < listaYoutubers.size(); i++){
            if(listaYoutubers.get(i).getIdyoutuber() == ingresarvideo.getIdyoutubervideo()){
                for(int j=0; j < listaVideos.size(); j++){
                    if(listaVideos.get(j).getIdyoutubervideo() == ingresarvideo.getIdyoutubervideo()){
                        vidyoutuber.add(listaVideos.get(j));
                    }
                }
                listaYoutubers.get(i).setVideosyoutuber(vidyoutuber);
            }
        }
    }
    
    public ArrayList<video> buscarYoutuberVideo(int idyoutuber){
        
        ArrayList<video> listaVideosYoutuber =  null;
        
        for(int i = 0 ; i  < listaYoutubers.size(); i++){
            if(listaYoutubers.get(i).getIdyoutuber()==idyoutuber){
                listaVideosYoutuber = new ArrayList<video>();
                listaVideosYoutuber = listaYoutubers.get(i).getVideosyoutuber();
            }
        }
        
        return listaVideosYoutuber;
    }
    
    public ArrayList<video> consultarVideosYoutuber(){
        return listaVideos;
    }
    
    public void eliminarVideoYoutuber(video eliminarvideo){
        
        for(int j=0; j < listaVideos.size(); j++){
            if((listaVideos.get(j).getIdyoutubervideo() == eliminarvideo.getIdyoutubervideo()) &&
                (listaVideos.get(j).getTitulovideo().equals(eliminarvideo.getTitulovideo())) &&    
                 (listaVideos.get(j).getURLvideo().equals(eliminarvideo.getURLvideo())))   
            {
                listaVideos.remove(listaVideos.get(j));
            }
        }
        
        for(int i = 0 ; i  < listaYoutubers.size(); i++){
            if(listaYoutubers.get(i).getIdyoutuber() == eliminarvideo.getIdyoutubervideo()){
                for(int k= 0; k < listaYoutubers.get(i).getVideosyoutuber().size(); k++){
                    if((listaYoutubers.get(i).getVideosyoutuber().get(k).getIdyoutubervideo() == eliminarvideo.getIdyoutubervideo()) &&
                        (listaYoutubers.get(i).getVideosyoutuber().get(k).getTitulovideo().equals(eliminarvideo.getTitulovideo())) &&
                        (listaYoutubers.get(i).getVideosyoutuber().get(k).getURLvideo().equals(eliminarvideo.getURLvideo())))
                    {
                        listaYoutubers.get(i).getVideosyoutuber().remove(listaYoutubers.get(i).getVideosyoutuber().get(k));
                    }
                }
            }
        }
        
    
    }
    
}
