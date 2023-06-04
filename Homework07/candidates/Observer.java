package Homework07.candidates;

import Homework07.Vacancy;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {

    void receiveOffer(Vacancy vacancy);


}
