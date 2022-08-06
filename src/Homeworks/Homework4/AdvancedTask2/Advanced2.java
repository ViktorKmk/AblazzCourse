package Homeworks.Homework4.AdvancedTask2;

public class Advanced2 {
    public static void main(String[] args) {

        Brand brand1 = new Brand(new boolean[]{false, true});

        for (int i = 0; i < brand1.getStoresLength(); i++) {
            try {
                brand1.storeWorkerWatchTick(i);
            } catch (WatchBrokenError e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
