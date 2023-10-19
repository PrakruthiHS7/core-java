import com.ott.ottplatform.netflix.Netflix;
import com.ott.ottplatform.netflix.Ottplatform;

class OttplatformExecutor
{
    public static void main(String ottp[])
    {
        Ottplatform ottplatform =new Ottplatform();
        ottplatform.addMoviesName("Appu");
        ottplatform.addMoviesName("Arasu");
        ottplatform.addMoviesName("Ugram");
        ottplatform.addMoviesName("Power");
        ottplatform.getMoviesName();

      //polymorphism
        Ottplatform ottplatform1 = new Netflix();
        ottplatform1.addMoviesName("Stranger Things");
        ottplatform1.addMoviesName("The Crown");
        ottplatform1.getMoviesName();


    }
}
