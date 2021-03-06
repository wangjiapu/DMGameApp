package com.stx.xhb.dmgameapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.adapter.viewholder.ForumDetailsListViewHodler;
import com.stx.xhb.dmgameapp.entity.ForumListEntity;


/**
 * @author Mr.xiao
 * @time: 2017/11/1 0001
 * @email:xhb_199409@163.com
 * @Github:https://github.com/xiaohaibin/
 * @Drscribe:
 */

public class ForumDetailsListAdapter extends RecyclerArrayAdapter<ForumListEntity.HtmlBean> {

    private LayoutInflater mLayoutInflater;

    public ForumDetailsListAdapter(Context context) {
        super(context);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ForumDetailsListViewHodler(mLayoutInflater.inflate(R.layout.list_item_forum_details, parent, false));
    }
}
