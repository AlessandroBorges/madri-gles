package android.view;

import android.graphics.Rect;

public interface Surface {

  public  android.graphics.Canvas lockCanvas(Rect dirty);

  public void unlockCanvasAndPost(android.graphics.Canvas canvas);

  public long getNativeHandle();

}
