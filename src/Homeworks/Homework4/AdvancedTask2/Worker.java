package Homeworks.Homework4.AdvancedTask2;

public class Worker {
    private Watch watch;

    public Worker() {
    }

    public Worker(boolean watchIsBroken) {
        this.watch = new Watch(watchIsBroken);
    }

    public void watchTick() throws WatchBrokenError {
        watch.tick();
    }
}
