package com.connecting.studyjam1_final;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<FriendsList> myFriends = new ArrayList<FriendsList>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateFriendsList();
        populateListView();
    }

    private void populateFriendsList() {

        myFriends.add(new FriendsList("Saswat Sahoo",R.drawable.pic1,"This is me. I have just started learninng Android."));
        myFriends.add(new FriendsList("Ankit Patra",R.drawable.pic2,"Decided to move IRQ178 from CPU7"));
        myFriends.add(new FriendsList("Sourav",R.drawable.pic3,"Football Player.D/Volley: [1] Request.finish: 288091 ms: [ "));
        myFriends.add(new FriendsList("Sanat", R.drawable.pic4, "Explicit concurrent mark sweep GC freed 2301(152KB)"));
        myFriends.add(new FriendsList("Ashish", R.drawable.pic5, "AllocSpace objects, 2(5MB) LOS objects, 14% free, 22MB/26MB"));
        myFriends.add(new FriendsList("Pratik", R.drawable.pic6, "No package identifier when getting value for resource number 0x00000"));
        myFriends.add(new FriendsList("Bada", R.drawable.pic7, "at com.android.okhttp.internal.http.DelegatingHttpsURLConnecti"));

    }

    private void populateListView() {

        ArrayAdapter<FriendsList> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

    }

    private class MyListAdapter extends ArrayAdapter<FriendsList> {

        public MyListAdapter() {
            super(MainActivity.this,R.layout.layout,myFriends);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

           //the getView method helps to display the items on screen
            //if the app is opened fr first time convertView would be null, so we are ccreating for first time and recycle for next all
            View item_view = convertView;

            if(item_view==null)
            {
                item_view = getLayoutInflater().inflate(R.layout.layout,parent,false);
            }

            //we hae to find the car to work with
            FriendsList currentFriend = myFriends.get(position);

            //then fill the view
            ImageView imageView = (ImageView)item_view.findViewById(R.id.friendImage);
            imageView.setImageResource(currentFriend.getImageids());

            TextView textView1 = (TextView)item_view.findViewById(R.id.friendName);
            textView1.setText(currentFriend.getNames());

            TextView textView2 = (TextView)item_view.findViewById(R.id.friendDescription);
            textView2.setText(currentFriend.getDescription());


            return item_view;
            //return super.getView(position, convertView, parent);
        }
    }
}
