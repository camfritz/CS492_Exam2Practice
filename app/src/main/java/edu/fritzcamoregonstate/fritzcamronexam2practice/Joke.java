package edu.fritzcamoregonstate.fritzcamronexam2practice;

import java.util.UUID;

public class Joke {
    private String mJokeTitle;
    private Boolean mIsViewed;
    private String mJokeContent[];
    private UUID mJokeId;

    public Joke() {
        mJokeId = UUID.randomUUID();
        mIsViewed = false;
    }

    public String getJokeTitle() {
        return mJokeTitle;
    }

    public void setJokeTitle(String jokeTitle) {
        mJokeTitle = jokeTitle;
    }

    public Boolean getViewed() {
        return mIsViewed;
    }

    public void setViewed(Boolean viewed) {
        mIsViewed = viewed;
    }

    public String[] getJokeContent() {
        return mJokeContent;
    }

    public void setJokeContent(String[] jokeContent) {
        mJokeContent = jokeContent;
    }

    public UUID getJokeId() {
        return mJokeId;
    }
}
