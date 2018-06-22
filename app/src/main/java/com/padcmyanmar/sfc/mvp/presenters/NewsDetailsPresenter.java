package com.padcmyanmar.sfc.mvp.presenters;

import com.padcmyanmar.sfc.data.models.NewsModel;
import com.padcmyanmar.sfc.data.vo.NewsVO;
import com.padcmyanmar.sfc.mvp.views.NewsDetailsView;

public class NewsDetailsPresenter extends BasePresenter<NewsDetailsView> {

    public NewsDetailsPresenter(NewsDetailsView mView) {
        super(mView);
    }

    public void onFinishUIComponentSetup(String newsId) {
        NewsVO newsVO = NewsModel.getInstance().getNewsById(newsId);
        mView.bindNewsDetails(newsVO);
    }

}
