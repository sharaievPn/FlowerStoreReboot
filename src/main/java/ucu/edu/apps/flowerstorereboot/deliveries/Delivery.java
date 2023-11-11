package ucu.edu.apps.flowerstorereboot.deliveries;

import ucu.edu.apps.flowerstorereboot.Item;

import java.util.LinkedList;

public interface Delivery {

    String deliver(LinkedList<Item> items);
}
