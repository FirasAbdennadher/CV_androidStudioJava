package iit.tn.mycv.iit.tn.mycv.ImageView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import iit.tn.mycv.R;

public class ImageAdapterTensor extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.bigdata,R.drawable.introdatascience,R.drawable.math,R.drawable.webscraping,R.drawable.tensor};

    public ImageAdapterTensor(Context context){
        mContext=context;
    }



    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}