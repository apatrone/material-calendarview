package com.prolificinteractive.materialcalendarview.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/**
 * Created by apatrone on 13/05/16.
 */
public class SquareSpan implements LineBackgroundSpan {
    /**
     * Default width used
     */
    public static final float DEFAULT_RADIUS = 3;

    private final float width;
    private final int color;

    public SquareSpan() {
        this.width = DEFAULT_RADIUS;
        this.color = 0;
    }

    public SquareSpan(int color) {
        this.width = DEFAULT_RADIUS;
        this.color = color;
    }

    public SquareSpan(float width) {
        this.width = width;
        this.color = 0;
    }

    public SquareSpan(float width, int color) {
        this.width = width;
        this.color = color;
    }

    @Override
    public void drawBackground(
            Canvas canvas, Paint paint,
            int left, int right, int top, int baseline, int bottom,
            CharSequence charSequence,
            int start, int end, int lineNum
    ) {
        int oldColor = paint.getColor();
        if (color != 0) {
            paint.setColor(color);
        }
        canvas.drawRect(left, top, left + width, top +  width, paint);
        paint.setColor(oldColor);
    }
}
