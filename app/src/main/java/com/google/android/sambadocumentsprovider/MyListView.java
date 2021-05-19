package com.google.android.sambadocumentsprovider;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

//added to project for automatic List height ->  android:layout_height="wrap_content"
//without MyListView, all items shown in one row height.
//if we set height to specific number -> android:layout_height="320dp"
//if no items in list or credentials input is open. scroll so much.
//its best with automatic height settings.
public class MyListView extends ListView {

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}