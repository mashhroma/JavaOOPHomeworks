package Homework05.presenters;

import java.util.Collection;
import java.util.Date;

import Homework05.models.Table;
import Homework05.views.ViewObserver;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;
    private Collection<Table> tables;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Загрузить список всех столиков
     */
    public void loadTables(){
        if (tables == null){
            tables = model.loadTables();
        }
    }

    /**
     * Отобразить список столиков
     */
    public void updateView(){
        view.showTables(tables);
    }

    public void updateAllReservations(){
        view.showAllReservations(tables);
    }

    /**
     * Отобразить результат бронирования столика
     * @param reservationNo номер брони
     */

    private void updateReservationStatusView(String status, int reservationNo, Date date, String name){
        view.showReservationStatus(status, reservationNo, date, name);
    }

    /**
     * Получили уведомление о попытке бронирования столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        String status = "new";
        int reservationNo = model.reservationTable(orderDate, tableNo, name);
        updateReservationStatusView(status, reservationNo, orderDate, name);
    }

    @Override
    public void onReservationTable(int oldReservationNo, Date orderDate, int tableNo, String name) {
        int reservationNo = model.changeReservationTable(oldReservationNo, orderDate, tableNo, name);
        String status = "changed";
        updateReservationStatusView(status, reservationNo, orderDate, name);
    }
}
