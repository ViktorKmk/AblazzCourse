package Homeworks.Homework4.AdvancedTask2;

public class Store {
    private Worker worker;

    public Store() {
    }

    public Store(boolean workerWatchIsBroken) {
        this.worker = new Worker(workerWatchIsBroken);
    }

    public void workerWatchTick() throws WatchBrokenError {
        worker.watchTick();
    }
}
