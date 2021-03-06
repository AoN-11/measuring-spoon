package events.tgh2020.measuring_spoon;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

public class Scale {

    //vをscale倍に拡大するアニメーション
    public static void startScale(View v,float scale){
        // ScaleAnimation(float fromX, float toX, float fromY, float toY, int pivotXType, float pivotXValue, int pivotYType, float pivotYValue)
        ScaleAnimation scaleAnimation = new ScaleAnimation(
                1.0f, scale, 1.0f,scale,
                Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        // animation時間 msec
        scaleAnimation.setDuration(1000);
        scaleAnimation.setFillAfter(true);
        v.startAnimation(scaleAnimation);
    }
}
