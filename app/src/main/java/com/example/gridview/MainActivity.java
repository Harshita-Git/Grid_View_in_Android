package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.view);
         class ImageAdapter extends BaseAdapter
        {
            private Context mContext;
            public Integer[] mThumbIds = {
                    R.drawable.pic_1, R.drawable.pic_2, R.drawable.pic_3, R.drawable.pic_4, R.drawable.pic_5, R.drawable.pic_6,
                    R.drawable.pic_7, R.drawable.pic_8, R.drawable.pic_10, R.drawable.pic_11, R.drawable.pic_12,R.drawable.pic_13,
                    R.drawable.pic_14,R.drawable.pic_15,R.drawable.pic_16, R.drawable.pic_17, R.drawable.pic_18,R.drawable.pic_1,
                    R.drawable.pic_2,R.drawable.pic_3, R.drawable.pic_9,R.drawable.pic_4,R.drawable.pic_5,R.drawable.pic_6,R.drawable.pic_7,
                    R.drawable.pic_9,R.drawable.pic_8,R.drawable.pic_9,R.drawable.pic_10,R.drawable.pic_11,R.drawable.pic_12,R.drawable.pic_9,
                    R.drawable.pic_13,R.drawable.pic_14,R.drawable.pic_15, R.drawable.pic_16,R.drawable.pic_17,R.drawable.pic_18,
                    R.drawable.pic_1,R.drawable.pic_2,R.drawable.pic_3
            };
            public ImageAdapter(Context c){
                mContext = c;
            }
            @Override
            public int getCount() {
                return mThumbIds.length;
            }
            @Override
            public Object getItem(int position) {
                return mThumbIds[position];
            }
            @Override
            public long getItemId(int position) {
                return 0;
            }
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView = new ImageView(mContext);
                imageView.setImageResource(mThumbIds[position]);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
                return imageView;
            }
        }
        gridView.setAdapter(new ImageAdapter(this));
    }
}