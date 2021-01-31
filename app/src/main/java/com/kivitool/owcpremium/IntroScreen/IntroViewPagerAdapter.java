package com.kivitool.owcpremium.IntroScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.kivitool.owcpremium.R;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    private Context context;
    private List<ScreenItems> screenItems;

    public IntroViewPagerAdapter(Context context, List<ScreenItems> screenItems) {
        this.context = context;
        this.screenItems = screenItems;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.layout_screen, null);

        ImageView image = view.findViewById(R.id.descriptionImage);
        TextView title = view.findViewById(R.id.txt_title);
        TextView description = view.findViewById(R.id.txt_description);

        title.setText(screenItems.get(position).getTitle());
        description.setText(screenItems.get(position).getDescription());
        image.setImageResource(screenItems.get(position).getImage());

        container.addView(view);

        return view;

    }

    @Override
    public int getCount() {
        return screenItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);

    }
}

