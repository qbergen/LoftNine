package com.example.queenabergen.loft9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by queenabergen on 10/21/16.
 */

public class HomeData {
    private static final String[] titles = {
            "Loft 9",
            "Photography",
            "Events",
            "Recording Studio",
            "Information"
    };

    private static final String[] subtitles = {
            "Check Out Life @ Loft9",
            "Explore the Gallery",
            "Book Your Next Event",
            "Experience the music",
            "All The Good Word"
    };
    private static final int[] homepagephotos = {R.drawable.zombieonthetrack, R.drawable.photographer, R.drawable.viewsfromthegrey,
            R.drawable.newsphoto, R.drawable.lifeatloft9 };
//            private final static String[] urls = {
//                    "http://i.imgur.com/DvpvklR.png"};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

            for (int i = 0; i < titles.length && i < homepagephotos.length && i < subtitles.length; i++) {
                ListItem item = new ListItem();
                item.setImageResId(homepagephotos[i]);
                item.setTitle(titles[i]);
                item.setSubtitle(subtitles[i]);
//                item.setUrl(urls[i]);
                data.add(item);
        }
        return data;
    }

}
