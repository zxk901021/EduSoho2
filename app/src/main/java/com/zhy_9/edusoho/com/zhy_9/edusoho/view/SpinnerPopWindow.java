//package com.zhy_9.edusoho.com.zhy_9.edusoho.view;
//
//import android.content.Context;
//import android.graphics.drawable.ColorDrawable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.PopupWindow;
//
//import com.zhy_9.edusoho.R;
//
//import java.util.List;
//
///**
// * Created by ZHY_9 on 2016/5/31.
// */
//public class SpinnerPopWindow extends PopupWindow implements AdapterView.OnItemClickListener{
//
//    private Context mContext;
//    private ListView mListView;
//    private SpinnerPopAdapter mAdapter;
//    private IOnItemSelectListener mItemSelectListener;
//    public SpinnerPopWindow(Context context)
//    {
//        super(context);
//
//        mContext = context;
//        init();
//    }
//
//
//    public void setItemListener(IOnItemSelectListener listener){
//        mItemSelectListener = listener;
//    }
//
//    public void setAdatper(SpinnerPopAdapter adapter){
//        mAdapter = adapter;
//        mListView.setAdapter(mAdapter);
//    }
//
//
//    private void init()
//    {
//        View view = LayoutInflater.from(mContext).inflate(R.layout.spiner_window_layout, null);
//        setContentView(view);
//        setWidth(LayoutPa.WRAP_CONTENT);
//        setHeight(LayoutParams.WRAP_CONTENT);
//
//        setFocusable(true);
//        ColorDrawable dw = new ColorDrawable(0x00);
//        setBackgroundDrawable(dw);
//
//
//        mListView = (ListView) view.findViewById(R.id.listview);
//        mListView.setOnItemClickListener(this);
//    }
//
//
//    public void refreshData(List<String> list, int selIndex)
//    {
//        if (list != null && selIndex  != -1)
//        {
//            if (mAdapter != null){
//                mAdapter.refreshData(list, selIndex);
//            }
//        }
//    }
//
//
//    @Override
//    public void onItemClick(AdapterView<?> arg0, View view, int pos, long arg3) {
//        dismiss();
//        if (mItemSelectListener != null){
//            mItemSelectListener.onItemClick(pos);
//        }
//    }
//}
