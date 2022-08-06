package Homeworks.Homework4.AdvancedTask2;

public class Watch {
    private boolean isBroken;

    public Watch() {
    }

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void tick() throws WatchBrokenError {
        if (isBroken) {
            throw new WatchBrokenError("Ошибка: Часы сломались");
        } else {
            System.out.println("Часы тикают");
        }

    }
}
