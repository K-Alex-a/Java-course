package Home_works.Seminar_06;

public class MainElevator {
    public static void main(String[] args) throws IllegalAccessException {

        ElevatorController elevator = new ElevatorController(4, 5);
        System.out.println(elevator);

        ElevatorController elevator1 = new ElevatorController(7);
        System.out.println(elevator1.getMinFloor());

        elevator.setMinMaxFloor(6, 9);

        System.out.println(elevator);

        elevator1.move(5);

    }
}
