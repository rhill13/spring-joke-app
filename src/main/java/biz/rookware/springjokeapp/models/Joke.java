package biz.rookware.springjokeapp.models;

public class Joke {
    
    private String Joke;

    public Joke(String joke) {
        Joke = joke;
    }

    public String getJoke() {
        return Joke;
    }

    public void setJoke(String joke) {
        Joke = joke;
    }

}
