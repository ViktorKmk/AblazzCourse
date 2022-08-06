package Homeworks.Homework4.AdvancedTask2;

public class Brand {
    private Store[] stores;

    public Brand() {
    }

    public Brand(boolean[] storesWorkerWatchIsBroken) {
        this.stores = new Store[storesWorkerWatchIsBroken.length];
        for (int i = 0; i < this.stores.length; i++) {
            this.stores[i] = new Store(storesWorkerWatchIsBroken[i]);
        }
    }

    public void storeWorkerWatchTick(int index) throws WatchBrokenError {
        this.stores[index].workerWatchTick();
    }

    public int getStoresLength() {
        return stores.length;
    }
}
