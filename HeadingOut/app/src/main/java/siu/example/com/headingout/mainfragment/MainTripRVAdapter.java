package siu.example.com.headingout.mainfragment;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import siu.example.com.headingout.R;
import siu.example.com.headingout.model.TestTrip;

/**
 * Created by samsiu on 4/29/16.
 */
public class MainTripRVAdapter extends RecyclerView.Adapter<MainTripRVAdapter.TripViewHolder>{

    private static final String TAG = MainTripRVAdapter.class.getSimpleName();
    private final List<TestTrip> tripList;

    public static class TripViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView tripNameTextView;

        TripViewHolder(View itemView){
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.main_trip_item_cardView);
            tripNameTextView = (TextView)itemView.findViewById(R.id.main_card_tripItem_textView);
        }

    }

    public MainTripRVAdapter(List<TestTrip> tripList){
        this.tripList = tripList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public TripViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_trip_item_cardview, parent, false);
        TripViewHolder tripViewHolder = new TripViewHolder(view);
        return tripViewHolder;
    }

    @Override
    public void onBindViewHolder(TripViewHolder holder, final int position) {
        holder.tripNameTextView.setText(tripList.get(position).getLocation());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: CARD CLICKED NUMBER ===>> " + position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }


}
