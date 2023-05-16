package Homework05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Homework05.models.TableModel;
import Homework05.presenters.BookingPresenter;
import Homework05.views.BookingView;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();
        
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nВведите дату: ");
        String strDate = input.nextLine();
        Date date = formatter.parse(strDate);
        System.out.print("Введите номер столика: ");
        int tableNo = input.nextInt();
        input.nextLine();
        System.out.print("Введите Ваше имя: ");
        String name = input.nextLine();

        bookingView.reservationTable(date, tableNo, name);

        System.out.print("\nВведите номер брони: ");
        int resNo = input.nextInt();
        input.nextLine();
        System.out.print("Введите дату: ");
        String strNewDate = input.nextLine();
        Date newDate = formatter.parse(strNewDate);
        System.out.print("Введите номер столика: ");
        int newTableNo = input.nextInt();
        input.nextLine();
        System.out.print("Введите Ваше имя: ");
        String newName = input.nextLine();
        bookingView.changeReservationTable(resNo, newDate, newTableNo, newName);

        bookingPresenter.updateAllReservations();

        input.close();
    }

}
