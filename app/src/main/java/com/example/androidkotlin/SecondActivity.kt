package com.example.androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidkotlin.AndroidwithKotlin.Activity.Activity_Lifecycle
import com.example.androidkotlin.adapters.SecondAdapter
import com.example.androidkotlin.AndroidwithKotlin.AlertDialog.*
import com.example.androidkotlin.AndroidwithKotlin.Container.*
import com.example.androidkotlin.AndroidwithKotlin.Date.CustomTitleDatePickerA
import com.example.androidkotlin.AndroidwithKotlin.Date.DatePicker
import com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Activity_Transition.Activity_Transition1
import com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Activity_Passing_Data.Passing_Data
import com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Splash.DemoMain
import com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Splash.Simple_Splash
import com.example.androidkotlin.AndroidwithKotlin.ExplicitIntent.Start_Activity.Start_Activity
import com.example.androidkotlin.AndroidwithKotlin.Image.*
import com.example.androidkotlin.AndroidwithKotlin.ImplicitIntent.*
import com.example.androidkotlin.AndroidwithKotlin.Menu.ContextMenuA
import com.example.androidkotlin.AndroidwithKotlin.Menu.OptionMenu
import com.example.androidkotlin.AndroidwithKotlin.Menu.PopUpMenuA
import com.example.androidkotlin.AndroidwithKotlin.Time.Chronometer
import com.example.androidkotlin.AndroidwithKotlin.Time.TextClockA
import com.example.androidkotlin.AndroidwithKotlin.Time.TimePickerA
import com.example.androidkotlin.AndroidwithKotlin.Toast.ColoredToast
import com.example.androidkotlin.AndroidwithKotlin.Toast.CustomToast
import com.example.androidkotlin.AndroidwithKotlin.Toast.PositioningToastA
import com.example.androidkotlin.AndroidwithKotlin.Toast.SimpleToast
import com.example.androidkotlin.AndroidwithKotlin.Widgets.*
import com.example.androidkotlin.AndroidwithKotlin.Wifi_Manager.WifiInfo
import com.example.androidkotlin.AndroidwithKotlin.Wifi_Manager.WifiStateChange
import com.example.androidkotlin.models.LateClick
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), SecondAdapter.OnItemClickListener,
    SecondAdapter.OnButtonClickListener {

    lateinit var secondAdapter: SecondAdapter
    private lateinit var list: ArrayList<LateClick>
    private var id: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        id = intent.getSerializableExtra("id") as Int
        loadData()
        var layoutManager = LinearLayoutManager(this)
        rv2.layoutManager = layoutManager
        secondAdapter = SecondAdapter(list, false, this, this)
        rv2.adapter = secondAdapter
    }

    private fun loadData() {
        list = ArrayList()
        when (id) {
            1 -> {
                list.add(LateClick("TextView", 1))
                list.add(LateClick("EditText", 2))
                list.add(LateClick("Button", 3))
                list.add(LateClick("Radio Button", 4))
                list.add(LateClick("Check Box", 5))
                list.add(LateClick("Rating Bar", 6))
                list.add(LateClick("Spinner", 7))
                list.add(LateClick("Switch", 8))
                list.add(LateClick("Progress Dialog", 9))
                list.add(LateClick("ProgressBar", 1000))
                list.add(LateClick("AutoComplete TextView", 10))
                list.add(LateClick("MultiAutoComplete TextView", 11))
                list.add(LateClick("TextSwitcher", 12))
                list.add(LateClick("Checked TextView", 13))
                list.add(LateClick("Toggle Button", 14))
                list.add(LateClick("Custom Checkbox", 15))
                list.add(LateClick("ScrollView", 16))
                list.add(LateClick("View Tag", 17))
            }
            2 -> {
                list.add(LateClick("Simple Toast", 18))
                list.add(LateClick("Custom Toast", 19))
                list.add(LateClick("Positioning Toast", 20))
                list.add(LateClick("Color Toast", 21))
            }
            3 -> {
                list.add(LateClick("Simple Alert Dialog", 22))
                list.add(LateClick("Traditional Single Choice List", 23))
                list.add(LateClick("Single Choice List (Radio Button)", 24))
                list.add(LateClick("Multiple Choice List (Check Box)", 25))
                list.add(LateClick("Custom Alert Dialog View", 26))
            }
            4 -> {
                list.add(LateClick("ImageButton", 27))
                list.add(LateClick("ImageView", 28))
                list.add(LateClick("Image Effects", 29))
                list.add(LateClick("Image Switcher", 30))
                list.add(LateClick("Image Slider", 31))
                list.add(LateClick("Oddiy Paint", 32))
            }
            5 -> {
                list.add(LateClick("DatePicker", 33))
                list.add(LateClick("Custom Title DatePicker", 34))
            }
            6 -> {

                list.add(LateClick("TextClock", 35))
                list.add(LateClick("TimePicker", 36))
                list.add(LateClick("Chronometer", 37))
            }
            7 -> {

                list.add(LateClick("ListView", 38))
                list.add(LateClick("GridView", 39))
                list.add(LateClick("SearchView", 40))
                list.add(LateClick("Custom ListView", 41))
                list.add(LateClick("WebView", 42))
                list.add(LateClick("SearchView on Toolbar", 43))
                list.add(LateClick("Expandable ListView", 44))
            }
            8 -> {
                list.add(LateClick("PopUp Menu", 45))
                list.add(LateClick("Option Menu", 47))
                list.add(LateClick("Context Menu", 48))
            }
            9 -> {

                list.add(LateClick("Maps", 49))
                list.add(LateClick("Camera", 50))
                list.add(LateClick("Email", 51))
                list.add(LateClick("Phone Call", 52))
                list.add(LateClick("Capture Video", 53))
                list.add(LateClick("Open Gallery", 54))
            }
            10 -> {

                list.add(LateClick("Activity transition", 55))
                list.add(LateClick("Passing data from one Activity to another activity", 56))
                list.add(LateClick("Simple SplashScreen", 57))
                list.add(LateClick("Start Activity For Result", 58))
            }
            11 -> {
                list.add(LateClick("Activity Lifecycle", 59))
            }
            12 -> {

                list.add(LateClick("Fragment Lifecycle", 60))
                list.add(LateClick("List Fragment", 61))
                list.add(LateClick("Dialog Fragment", 62))
                list.add(LateClick("Change Fragment", 63))
            }
            13 -> {
                list.add(LateClick("Wifi State Change", 64))
                list.add(LateClick("Wifi Info", 65))
            }
            14 -> {

                list.add(LateClick("Move", 66))
                list.add(LateClick("Rotate", 67))
                list.add(LateClick("Blink", 68))
                list.add(LateClick("Slide", 69))
                list.add(LateClick("Fade", 70))
                list.add(LateClick("Zoom", 71))
                list.add(LateClick("Bounce", 72))
            }
            15 -> {

                list.add(LateClick("Basic Calculator", 73))
                list.add(LateClick("Simple BMI Calculator", 74))
                list.add(LateClick("Simple Tip Calculator", 75))
            }
            16 -> {
                list.add(LateClick("FloatingAction Button", 76))
                list.add(LateClick("Bottom Navigtion", 77))
                list.add(LateClick("Bottom Sheets", 78))
                list.add(LateClick("Simple Login Form", 79))
                list.add(LateClick("SnackBar", 80))
                list.add(LateClick("Text Marquee", 81))
            }
            17 -> {

                list.add(LateClick("Simple Notification", 82))
                list.add(LateClick("Big Text Style Notification", 83))
                list.add(LateClick("Big Picture Style Notification", 84))
                list.add(LateClick("Inbox Style Notification", 85))
                list.add(LateClick("Notification Actions", 86))
            }
            18 -> {
                list.add(LateClick("Speech to Text", 87))
                list.add(LateClick("Text to Speech", 88))

            }
            19 -> {
                list.add(LateClick("SQLite Insert", 89))
                list.add(LateClick("SQLite Read", 90))
                list.add(LateClick("SQLite Delete", 91))
                list.add(LateClick("SQLite Update", 92))
            }
            20 -> {
                list.add(LateClick("On/Off Bluetooth", 93))
                list.add(LateClick("Paired Devices List", 94))
            }
            21 -> {
                list.add(LateClick("Facebook", 95))
                list.add(LateClick("Twitter", 96))
                list.add(LateClick("WhatsApp", 97))
                list.add(LateClick("Google+", 98))
            }
            22 -> {

                list.add(LateClick("Phone Details", 99))
                list.add(LateClick("Read Contacts", 100))
                list.add(LateClick("Read SMS", 101))
                list.add(LateClick("View Installed Apps", 102))
                list.add(LateClick("Vibrate", 103))
                list.add(LateClick("Brightness Control", 104))
                list.add(LateClick("Flashlight", 105))
            }
            23 -> {
                list.add(LateClick("Shared Preferences", 106))
                list.add(LateClick("Cache Storage", 107))
                list.add(LateClick("Internal Storage", 108))
                list.add(LateClick("External Strorage", 109))
                list.add(LateClick("Save Captured Image", 110))
                list.add(LateClick("Save Captured Video", 111))
            }
            24 -> {
                list.add(LateClick("Open Google Map", 112))
                list.add(LateClick("Search location on map", 113))
            }
        }
    }

    override fun onItemClickListener(position: Int, lateClick: LateClick) {
        val intent = Intent(this, CodeActivity::class.java)
        intent.putExtra("code", id)
        intent.putExtra("rate", lateClick.tr)
        startActivity(intent)
    }


    override fun onButtonClickListener(position: Int) {
        when (list[position].tr) {
            1 -> {startActivity(Intent(this, TextView::class.java)) }
            2 -> {startActivity(Intent(this, EditText::class.java))}
            3 -> {startActivity(Intent(this, ButtonA::class.java))}
            4 -> {startActivity(Intent(this, RadioButton::class.java))}
            5 -> {startActivity(Intent(this, CheckBox::class.java)) }
            6 -> {startActivity(Intent(this, RatingBar::class.java))}
            7 -> {startActivity(Intent(this, Spinner::class.java)) }
            8 -> {startActivity(Intent(this, Switch::class.java))}
            9 -> {startActivity(Intent(this, ProgressDialog::class.java))}
            1000 -> {startActivity(Intent(this, ProgressBar::class.java))}
            10 -> {startActivity(Intent(this, AutoCompleteTextView::class.java))}
            11 -> {startActivity(Intent(this, MultiAutoCompleteTextView::class.java))}
            12 -> {startActivity(Intent(this, TextSwitcher::class.java))}
            13 -> { startActivity(Intent(this, CheckedTextView::class.java)) }
            14 -> { startActivity(Intent(this, ToggleButton::class.java)) }
            15 -> { startActivity(Intent(this, CustomCheckbox::class.java)) }
            16 -> { startActivity(Intent(this, ScrollView::class.java)) }
            17 -> { startActivity(Intent(this, ViewTAg::class.java)) }
            18 -> { startActivity(Intent(this, SimpleToast::class.java)) }
            19 -> { startActivity(Intent(this, CustomToast::class.java)) }
            20 -> { startActivity(Intent(this, PositioningToastA::class.java)) }
            21 -> { startActivity(Intent(this, ColoredToast::class.java)) }
            22 -> { startActivity(Intent(this, SimpleAlertDialogA::class.java)) }
            23 -> { startActivity(Intent(this, TranditionalSingleChoiceA::class.java)) }
            24 -> { startActivity(Intent(this, SingleChoiceListA::class.java)) }
            25 -> { startActivity(Intent(this, MultipleChoiceListA::class.java)) }
            26 -> { startActivity(Intent(this, CustomAlertDialogA::class.java)) }
            27 -> { startActivity(Intent(this, ImageButtonA::class.java))}
            28 -> { startActivity(Intent(this, ImageViewA::class.java)) }
            29 -> { startActivity(Intent(this, ImageEffects::class.java)) }
            30 -> {startActivity(Intent(this, ImageSwitcher::class.java)) }
            31 -> {startActivity(Intent(this, ImageSliderA::class.java)) }
            32 -> { startActivity(Intent(this, SimplePointA::class.java)) }
            33 -> {startActivity(Intent(this, DatePicker::class.java))}
            34 -> {startActivity(Intent(this, CustomTitleDatePickerA::class.java))}
            35 -> {startActivity(Intent(this, TextClockA::class.java))}
            36 -> {startActivity(Intent(this, TimePickerA::class.java))}
            37 -> {startActivity(Intent(this, Chronometer::class.java))}
            38 -> {startActivity(Intent(this, ListViewA::class.java))}
            39 -> {startActivity(Intent(this, GridViewA::class.java))}
            40 -> {startActivity(Intent(this, SearchViewA::class.java))}
            41 -> {startActivity(Intent(this, CustomListViewA::class.java))}
            42 -> {startActivity(Intent(this, WebViewA::class.java))}
            43 -> {startActivity(Intent(this, SearchVeiwToolBarA::class.java))}
            44 -> {startActivity(Intent(this, ExpandableListViewA::class.java))}
            45 -> {startActivity(Intent(this, PopUpMenuA::class.java))}
            46 -> {}
            47 -> {startActivity(Intent(this, OptionMenu::class.java))}
            48 -> {startActivity(Intent(this, ContextMenuA::class.java))}
            49 -> {startActivity(Intent(this, Maps::class.java))}
            50 -> {startActivity(Intent(this, Camera::class.java))}
            51 -> {startActivity(Intent(this, EmailA::class.java))}
            52 -> {startActivity(Intent(this, PhoneCallA::class.java))}
            53 -> {startActivity(Intent(this, CaptureVideoA::class.java))}
            54 -> {startActivity(Intent(this, OpenGalleryA::class.java))}
            55 -> {startActivity(Intent(this, Activity_Transition1::class.java))}
            56 -> {startActivity(Intent(this, Passing_Data::class.java))}
            57 -> {startActivity(Intent(this, Simple_Splash::class.java))}
            58 -> {startActivity(Intent(this, Start_Activity::class.java))}
            59 -> {startActivity(Intent(this, Activity_Lifecycle::class.java))}
//            60 -> {startActivity(Intent(this, ))}
//            61 -> {startActivity(Intent(this, ))}
//            62 -> {startActivity(Intent(this, ))}
//            63 -> {startActivity(Intent(this, ))}
            64 -> {startActivity(Intent(this, WifiStateChange::class.java))}
            65 -> {startActivity(Intent(this, WifiInfo::class.java))}
//            6 -> {startActivity(Intent(this, ))}
//            7 -> {startActivity(Intent(this, ))}
//            8 -> {startActivity(Intent(this, ))}
//            9 -> {startActivity(Intent(this, ))}
//            10 -> {startActivity(Intent(this, ))}
        }
    }
}
