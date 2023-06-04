package Homework07;

import java.util.ArrayList;
import java.util.List;

import Homework07.candidates.Observer;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();
    List<Vacancy> vacancies = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override

    public void sendOffer(Vacancy vacancy) {
        vacancies.add(vacancy);
        for (Observer observer : observers){
            observer.receiveOffer(vacancy);
            if (vacancy.getStatus()==false) {
                removeObserver(observer);
                break;
            }
        }
    }

    @Override
    public void allActiveVacancies() {
        for (Vacancy vacancy: vacancies) {
            if (vacancy.getStatus()) {
                System.out.println(vacancy);
            }
        }
    }

    @Override
    public void allObservers() {
        for (Observer observer : observers) {
            System.out.println(observer);
        }
    }
    
}
