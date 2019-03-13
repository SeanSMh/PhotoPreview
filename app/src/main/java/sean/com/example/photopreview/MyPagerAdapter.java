package sean.com.example.photopreview;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * pagerAdapter
 * @author Sean
 * @data 2019/3/13
 */
public class MyPagerAdapter extends PagerAdapter {

    private List<PhotoBean> mList = new ArrayList<>();

    public MyPagerAdapter(List<PhotoBean> list) {
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        PhotoView mPhotoView = new PhotoView(container.getContext());
        Glide.with(container.getContext()).load(mList.get(position).getUrl()).into(mPhotoView);
        container.addView(mPhotoView, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        return mPhotoView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
