

public class Main {
    public static void main(String[] args) {
        Airport airport1 = new Airport ("Ivan Ivanov", "A123","SQ-77",1,20 );

        Airport airport2 = new Airport ("Alex Toms", "KM45","AC-66",2,25 );

        Airport airport3 = new Airport ("Ivan Shevchenko", "SL98","DC-55",3,30 );

        Airport airport4 = new Airport ("Mila Kosa", "D56","KL-44",4,35 );

        Airport airport5 = new Airport ("Ivan Gleb", "A123","XX-33",5,40);
     /* Airport airport1 = new Airport("Ivan Ivanov", "A123",15526,5,30 );
      System.out.println(airport1.toString());
    } =>  LAB_7*/

        FileControll files = new FileControll();
        files.createFiles();


        AirportArrayList airportArrayList = new AirportArrayList();

        airportArrayList.addNewAirportItem(airport1);
        airportArrayList.addNewAirportItem(airport2);
        airportArrayList.addNewAirportItem(airport3);
        airportArrayList.addNewAirportItem(airport4);
        airportArrayList.addNewAirportItem(airport5);

        airportArrayList.showArrayList();/*попытка вывести хоть что-то*/
        airportArrayList.TotalBaggageAmount("A123");/*сумма багажа на данном рейсе*/
        airportArrayList.LuggageWeightPerPassenger();/*вывод всех сведений о пассажире у которого вес багажа больше 30кг*/
        /*сумма всего багажа в данном рейсе*/
        airportArrayList.LuggageLocation("AC-66");/*поиск рейса по квитанции багажа*/
        airportArrayList.deleteDeleteByName();/*задать index от 0 до 4, чтобы удалить пассажира */






    }
}

