package Homework05.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Table {

    private static int counter;

    private final Collection<Reservation> reservations = new ArrayList<>();
    private final int no;

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getSelectedReservation(int idReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == idReservation)
                return reservation;
        }
        return null;
    }

    public void deleteReservation(Collection<Reservation> reservations, int idReservation) {
        Iterator<Reservation> iterator = reservations.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == idReservation)
                iterator.remove();
        }
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
