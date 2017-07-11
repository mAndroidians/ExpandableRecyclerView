package com.example.shriyanshu.expandablerecyclerviewexampleandroid.holder;

import android.view.View;
import android.widget.TextView;

import com.example.shriyanshu.expandablerecyclerviewexampleandroid.ChildViewHolder;
import com.example.shriyanshu.expandablerecyclerviewexampleandroid.model.Movies;
import com.example.shriyanshu.expandablerecyclerviewexampleandroid.R;

public class MoviesViewHolder extends ChildViewHolder {

    private TextView mMoviesTextView;

    public MoviesViewHolder(View itemView) {
        super(itemView);
        mMoviesTextView = (TextView) itemView.findViewById(R.id.tv_movies);
    }

    public void bind(Movies movies) {
        mMoviesTextView.setText(movies.getName());
    }
}
