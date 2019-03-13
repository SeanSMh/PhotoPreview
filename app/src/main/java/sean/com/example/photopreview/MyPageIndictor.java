package sean.com.example.photopreview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * 圆点指示器
 * @author Sean
 * @data 2019/3/13
 */
public class MyPageIndictor implements ViewPager.OnPageChangeListener {

    private int pageCount;  //页数
    private List<ImageView> mImageList;  //保存image总个数
    private int img_select;
    private int img_selected;

    public MyPageIndictor(Context context, LinearLayout linearLayout, int pageCount) {
        this.pageCount = pageCount;

        mImageList = new ArrayList<>();
        img_select = R.drawable.select;
        img_selected = R.drawable.selected;

        final int imagSize = 25;

        for(int i=0; i<pageCount; i++) {
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
            //为小圆点添加左右间距
            params.leftMargin = 10;
            params.rightMargin = 10;
            //给小圆点一个默认的大小
            params.height = imagSize;
            params.width = imagSize;

            if(i == 0) {
                imageView.setBackgroundResource(img_selected);
            } else {
                imageView.setBackgroundResource(img_select);
            }
            //为LinearLayout添加ImageView
            linearLayout.addView(imageView, params);
            mImageList.add(imageView);
        }
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int position) {
        for(int i=0; i<pageCount; i++) {
            //选中的页面改变小圆点为选中状态，反之未选中
            if((position % pageCount) == i) {
                (mImageList.get(i)).setBackgroundResource(img_selected);
            } else {
                (mImageList.get(i)).setBackgroundResource(img_select);
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
