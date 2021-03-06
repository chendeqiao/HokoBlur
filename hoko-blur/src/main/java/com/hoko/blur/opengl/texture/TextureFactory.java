package com.hoko.blur.opengl.texture;

import android.graphics.Bitmap;

import com.hoko.blur.api.ITexture;
import com.hoko.blur.util.Preconditions;

/**
 * Created by yuxfzju on 17/1/20.
 */

public class TextureFactory {
    public static ITexture create(int width, int height) {
        Preconditions.checkArgument(width > 0 && height > 0, "width > 0 and height > 0");

        return new SimpleTexture(width, height);
    }

    public static ITexture create(Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap, "bitmap == null");
        return new BitmapTexture(bitmap);
    }
}
