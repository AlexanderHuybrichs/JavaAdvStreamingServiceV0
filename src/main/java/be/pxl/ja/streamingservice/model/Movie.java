package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends be.pxl.ja.opdracht1.Content implements Playable{
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public static final int LONG_PLAYING_TIME = 135;


    public Movie(String title, be.pxl.ja.opdracht1.Rating maturityRating) {super(title, maturityRating);}

    public Movie(){
        super("default", be.pxl.ja.opdracht1.Rating.MATURE);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDirector() {return director;}

    public void setDirector(String director)
    {this.director = director;}

    public LocalDate getReleaseDate() {return releaseDate;}

    public void setReleaseDate(LocalDate releaseDate)
    {this.releaseDate = releaseDate;}

    public int getDuration() {return duration;}

    public void setDuration(int duration)
    {this.duration = duration;}

    @Override
    public void pause() {
        System.out.println("Playing " + this);
    }

    @Override
    public void play() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime(){
        return duration > LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        if(duration == 0){
            return "?";
        }else if((duration < 60)){
            return duration + " min";
        }else{
            if ((duration % 60) != 0){
               return (duration / 60) + " h " + (duration % 60) + " min";
            }else{
                return duration / 60 + " h";
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder(super.toString());
        if(releaseDate != null) {
            builder.append(" (").append(releaseDate.getYear()).append(")");
        }
        return builder.toString();
    }

}
