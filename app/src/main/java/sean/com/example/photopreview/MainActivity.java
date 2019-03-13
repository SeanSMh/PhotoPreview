package sean.com.example.photopreview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private PhotoView mPhotoView;


    private Button tiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tiao = (Button) findViewById(R.id.tiaozhuan);

        tiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "你好", Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = getSupportFragmentManager();
                //开启事务
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, new PhotoPreviewFragment());
                transaction.commit();
            }
        });


        //mViewPager.addOnPageChangeListener();
        /*Glide.with(this).load("http://img4.duitang.com/uploads/item/201307/02/20130702113059_UEGL2.jpeg")
                .into(mPhotoView);*/

    }
}
