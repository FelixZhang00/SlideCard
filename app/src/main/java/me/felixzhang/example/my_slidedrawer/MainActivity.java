package me.felixzhang.example.my_slidedrawer;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.etsy.android.grid.StaggeredGridView;


public class MainActivity extends ActionBarActivity {

    private StaggeredGridView mPage;
    private int[] imgIds = new int[]{R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4, R.drawable.image5,
            R.drawable.image6, R.drawable.image7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPage = (StaggeredGridView) findViewById(R.id.page);
        mPage.setAdapter(new PageAdapter(this, imgIds));

    }


}
