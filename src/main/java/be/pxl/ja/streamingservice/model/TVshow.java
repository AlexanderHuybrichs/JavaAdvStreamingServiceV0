package be.pxl.ja.streamingservice.model;

public final class TVshow extends be.pxl.ja.opdracht1.Content {
    private int numberOfSeasons;

    public TVshow  (String title, be.pxl.ja.opdracht1.Rating maturityRating, int numberOfSeasons){
        super(title, maturityRating);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons(){
        return numberOfSeasons;
    }
}
