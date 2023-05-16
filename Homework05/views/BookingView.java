package Homework05.views;

import java.util.Collection;
import java.util.Date;

import Homework05.models.Reservation;
import Homework05.models.Table;
import Homework05.presenters.View;

public class BookingView implements View {


    private ViewObserver observer;


    /**
     * Отобразить список столиков
     * @param tables список столиков
     */
    public void showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }
    
    /**
     * Отобразить результат бронирования
     * @param reservationNo номер брони
     */
    @Override
    public void showReservationStatus(String status, int reservationNo, Date date, String name) {
        if (reservationNo > 0){
            if (status == "new")
                System.out.printf("\nСтолик успешно забронирован.\n Номер брони: #%d\n Дата посещения: %s\n Имя %s\n", reservationNo, date, name);
            else
                System.out.printf("\nБронь на столик успешно изменена.\n Номер брони: #%d\n Дата посещения: %s\n Имя %s\n", reservationNo, date, name);
            }
        else {
            System.out.println("Ошибка бронирования столика.");
        }
    }

    /**
     * Установить наблюдателя
     * @param observer наблюдатель (презентер)
     */
    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования),
     * бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onReservationTable(oldReservation, reservationDate, tableNo, name);
    }


    public void showAllReservations(Collection<Table> tables){
        System.out.println("\nВсе бронирования:");
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                System.out.println(table);
                System.out.println("  " + reservation);
            }
        }
    }


}
