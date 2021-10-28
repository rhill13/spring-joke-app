package biz.rookware.springjokeapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
@Primary
public class ChuckNorrisJokeService implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;
    
    public ChuckNorrisJokeService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
    

}
