package com.hoko.blur.api;

import android.graphics.Bitmap;
import android.view.View;

import com.hoko.blur.anno.Scheme;
import com.hoko.blur.task.AsyncBlurTask;

/**
 * Created by yuxfzju on 16/9/8.
 */
public interface IBlurProcessor extends IParams, ITranslate {
    /**
     * apply the blur effect to a bitmap
     *
     * @param bitmap the original bitmap
     * @return the blurred bitmap
     */
    Bitmap blur(Bitmap bitmap);

    /**
     *  apply the blur effect to a view
     *
     * @param view the original view
     * @return the bitmap of the blurred view
     */
    Bitmap blur(View view);

    void asyncBlur(Bitmap bitmap, AsyncBlurTask.Callback callback);

    void asyncBlur(View view, AsyncBlurTask.Callback callback);

    @Scheme
    int scheme();

    boolean forceCopy();

    boolean needUpscale();

}
