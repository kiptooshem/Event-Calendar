package com.skyhope.eventcalenderlibrary.listener;

import com.skyhope.eventcalenderlibrary.model.DayContainerModel;
import com.skyhope.eventcalenderlibrary.model.Event;

import java.util.List;
/*
 *  ****************************************************************************
 *  * Created by : Md Tariqul Islam on 11/30/2018 at 12:36 PM.
 *  * Email : tariqul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md Tariqul Islam on 11/30/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */


public interface CalendarListener {

    void onGetDay(DayContainerModel dayContainerModel);
    List<Event> onRequiredDayEvents(DayContainerModel dayContainerModel);
    void onRemoveEvent(Event event);
}
