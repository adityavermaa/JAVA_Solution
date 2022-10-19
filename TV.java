interface TVremote{ 
   void changeChannel();
   void raiseVolume();
}
class SmartTVremote implements TVremote{
    @Override
    public void changeChannel(){
        System.out.println("Changes the channel");
    }
    @Override
    public void raiseVolume(){
        System.out.println("Volume will be raised");
    }
}

public class TV{
    public static void main(String[] args){

    }
}