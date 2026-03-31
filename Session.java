import java.util.ArrayList;

public class Session<T extends MediaItem> {
    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(String id) {
        items.removeIf(item -> item.getId().equals(id));
    }

    public void listItems() {
        for (T item: items) {
            System.out.println(item.toString());
        }
    }
}
