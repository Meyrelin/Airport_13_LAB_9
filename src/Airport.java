
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Airport  implements Serializable {
    private String FullName;/*Фамилия имя*/
    private String FlightNumber;/*номер рейса*/
    private String LuggageReceiptNumber;/*номер багажной квитанции*/
    private int NumberOfPiecesOfBaggage;/*кол-во мест багажа*/
    private int TotalBaggageWeight;/*суммарный вес багажа пассажира*/


    enum flightNumber {
        A123,
        KM45,
        SL98,
        D56
    }

    Airport(){
        FullName = "DefaultFullName";
        FlightNumber = "DefaultFlight";
        LuggageReceiptNumber = "DefaultLuggageReceiptNumber";
        NumberOfPiecesOfBaggage = 0;
        TotalBaggageWeight = 0;
    }
    Airport(String FullName, String FlightNumber,String LuggageReceiptNumber,int NumberOfPiecesOfBaggage,int TotalBaggageWeight ){
        this.FullName = FullName;
        this.FlightNumber = FlightNumber;
        this.LuggageReceiptNumber = LuggageReceiptNumber;
        this.NumberOfPiecesOfBaggage = NumberOfPiecesOfBaggage;
        this.TotalBaggageWeight = TotalBaggageWeight;
    }



    public String getFullName(){
        return FullName;
    }
    public void setFullName(){
        this.FullName = FullName;
    }



    public String getFlightNumber(){
        return FlightNumber;
    }

    public void setFlightNumber(String FlightNumber){
        this.FlightNumber="DefautFlight";
        for(flightNumber variants: flightNumber.values()){
            if(FlightNumber.equalsIgnoreCase(variants.toString()))
                this.FlightNumber = variants.toString();
        }
    }



    public String getLuggageReceiptNumber(){
        return LuggageReceiptNumber;
    }

    public void setLuggageReceiptNumber(){
        this.LuggageReceiptNumber=LuggageReceiptNumber;
    }



    public int getNumberOfPiecesOfBaggage(){
        return NumberOfPiecesOfBaggage;
    }

    public void setNumberOfPiecesOfBaggage(){
        if(NumberOfPiecesOfBaggage >=0) {
            this.NumberOfPiecesOfBaggage = NumberOfPiecesOfBaggage;
        }
        else {
            System.out.println(" ! ERROR !");
        }

    }



    public int getTotalBaggageWeight(){
        return TotalBaggageWeight;
    }

    public void setTotalBaggageWeight(){
        if(TotalBaggageWeight >= 0) {
            this.TotalBaggageWeight = TotalBaggageWeight;
        }
        else {
            System.out.println(" ! ERROR !");
        }
    }

    @Override
    public String toString() {
        return "Airport[ " +
                " " + FullName +
                ", " + FlightNumber +
                ", " + LuggageReceiptNumber +
                ", " + NumberOfPiecesOfBaggage +
                ", " + TotalBaggageWeight  + "kg"+
                " ]";
    }
}

