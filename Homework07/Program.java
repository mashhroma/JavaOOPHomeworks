package Homework07;

import Homework07.Vacancy.Type;
import Homework07.candidates.Junior;
import Homework07.candidates.Middle;
import Homework07.candidates.Senior;

public class Program {

    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  При желании добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Senior ivanov = new Senior("Иванов");
        Middle sidorov = new Middle("Сидоров");
        Junior petrov = new Junior("Петров");
        Middle bedrin = new Middle("Бедрин");
        Middle smolyar = new Middle("Смоляр");
        Senior kvyat = new Senior("Квят");
        Junior sirotkin = new Junior("Сироткин");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(bedrin);
        jobAgency.registerObserver(smolyar);
        jobAgency.registerObserver(kvyat);
        jobAgency.registerObserver(sirotkin);

        System.out.println("Журнал регистрации рассылки вакансий:");
        for (int i = 0; i < 5; i++) {
            //geekBrains.needEmployee(Type.JUNIOR);
            geekBrains.needEmployee(Type.MIDDLE);
            google.needEmployee(Type.MIDDLE);
            google.needEmployee(Type.SENIOR);
            yandex.needEmployee(Type.SENIOR);
        }
        

        System.out.println("\n\nАктивные вакансии:");
        jobAgency.allActiveVacancies();

        System.out.println("В данный момент ищут работу:");
        jobAgency.allObservers();
    }
}
