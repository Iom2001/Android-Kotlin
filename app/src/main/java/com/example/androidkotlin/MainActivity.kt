package com.example.androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.androidkotlin.adapters.MainAdapter
import com.example.androidkotlin.models.ThemeLearn
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener,
    MainAdapter.OnItemClickListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var mainAdapter: MainAdapter
    lateinit var list: ArrayList<ThemeLearn>
    var bool = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawer)
        navigationView = findViewById(R.id.nav_view)
        toolbar = findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)
        bool = true
        loadData()
        var layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        rv.layoutManager = layoutManager
        mainAdapter = MainAdapter(list, this)
        rv.adapter = mainAdapter
        var barDrawerToggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(barDrawerToggle)
        barDrawerToggle.syncState()
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun loadData() {
        list = ArrayList()
        list.add(ThemeLearn("Widgets", R.drawable.widgets))
        list.add(ThemeLearn("Toast", R.drawable.toast))
        list.add(ThemeLearn("Alert Dialog", R.drawable.alert_icon))
        list.add(ThemeLearn("Image", R.drawable.image))
        list.add(ThemeLearn("Date", R.drawable.date))
        list.add(ThemeLearn("Time", R.drawable.time))
        list.add(ThemeLearn("Container", R.drawable.container))
        list.add(ThemeLearn("Menu", R.drawable.menu))
        list.add(ThemeLearn("Implicit Intent", R.drawable.im_intent))
        list.add(ThemeLearn("Explicit Intent", R.drawable.ex_intent))
        list.add(ThemeLearn("Activity", R.drawable.activity))
        list.add(ThemeLearn("Fragment", R.drawable.fragment))
        list.add(ThemeLearn("Wifi Manager", R.drawable.wifi))
        list.add(ThemeLearn("Animation", R.drawable.banim))
        list.add(ThemeLearn("Calculator", R.drawable.calc))
        list.add(ThemeLearn("Material Design", R.drawable.material))
        list.add(ThemeLearn("Notification", R.drawable.notification))
        list.add(ThemeLearn("Text <-> Speech", R.drawable.ttos))
        list.add(ThemeLearn("SQLite", R.drawable.sqlite))
        list.add(ThemeLearn("Bluetooth", R.drawable.blue))
        list.add(ThemeLearn("Share", R.drawable.sharedemo))
        list.add(ThemeLearn("Device", R.drawable.telephone))
        list.add(ThemeLearn("Data Storage", R.drawable.datastore))
        list.add(ThemeLearn("Google Map", R.drawable.googlemap))
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val itemId = item.itemId
        if (itemId == R.id.share) {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "message/Yes"
            startActivity(Intent.createChooser(intent, "Choose !!!"))
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onItemClickListener(position: Int, themeLearn: ThemeLearn) {
        if (bool) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("id", position + 1)
            startActivity(intent)
            bool = false
            val countDownTimer: CountDownTimer
            countDownTimer = object : CountDownTimer(1200, 1200) {
                override fun onFinish() {
                    bool = true
                }

                override fun onTick(millisUntilFinished: Long) {
                }
            }
            countDownTimer.start()
        }
    }
}
