/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;


public class youtuber {
    
    int idyoutuber;
    ArrayList<video> videosyoutuber;

    public youtuber(int idyoutuber, ArrayList<video> videosyoutuber) {
        this.idyoutuber = idyoutuber;
        this.videosyoutuber = videosyoutuber;
    }

    public youtuber() {
    }

    public int getIdyoutuber() {
        return idyoutuber;
    }

    public ArrayList<video> getVideosyoutuber() {
        return videosyoutuber;
    }

    public void setIdyoutuber(int idyoutuber) {
        this.idyoutuber = idyoutuber;
    }

    public void setVideosyoutuber(ArrayList<video> videosyoutuber) {
        this.videosyoutuber = videosyoutuber;
    }
    
}
