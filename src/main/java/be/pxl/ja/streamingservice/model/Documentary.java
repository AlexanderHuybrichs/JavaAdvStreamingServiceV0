package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.opdracht1.Movie {

    private String topic;

    public Documentary(String title, be.pxl.ja.opdracht1.Rating maturityRating){
       super(title, maturityRating);
       setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play(){
        StringBuilder result = new StringBuilder();
        result.append("Playing documentary").append(this);
        if (topic != null){
            result.append(" on ").append(topic);
        }
        System.out.println(result.toString());
    }

    @Override
    public void pause() { System.out.println("Pausing documentary" +this);}
}
