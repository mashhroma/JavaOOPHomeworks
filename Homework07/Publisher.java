package Homework07;

import Homework07.candidates.Observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(Vacancy vacancy);

    void allActiveVacancies();

    void allObservers();

}
