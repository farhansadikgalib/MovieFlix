package com.example.movieflix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> movieList;
    private Context context;

    public MovieAdapter(Context context,List<Movie> movieList) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        final Movie movie = movieList.get(position);
        holder.imageView.setImageResource(movie.getImage());
        holder.nameTV.setText(movie.getName());
        holder.yearTV.setText(movie.getYear());
        holder.categoryTV.setText(movie.getCategory());
        holder.menuTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(v.getContext(),v);
                MenuInflater inflater = popupMenu.getMenuInflater();
                inflater.inflate(R.menu.movie_menu,popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case  R.id.item_details:
                                Toast.makeText(context,movie.getName(),Toast.LENGTH_SHORT).show();
                                break;
                            case  R.id.item_edit:
                                break;

                            case  R.id.item_delete:
                                break;


                        }

                        return false;
                    }
                });
            }
        });


    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder{

            ImageView imageView;
            TextView nameTV,yearTV,categoryTV,menuTV;


        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView= itemView.findViewById(R.id.row_imeageView);
            nameTV= itemView.findViewById(R.id.row_name);
            yearTV= itemView.findViewById(R.id.row_year);
            categoryTV= itemView.findViewById(R.id.row_category);
            menuTV= itemView.findViewById(R.id.row_menu);
        }
    }
}
