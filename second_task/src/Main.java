//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Dataclass today = new Dataclass(11, 11, 2025);
        Dataclass tomorrow = new Dataclass(12, 11, 2025);
        Dataclass z = today.SetNewDate(15);
        System.out.println(z.GetData());





        }
    }
