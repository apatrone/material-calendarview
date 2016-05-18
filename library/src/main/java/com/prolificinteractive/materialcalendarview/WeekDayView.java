package com.prolificinteractive.materialcalendarview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.widget.TextView;

import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;

import java.util.Calendar;

/**
 * Display a day of the week
 */
@SuppressLint("ViewConstructor")
class WeekDayView extends TextView {

    private WeekDayFormatter formatter = WeekDayFormatter.DEFAULT;
    private int dayOfWeek;
    private int gravity = Gravity.RIGHT;
    private int textAlignment = TEXT_ALIGNMENT_GRAVITY;

    public WeekDayView(Context context, int dayOfWeek) {
        super(context);

        setGravity(gravity);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            setTextAlignment(textAlignment);
        }

        setDayOfWeek(dayOfWeek);
    }

    public WeekDayView(Context context,  int dayOfWeek, int gravity, int textAlignment) {
        super(context);
        this.gravity = gravity;
        this.textAlignment = textAlignment;
        new WeekDayView(context,dayOfWeek);
    }

    public void setWeekDayFormatter(WeekDayFormatter formatter) {
        this.formatter = formatter == null ? WeekDayFormatter.DEFAULT : formatter;
        setDayOfWeek(dayOfWeek);
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        setText(formatter.format(dayOfWeek));
    }

    public void setDayOfWeek(Calendar calendar) {
        setDayOfWeek(CalendarUtils.getDayOfWeek(calendar));
    }

    @Override
    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    @Override
    public void setTextAlignment(int textAlignment) {
        this.textAlignment = textAlignment;
    }
}
