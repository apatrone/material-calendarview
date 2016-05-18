package com.prolificinteractive.materialcalendarview;

import android.support.annotation.NonNull;

/**
 * Created by apatrone on 18/05/16.
 */
public interface OnDateLongClickedListener {

    /**
     * Called when a user long clicks on a day.
     * There is no logic to prevent multiple calls for the same date and state.
     *
     * @param widget the view associated with this listener
     * @param date   the date that was selected or unselected
     */
    void onDateLongClicked(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date);

}

