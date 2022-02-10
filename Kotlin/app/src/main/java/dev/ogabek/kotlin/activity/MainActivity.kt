package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.UserAdapter
import dev.ogabek.kotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        val adapter = UserAdapter(prepareUserList())
        recyclerView.adapter = adapter
    }

    private fun prepareUserList(): List<User> {
        val userList: MutableList<User> = ArrayList<User>()
        userList.add(User(R.drawable.ogabekdev, "Ogabek Matyakubov", "online"))
        userList.add(User(R.drawable.bogibek, "Bogibek Aka", "online"))
        userList.add(User(R.drawable.ogabekdev, "Ogabek Matyakubov", "online"))
        userList.add(User(R.drawable.bogibek, "Bogibek Aka", "online"))
        userList.add(User(R.drawable.jonibek, "Jonibek Holmonov", "online"))
        userList.add(User(R.drawable.aziz, "Aziz"))
        userList.add(User(R.drawable.elmurod, "Elmurod Aka"))
        userList.add(User(R.drawable.jabbor, "Jabbor Aka"))
        userList.add(User(R.drawable.shakhriyor, "Shakhriyor Usta"))
        userList.add(User(R.drawable.yahyo, "Yahyo Mahmudiy"))
        userList.add(User(R.drawable.aziz, "Aziz"))
        userList.add(User(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        userList.add(User(R.drawable.bogibek, "Bogibek Aka"))
        userList.add(User(R.drawable.jonibek, "Jonibek Holmonov"))
        userList.add(User(R.drawable.elmurod, "Elmurod Aka"))
        userList.add(User(R.drawable.jabbor, "Jabbor Aka"))
        userList.add(User(R.drawable.shakhriyor, "Shakhriyor Usta"))
        userList.add(User(R.drawable.yahyo, "Yahyo Mahmudiy"))
        userList.add(User(R.drawable.aziz, "Aziz"))
        userList.add(User(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        userList.add(User(R.drawable.bogibek, "Bogibek Aka"))
        userList.add(User(R.drawable.jonibek, "Jonibek Holmonov"))
        userList.add(User(R.drawable.elmurod, "Elmurod Aka"))
        userList.add(User(R.drawable.jabbor, "Jabbor Aka"))
        userList.add(User(R.drawable.shakhriyor, "Shakhriyor Usta"))
        userList.add(User(R.drawable.yahyo, "Yahyo Mahmudiy"))
        userList.add(User(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        userList.add(User(R.drawable.bogibek, "Bogibek Aka"))
        userList.add(User(R.drawable.jonibek, "Jonibek Holmonov"))
        userList.add(User(R.drawable.elmurod, "Elmurod Aka"))
        userList.add(User(R.drawable.jabbor, "Jabbor Aka"))
        userList.add(User(R.drawable.shakhriyor, "Shakhriyor Usta"))
        userList.add(User(R.drawable.yahyo, "Yahyo Mahmudiy"))
        userList.add(User(R.drawable.aziz, "Aziz"))
        userList.add(User(R.drawable.ogabekdev, "Ogabek Matyakubov"))
        userList.add(User(R.drawable.bogibek, "Bogibek Aka"))
        userList.add(User(R.drawable.jonibek, "Jonibek Holmonov"))
        userList.add(User(R.drawable.elmurod, "Elmurod Aka"))
        userList.add(User(R.drawable.jabbor, "Jabbor Aka"))
        userList.add(User(R.drawable.shakhriyor, "Shakhriyor Usta"))
        userList.add(User(R.drawable.yahyo, "Yahyo Mahmudiy"))
        return userList
    }

}