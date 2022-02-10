package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.UserAdapter;
import dev.ogabek.java.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        UserAdapter adapter = new UserAdapter(prepareUserList());
        recyclerView.setAdapter(adapter);
    }

    private List<User> prepareUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(R.drawable.ogabekdev, "Ogabek Matyakubov", "online"));
        userList.add(new User(R.drawable.bogibek, "Bogibek Aka", "online"));
        userList.add(new User(R.drawable.ogabekdev, "Ogabek Matyakubov", "online"));
        userList.add(new User(R.drawable.bogibek, "Bogibek Aka", "online"));
        userList.add(new User(R.drawable.jonibek, "Jonibek Holmonov", "online"));
        userList.add(new User(R.drawable.aziz, "Aziz"));
        userList.add(new User(R.drawable.elmurod, "Elmurod Aka"));
        userList.add(new User(R.drawable.jabbor, "Jabbor Aka"));
        userList.add(new User(R.drawable.shakhriyor, "Shakhriyor Usta"));
        userList.add(new User(R.drawable.yahyo, "Yahyo Mahmudiy"));
        userList.add(new User(R.drawable.aziz, "Aziz"));
        userList.add(new User(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        userList.add(new User(R.drawable.bogibek, "Bogibek Aka"));
        userList.add(new User(R.drawable.jonibek, "Jonibek Holmonov"));
        userList.add(new User(R.drawable.elmurod, "Elmurod Aka"));
        userList.add(new User(R.drawable.jabbor, "Jabbor Aka"));
        userList.add(new User(R.drawable.shakhriyor, "Shakhriyor Usta"));
        userList.add(new User(R.drawable.yahyo, "Yahyo Mahmudiy"));
        userList.add(new User(R.drawable.aziz, "Aziz"));
        userList.add(new User(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        userList.add(new User(R.drawable.bogibek, "Bogibek Aka"));
        userList.add(new User(R.drawable.jonibek, "Jonibek Holmonov"));
        userList.add(new User(R.drawable.elmurod, "Elmurod Aka"));
        userList.add(new User(R.drawable.jabbor, "Jabbor Aka"));
        userList.add(new User(R.drawable.shakhriyor, "Shakhriyor Usta"));
        userList.add(new User(R.drawable.yahyo, "Yahyo Mahmudiy"));
        userList.add(new User(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        userList.add(new User(R.drawable.bogibek, "Bogibek Aka"));
        userList.add(new User(R.drawable.jonibek, "Jonibek Holmonov"));
        userList.add(new User(R.drawable.elmurod, "Elmurod Aka"));
        userList.add(new User(R.drawable.jabbor, "Jabbor Aka"));
        userList.add(new User(R.drawable.shakhriyor, "Shakhriyor Usta"));
        userList.add(new User(R.drawable.yahyo, "Yahyo Mahmudiy"));
        userList.add(new User(R.drawable.aziz, "Aziz"));
        userList.add(new User(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        userList.add(new User(R.drawable.bogibek, "Bogibek Aka"));
        userList.add(new User(R.drawable.jonibek, "Jonibek Holmonov"));
        userList.add(new User(R.drawable.elmurod, "Elmurod Aka"));
        userList.add(new User(R.drawable.jabbor, "Jabbor Aka"));
        userList.add(new User(R.drawable.shakhriyor, "Shakhriyor Usta"));
        userList.add(new User(R.drawable.yahyo, "Yahyo Mahmudiy"));
        return userList;
    }
}