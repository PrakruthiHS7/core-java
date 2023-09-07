class RailwayStationExecutor
{
public static void main(String railwaysations[])
{
     RailwayStation station=new RailwayStation();
        station.setStationId(1);
        station.setStationName("Central Station");
        station.setStationCode("CEN");
        station.setLocation("Bangalore");
        station.setNoOfPlatforms(10);

        // Display station information
        station.displayRailwayStationInformation();
}
}