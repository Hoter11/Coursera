package assignments.week1.adapter;

public class CoffeeTouchscreenMachine {

    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter touchscreenAdapter = new CoffeeTouchscreenAdapter(oldMachine);
        touchscreenAdapter.chooseFirstSelection();
        touchscreenAdapter.chooseSecondSelection();
    }
}
