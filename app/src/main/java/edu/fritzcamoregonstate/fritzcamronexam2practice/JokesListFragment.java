package edu.fritzcamoregonstate.fritzcamronexam2practice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class JokesListFragment extends Fragment {
    private RecyclerView mJokeRecyclerView;
    private JokeAdapter mJokeAdapter;

    private TextView mJokeTitle;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jokes_list, container, false);

        mJokeRecyclerView = (RecyclerView) view.findViewById(R.id.joke_recycler_view);
        mJokeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    private class JokeHolder extends RecyclerView.ViewHolder {
        public JokeHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_joke, parent, false));

            mJokeTitle = (TextView) itemView.findViewById(R.id.list_joke_title);
        }

        private Joke mJoke;

        private void bind(Joke joke) {
            mJoke = joke;
            mJokeTitle.setText(joke.getJokeTitle());
        }
    }

    private class JokeAdapter extends RecyclerView.Adapter<JokeHolder> {

        private List<Joke> mJokes;

        public JokeAdapter(List<Joke> jokes) {
            mJokes = jokes;
        }

        @Override
        public JokeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new JokeHolder(layoutInflater, parent);
        }
        @Override
        public void onBindViewHolder(JokeHolder holder, int position) {
            Joke joke = mJokes.get(position);
            holder.bind(joke);

        }

        @Override
        public int getItemCount() {
            return mJokes.size();
        }
    }

    private void updateUI() {
        JokeLab jokeLab = JokeLab.get(getActivity());
        List<Joke> jokes = jokeLab.getJokes();

        mJokeAdapter = new JokeAdapter(jokes);
        mJokeRecyclerView.setAdapter(mJokeAdapter);
    }

}
