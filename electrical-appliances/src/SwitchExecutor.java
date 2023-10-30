import com.xworkz.electricalapplication.switches.CflBulbImpl;
import com.xworkz.electricalapplication.switches.Switch;
import com.xworkz.electricalapplication.switches.TubelightImpl;

public class SwitchExecutor {
    public static void main(String[] args) {
        Switch aSwitch=new TubelightImpl();
        aSwitch.off();
        aSwitch.on();
        Switch aSwitch1=new CflBulbImpl();
        aSwitch1.on();
        aSwitch1.off();

    }
}
