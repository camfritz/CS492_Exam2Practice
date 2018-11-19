package edu.fritzcamoregonstate.fritzcamronexam2practice;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JokeLab {

    private static JokeLab sJokeLab;

    private List<Joke> mJokes;

    public static JokeLab get(Context context) {
        if (sJokeLab == null) {
            sJokeLab = new JokeLab(context);
        }
        return sJokeLab;
    }

    private JokeLab(Context context) {
        mJokes = new ArrayList<>();

        String[] jokeContent = {
                "Marc",
                "Marc Who?",
                "Marc Rubin"
        };

        for (int i = 0; i < 100; i++) {
            Joke joke = new Joke();
            joke.setJokeTitle("Joke #" + i);
            joke.setJokeContent(jokeContent);
            mJokes.add(joke);
        }
    }

    public List<Joke> getJokes() {
        return mJokes;
    }

    public Joke getJoke(UUID id) {
        for (Joke joke : mJokes) {
            if (joke.getJokeId().equals(id)) {
                return joke;
            }
        }
        return null;
    }

}
