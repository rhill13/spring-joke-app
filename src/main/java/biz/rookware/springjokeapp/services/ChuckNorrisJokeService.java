package biz.rookware.springjokeapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
@Primary
public class ChuckNorrisJokeService implements JokeService {

    @Override
    public String getJoke() {

        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
        
    }
    

}
