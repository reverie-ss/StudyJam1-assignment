package com.connecting.studyjam1_final;

/**
 * Created by user on 2/23/2016.
 */
public class FriendsList {

    private String names;
    private int imageids;
    private String description;

    FriendsList(String names,int imageids,String description)
    {
        super();
        this.names=names;
        this.imageids=imageids;
        this.description=description;

    }


    public String getDescription() {
        return description;
    }

    public int getImageids() {
        return imageids;
    }

    public String getNames() {
        return names;
    }
}
