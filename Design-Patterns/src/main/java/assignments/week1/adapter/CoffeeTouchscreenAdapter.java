package assignments.week1.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    public OldCoffeeMachine oldMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine) {
        this.oldMachine = oldMachine;
    }

    public void chooseFirstSelection() {
        this.oldMachine.selectA();
    }
    public void chooseSecondSelection() {
        this.oldMachine.selectB();
    }

}
