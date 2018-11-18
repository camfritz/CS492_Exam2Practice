package edu.fritzcamoregonstate.fritzcamronexam2practice;

public class Joke {
    private String mJokeTitle;
    private Boolean mIsViewed;
    private String mJokeContent[];

    public Joke(String jokeTitle, String[] jokeContent) {
        mJokeTitle = jokeTitle;
        mIsViewed = false;
        mJokeContent = jokeContent;
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
}
