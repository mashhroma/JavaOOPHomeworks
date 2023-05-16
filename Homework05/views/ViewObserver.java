package Homework05.views;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onReservationTable(int oldReservationNo, Date orderDate, int tableNo, String name);

}
