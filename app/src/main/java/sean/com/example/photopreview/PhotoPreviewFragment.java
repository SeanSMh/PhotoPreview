package sean.com.example.photopreview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class PhotoPreviewFragment extends Fragment {
    private ViewPager mViewPager;
    private LinearLayout mLinearLayout;

    public PhotoPreviewFragment() {
        // Required empty public constructor
    }


    public static PhotoPreviewFragment newInstance() {
        PhotoPreviewFragment fragment = new PhotoPreviewFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_photo_preview, container, false);

        mViewPager = (ViewPager) view.findViewById(R.id.myViewPager);
        mLinearLayout = (LinearLayout) view.findViewById(R.id.linearlayout);
        List<PhotoBean> mList = new ArrayList<>();
        mList.add(new PhotoBean("http://img4.duitang.com/uploads/item/201307/02/20130702113059_UEGL2.jpeg"));
        // mList.add(new PhotoBean("http://img0.imgtn.bdimg.com/it/u=985035006,79865976&fm=21&gp=0.jpg"));
        mList.add(new PhotoBean("http://img5.imgtn.bdimg.com/it/u=1774291582,2563335167&fm=21&gp=0.jpg"));
        mList.add(new PhotoBean("http://img5.imgtn.bdimg.com/it/u=1511364704,3337189105&fm=21&gp=0.jpg"));

        mViewPager.setAdapter(new MyPagerAdapter(mList));
        mViewPager.addOnPageChangeListener(new MyPageIndictor(getContext(), mLinearLayout, 3));

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
