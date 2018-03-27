package co.mz.aulasandroid.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import co.mz.aulasandroid.Model.Generic;
import co.mz.aulasandroid.R;


/**
 * Created by SJ on 12/16/2017.
 */

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.MyViewHolder> {

    private Context mContext;
    private List<Generic> albumList;
    public mClickListener onClickListener;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.mClick(v, getAdapterPosition());
                }
            });
        }
    }

    public interface mClickListener {
        void mClick(View v, int position);
    }

    public DashboardAdapter(Context mContext, List<Generic> albumList, mClickListener listener) {
        this.mContext = mContext;
        this.albumList = albumList;
        this.onClickListener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dashboard, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Generic album = albumList.get(position);
        holder.title.setText(album.getNome());

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
