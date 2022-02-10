package dev.ogabek.java.adapter;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.User;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<User> userList;

    private static final int TYPE_OPTION_VIEW = 0;
    private static final int TYPE_USER_VIEW = 1;

    @Override
    public int getItemViewType(int position) {
        if (position <= 1) {
            return TYPE_OPTION_VIEW;
        } else {
            return TYPE_USER_VIEW;
        }
    }

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_OPTION_VIEW) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_option, parent, false);
            return new OptionViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ContactViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = userList.get(position);

        if (holder instanceof ContactViewHolder) {
            ((ContactViewHolder) holder).profile.setImageResource(user.getImage());
            ((ContactViewHolder) holder).name.setText(user.getName());
            if (user.getLast().equals("online")) {
                ((ContactViewHolder) holder).last_seen.setTextColor(Color.BLUE);
            } else {
                ((ContactViewHolder) holder).last_seen.setTextColor(Color.parseColor("#90FFFFFF"));
            }
            ((ContactViewHolder) holder).last_seen.setText(user.getLast());
        }

        if (holder instanceof OptionViewHolder) {
            if (position == 0) {
                ((OptionViewHolder) holder).icon.setImageResource(R.drawable.ic_location);
                ((OptionViewHolder) holder).title.setText("Find People Nearby");
            } else {
                ((OptionViewHolder) holder).icon.setImageResource(R.drawable.ic_add_person);
                ((OptionViewHolder) holder).title.setText("Invite Friends");
            }
        }

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    private static class ContactViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView profile;
        TextView name, last_seen;

        public ContactViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_profile);
            name = view.findViewById(R.id.tv_full_name);
            last_seen = view.findViewById(R.id.last_seen);
        }
    }

    private static class OptionViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView title;

        public OptionViewHolder(View view) {
            super(view);

            icon = view.findViewById(R.id.icon);
            title = view.findViewById(R.id.title);
        }
    }
}
