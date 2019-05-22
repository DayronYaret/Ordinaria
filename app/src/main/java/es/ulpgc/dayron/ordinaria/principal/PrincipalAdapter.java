package es.ulpgc.dayron.ordinaria.principal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.dayron.ordinaria.R;
import es.ulpgc.dayron.ordinaria.app.Item;

public class PrincipalAdapter extends RecyclerView.Adapter<PrincipalAdapter.ViewHolder> {

        private List<Item> itemList;
        private final View.OnClickListener clickListener;

        public PrincipalAdapter(View.OnClickListener listener) {
            itemList = new ArrayList<>();
            clickListener = listener;

        }

        public void setItems(List<Item> items) {
            itemList = items;
            notifyDataSetChanged();
        }

        public void addItem(Item item) { itemList.add(item);
            notifyDataSetChanged();
        }

        public void addItems(List<Item> items) {
            itemList.addAll(items);
            notifyDataSetChanged();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView idTextView;

            ViewHolder(View view) {
                super(view);
                idTextView = view.findViewById(R.id.idTextView);

            }
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.principal_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
            holder.itemView.setTag(itemList.get(position));
            holder.itemView.setOnClickListener(clickListener);

            holder.idTextView.setText(Integer.toString(itemList.get(position).getId()));
        }

    }

