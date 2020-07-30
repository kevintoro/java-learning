/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class video {

    int idyoutubervideo;
    String titulovideo;
    String URLvideo;

    public video(int idyoutubervideo, String titulovideo, String URLvideo) {
        this.idyoutubervideo = idyoutubervideo;
        this.titulovideo = titulovideo;
        this.URLvideo = URLvideo;
    }

    public video() {
    }

    public int getIdyoutubervideo() {
        return idyoutubervideo;
    }

    public String getTitulovideo() {
        return titulovideo;
    }

    public String getURLvideo() {
        return URLvideo;
    }

    public void setIdyoutubervideo(int idyoutubervideo) {
        this.idyoutubervideo = idyoutubervideo;
    }

    public void setTitulovideo(String titulovideo) {
        this.titulovideo = titulovideo;
    }

    public void setURLvideo(String URLvideo) {
        this.URLvideo = URLvideo;
    }
   
}
