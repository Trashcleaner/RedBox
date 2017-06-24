package com.kiwi.redbox.redbox.fragments.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample route for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WatchingFlightsContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WatchingFlight> ITEMS = new ArrayList<WatchingFlight>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WatchingFlight> ITEM_MAP = new HashMap<String, WatchingFlight>();

    private static final int COUNT = 1;

    /*static {
        // Add some sample items.

        WatchingFlight toAdd = new WatchingFlightsContent.WatchingFlight("1", "MXP" + " -> " + "PRG", "73", "2017/11/30");
        toAdd.bought = true;
        addItem(toAdd);
        WatchingFlight toAdd2 = new WatchingFlightsContent.WatchingFlight("1", "MXP" + " -> " + "PRG", "65", "2017/11/15");
        addItem(toAdd);

    }*/

    private static void addItem(WatchingFlight item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /*private static WatchingFlight createDummyItem(int position) {
        return new WatchingFlight(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore price information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of route.
     */
    public static class WatchingFlight {
        public final String id;
        public final String route;
        public final String price;

        public final String src = "Milan";
        public final String dst = "Prague";
        public final String date;


        public WatchingFlight(String id, String content, String details, String date) {
            this.id = id;
            this.route = content;
            this.price = details;
            this.date = date;
        }



        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(src).append(" -> ").append(dst);
            builder.append(" ").append(route);
            return builder.toString();
        }

    }
}
