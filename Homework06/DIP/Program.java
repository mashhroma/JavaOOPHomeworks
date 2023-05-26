package DIP;

public class Program {
    //TODO: (2 задание ) Доработать самостоятельно
    public static void main(String[] args) {
        
        Report report = new Report();
        
        GetReport fromConsole = new GetFromConsole();
        PrintReport toConsole = new PrintToConsole();
        report.calculate(fromConsole);
        report.output(toConsole);
        report.output(new PrintToFile());
    }
}
