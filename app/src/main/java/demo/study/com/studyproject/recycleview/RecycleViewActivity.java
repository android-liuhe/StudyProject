package demo.study.com.studyproject.recycleview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import demo.study.com.studyproject.R;

/**
 * Created by liuhe on 19-2-18.
 * RecycleView 测试类
 */

public class RecycleViewActivity extends Activity {

    private static final String TAG = "RecycleViewActivity";
    private RecyclerView recyclerView;
    private List<String> mDatas;
    private HomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycleview_layout);

        recyclerView = findViewById(R.id.recycle);
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            mDatas.add("" + (char) i);
        }
        adapter = new HomeAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL_LIST));
        recyclerView.setAdapter(adapter);

    }

    private class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(RecycleViewActivity.this)
                    .inflate(R.layout.recycle_item, parent, false));
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tvItem.setText(mDatas.get(position));
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            TextView tvItem;

            public MyViewHolder(View itemView) {
                super(itemView);
                tvItem = itemView.findViewById(R.id.tv_item);
            }
        }
    }
}
