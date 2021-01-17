package com.example.androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidkotlin.adapters.SecondAdapter
import com.example.androidkotlin.models.LateClick
import kotlinx.android.synthetic.main.activity_code.*

class CodeActivity : AppCompatActivity(), SecondAdapter.OnItemClickListener,
    SecondAdapter.OnButtonClickListener {

    private lateinit var secondAdapter: SecondAdapter
    private lateinit var list: ArrayList<LateClick>
    var id: Int = 0
    var rate: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)
        id = intent.getSerializableExtra("code") as Int
        rate = intent.getSerializableExtra("rate") as Int
        loadData()
        var layoutManager = LinearLayoutManager(this)
        rv3.layoutManager = layoutManager
        secondAdapter = SecondAdapter(list, true, this, this)
        rv3.adapter = secondAdapter
    }

    private fun loadData() {
        val m = "MainActivity.kt"
        val x = "activity_main.xml"
        val yulmain = "mainactivity/"
        val yulactiv = "activitymain/"
        list = ArrayList()
        when (rate) {
            1 -> {
                list.add(LateClick(m, yulmain + "textViewMain.txt"))
                list.add(LateClick(x, yulactiv + "textViewX.txt"))
            }
            2 -> {
                list.add(LateClick(m, yulmain + "editTextMain.txt"))
                list.add(LateClick(x, yulactiv + "editTextX.txt"))
            }
            3 -> {
                list.add(LateClick(m, yulmain + "buttonMain.txt"))
                list.add(LateClick(x, yulactiv + "buttonX.txt"))
            }
            4 -> {
                list.add(LateClick(m, yulmain + "radioMain.txt"))
                list.add(LateClick(x, yulactiv + "radioX.txt"))
            }
            5 -> {
                list.add(LateClick(m, yulmain + "checkMain.txt"))
                list.add(LateClick(x, yulactiv + "checkX.txt"))
            }
            6 -> {
                list.add(LateClick(m, yulmain + "ratingMain.txt"))
                list.add(LateClick(x, yulactiv + "ratingX.txt"))
            }
            7 -> {
                list.add(LateClick(m, yulmain + "spinMain.txt"))
                list.add(LateClick(x, yulactiv + "spinX.txt"))
            }
            8 -> {
                list.add(LateClick(m, yulmain + "switchMain.txt"))
                list.add(LateClick(x, yulactiv + "switchX.txt"))
            }
            9 -> {
                list.add(LateClick(m, yulmain + "dialogMain.txt"))
                list.add(LateClick(x, yulactiv + "dialogX.txt"))
            }
            1000 -> {
                list.add(LateClick(m, yulmain + "barMain.txt"))
                list.add(LateClick(x, yulactiv + "barX.txt"))
            }
            10 -> {
                list.add(LateClick(m, yulmain + "autoMain.txt"))
                list.add(LateClick(x, yulactiv + "autoX.txt"))
            }
            11 -> {
                list.add(LateClick(m, yulmain + "multiMain.txt"))
                list.add(LateClick(x, yulactiv + "multiX.txt"))
            }
            12 -> {
                list.add(LateClick(m, yulmain + "textSMain.txt"))
                list.add(LateClick(x, yulactiv + "textSX"))
            }
            13 -> {
                list.add(LateClick(m, yulmain + "ctMain.txt"))
                list.add(LateClick(x, yulactiv + "ctX.txt"))
            }
            14 -> {
                list.add(LateClick(m, yulmain + "toggleMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "toggleActivityMain.txt"))
            }
            15 -> {
                list.add(LateClick(m, yulmain + "customCheckMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "customCheckActivityMain.txt"))
                list.add(LateClick("@drawble/check_selector.xml", yulactiv + "check_selectorX.txt"))
            }
            16 -> {
                list.add(LateClick(m, yulmain + "scrollviewMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "scrollviewActivityMain.txt"))
            }
            17 -> {
                list.add(LateClick(m, yulmain + "viewMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "viewActivityMain.txt"))
            }
            18 -> {
                list.add(LateClick(m, yulmain + "sToastMain.txt"))
                list.add(LateClick(x, yulactiv + "sToastX.txt"))
            }
            19 -> {
                list.add(LateClick(m, yulmain + "cToastMain.txt"))
                list.add(LateClick(x, yulactiv + "cToastX.txt"))
                list.add(LateClick("custom_toast", yulactiv + "cToastCustomX.txt"))
            }
            20 -> {
                list.add(LateClick(m, yulmain + "posMain.txt"))
                list.add(LateClick(x, yulactiv + "posX.txt"))
            }
            21 -> {
                list.add(LateClick(m, yulmain + "colorToastMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "colorToastActivityMain.txt"))
                list.add(LateClick("@drawble/toast_background.xml", yulactiv + "toastback.txt"))
            }
            22 -> {
                list.add(LateClick(m, yulmain + "alertMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "alertActivtyMain.txt"))
            }
            23 -> {
                list.add(LateClick(m, yulmain + "TCLalertMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "TCLalertActivityMain.txt"))
            }
            24 -> {
                list.add(LateClick(m, yulmain + "AlertRadioMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "AlertRadioActivityMain.txt"))
            }
            25 -> {
                list.add(LateClick(m, yulmain + "AlertCheckMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "AlertCheckActivityMain.txt"))
            }
            26 -> {
                list.add(LateClick(m, yulmain + "CustomAlertMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "CustomAlertActivityMain.txt"))
                list.add(LateClick("@layout/custom_view.xml", yulactiv + ""))//Topa olmadimbilmadim
            }
            27 -> {
                list.add(LateClick(m, yulmain + "ibMain.txt"))
                list.add(LateClick(x, yulactiv + "ibX.  txt"))
            }
            28 -> {
                list.add(LateClick(m, yulmain + "ibViewMain.txt"))
                list.add(LateClick(x, yulactiv + "ibViewX.txt"))
            }
            29 -> {
                list.add(LateClick(m, yulmain + "ieMain.txt"))
                list.add(LateClick(x, yulactiv + "ieX.txt"))
            }
            30 -> {
                list.add(LateClick(m, yulmain + "isMain.txt"))
                list.add(LateClick(x, yulactiv + "isX.txt"))
            }
            31 -> {
                list.add(LateClick(m, yulmain + "imgslideMain.txt"))
                list.add(LateClick(x, yulactiv + "imgslideX.txt"))
                list.add(LateClick("ImageAdapter.kt", yulmain + "imgAdapter.txt"))
            }
            32 -> {
                list.add(LateClick(m, yulmain + "spaintMain.txt"))
                list.add(LateClick(x, yulactiv + "spaintX.txt"))
                list.add(LateClick("CanvasView.kt", yulmain + "canvas.txt"))
            }
            33 -> {
                list.add(LateClick(m, yulmain + "dateMain.txt"))
                list.add(LateClick(x, yulactiv + "dateX.txt"))
            }
            34 -> {
                list.add(LateClick(m, yulmain + ".txt"))
                list.add(LateClick(x, yulactiv + ".txt"))
            }
            35 -> {
                list.add(LateClick(m, yulmain + "textCMain.txt"))
                list.add(LateClick(x, yulactiv + "textCX.txt"))
            }
            36 -> {
                list.add(LateClick(m, yulmain + "timePMain.txt"))
                list.add(LateClick(x, yulactiv + "timePX.txt"))
            }
            37 -> {
                list.add(LateClick(m, yulmain + "chronoMain.txt"))
                list.add(LateClick(x, yulactiv + "chronoX.txt"))
            }
            38 -> {
                list.add(LateClick(m, yulmain + "listMain.txt"))
                list.add(LateClick(x, yulactiv + "listX.txt"))
            }
            39 -> {
                list.add(LateClick(m, yulmain + "gridMain.txt"))
                list.add(LateClick(x, yulactiv + "gridX.txt"))
            }
            40 -> {
                list.add(LateClick(m, yulmain + "searchMain.txt"))
                list.add(LateClick(x, yulactiv + "searchX.txt"))
            }
            41 -> {
                list.add(LateClick(m, yulmain + "listCMain.txt"))
                list.add(LateClick(x, yulactiv + "listCX.txt"))
                list.add(LateClick("CList.kt", yulmain + "listClist.txt"))
                list.add(LateClick("CListAdapter", yulmain + "listCAdap.txt"))
                list.add(LateClick("custom_list", yulactiv + "listDX.txt"))
                list.add(LateClick("@drawble/list_back.xml", yulactiv + "listDBX.txt"))

            }
            58 -> {
                list.add(LateClick(m, yulmain + "startResultMain.txt"))
                list.add(LateClick(x, yulactiv + "startResultX.txt"))
                list.add(LateClick("MessageActivity.kt", yulmain + "startResultMessageMain.txt"))
                list.add(LateClick("activity_message.xml", yulactiv + "startResultMessageX.txt"))
            }
            59 -> {
                list.add(LateClick(m, yulmain + "activityLMain.txt"))
                list.add(LateClick(x, yulactiv + "activityLX.txt"))
            }
            60 -> {
                list.add(LateClick(m, yulmain + "fragMain.txt"))
                list.add((LateClick(x, yulactiv + "fragLX.txt")))
                list.add(LateClick("FrameLayout.kt", yulmain + "fragFrameMain.txt"))
                list.add(LateClick("activity_frame_layot.xml", yulactiv + "fragFrameX.txt"))
            }
            61 -> {
                list.add(LateClick(m, yulmain + "fragListMain.txt"))
                list.add((LateClick(x, yulactiv + "fragListX.txt")))
                list.add(LateClick("FrameLayout.kt", yulmain + "frameListFrameMain.txt"))
                list.add(LateClick("activity_frame_layot.xml", yulactiv + "fragListFrameX.txt"))
            }
            62 -> {
                list.add(LateClick(m, yulmain + "fragDialogMain.txt"))
                list.add(LateClick(x, yulactiv + "fragDialogX.txt"))
            }
            63 -> {
                list.add(LateClick(m, yulmain + "fragChangeMain.txt"))
                list.add(LateClick(x, yulactiv + "fragChangeX.txt"))
                list.add(LateClick("FragmentOne.kt", yulmain + "fragChangeOneMain.txt"))
                list.add(LateClick("fragment_one.xml", yulactiv + "fragChangeOneX.txt"))
                list.add(LateClick("FragmentTwo.kt", yulmain + "fragChangeTwoMain.txt"))
                list.add(LateClick("fragment_Two.xml", yulactiv + "fragChangeTwoX.txt"))
            }
            64 -> {
                list.add(LateClick(m, yulmain + "wifiSMain.txt"))
                list.add(LateClick(x, yulactiv + "wifiSX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/wifiSManifest.txt"))
            }
            65 -> {
                list.add(LateClick(m, yulmain + "wifiIMain.txt"))
                list.add(LateClick(x, yulactiv + "wifiIX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/wifiMainfest.txt"))
            }
            66 -> {
                list.add(LateClick(m, yulmain + "moveMain.txt"))
                list.add(LateClick(x, yulactiv + "moveX.txt"))
                list.add(LateClick("@anim/top.xml", "animdemo/top.txt"))
                list.add(LateClick("@anim/bottom.xml", "animdemo/bottom.txt"))
                list.add(LateClick("@anim/left.xml", "animdemo/left.txt"))
                list.add(LateClick("@anim/right.xml", "animdemo/right.txt"))
            }
            67 -> {
                list.add(LateClick(m, yulmain + "rotateMain.txt"))
                list.add(LateClick(x, yulactiv + "rotateX.txt"))
                list.add(LateClick("@anim/clockwise.xml", "animdemo/clockwise.txt"))
                list.add(LateClick("@anim/anticlock.xml", "animdemo/anticlock.txt"))
            }
            68 -> {
                list.add(LateClick(m, yulmain + "blinkMain.txt"))
                list.add(LateClick(x, yulactiv + "blinkX.txt"))
                list.add(LateClick("@anim/blink.xml", "animdemo/blink.txt"))
            }
            69 -> {
                list.add(LateClick(m, yulmain + "slideMain.txt"))
                list.add(LateClick(x, yulactiv + "slideX.txt"))
                list.add(LateClick("@anim/up.xml", "animdemo/up.txt"))
                list.add(LateClick("@anim/down.xml", "animdemo/down.txt"))
                list.add(LateClick("@anim/left.xml", "animdemo/left.txt"))
                list.add(LateClick("@anim/right.xml", "animdemo/right.txt"))
            }
            70 -> {
                list.add(LateClick(m, yulmain + "fadeMain.txt"))
                list.add(LateClick(x, yulactiv + "fadeX.txt"))
                list.add(LateClick("@anim/fade_in.xml", "animdemo/fade_in.txt"))
                list.add(LateClick("@anim/fade_out.xml", "animdemo/fade_out.txt"))
            }
            71 -> {
                list.add(LateClick(m, yulmain + "zoomMain.txt"))
                list.add(LateClick(x, yulactiv + "zoomX.txt"))
                list.add(LateClick("@anim/zoom_in.xml", "animdemo/zoom_in.txt"))
                list.add(LateClick("@anim/zoom_out.xml", "animdemo/zoom_out.txt"))
            }
            72 -> {
                list.add(LateClick(m, yulmain + "bounceMain.txt"))
                list.add(LateClick(x, yulactiv + "bounceX.txt"))
                list.add(LateClick("@anim/bounce.xml", "animdemo/bounce.txt"))
            }
            73 -> {
                list.add(LateClick(m, yulmain + "CalcMain.txt"))
                list.add(LateClick(x, yulactiv + "CalcX.txt"))
            }
            74 -> {
                list.add(LateClick(m, yulmain + "bmiMain.txt"))
                list.add(LateClick(x, yulactiv + "bmiX.txt"))
            }
            75 -> {
                list.add(LateClick(m, yulmain + "tipMain.txt"))
                list.add(LateClick(x, yulactiv + "tipX.txt"))
            }
            76 -> {
                list.add(LateClick(m, yulmain + "fabMain.txt"))
                list.add(LateClick(x, yulactiv + "fabX.txt"))
                list.add(LateClick("app/build.gradle", "animdemo/fabBuild.txt"))
            }
            77 -> {
                list.add(LateClick(m, yulmain + "bottomMain.txt"))
                list.add(LateClick(x, yulactiv + "bottomX.txt"))
                list.add(LateClick("app/build.gradle", "animdemo/bottomBuild.txt"))
                list.add(LateClick("@menu/bottom_navigation.xml", "animdemo/bottomMenu.txt"))
            }
            78 -> {
                list.add(LateClick(m, yulmain + "boSMain.txt"))
                list.add(LateClick(x, yulactiv + "boSX.txt"))
                list.add(LateClick("app/build.gradle", "animdemo/boSBuild.txt"))
            }
            79 -> {
                list.add(LateClick(m, yulmain + "slfMain.txt"))
                list.add(LateClick(x, yulactiv + "slfX.txt"))
                list.add(LateClick("app/build.gradle", "animdemo/slfBuild.txt"))
            }
            80 -> {
                list.add(LateClick(m, yulmain + "snackMain.txt"))
                list.add(LateClick(x, yulactiv + "snackX.txt"))
                list.add(LateClick("app/build.gradle", "animdemo/snackBuild.txt"))
            }
            81 -> {
                list.add(LateClick(m, yulmain + "tmMain.txt"))
                list.add(LateClick(x, yulactiv + "tmX.txt"))
            }
            82 -> {
                list.add(LateClick(m, yulmain + "snMain.txt"))
                list.add(LateClick(x, yulactiv + "snX.txt"))
            }
            83 -> {
                list.add(LateClick(m, yulmain + "btsMain.txt"))
                list.add(LateClick(x, yulactiv + "btsX.txt"))
            }
            84 -> {
                list.add(LateClick(m, yulmain + "bpsMain.txt"))
                list.add(LateClick(x, yulactiv + "bpsX.txt"))
            }
            85 -> {
                list.add(LateClick(m, yulmain + "isNMain.txt"))
                list.add(LateClick(x, yulactiv + "isNX.txt"))
            }
            86 -> {
                list.add(LateClick(m, yulmain + "nAMain.txt"))
                list.add(LateClick(x, yulactiv + "nAX.txt"))
            }
            87 -> {
                list.add(LateClick(m, yulmain + "sttMain.txt"))
                list.add(LateClick(x, yulactiv + "sttX.txt"))
            }
            88 -> {
                list.add(LateClick(m, yulmain + "ttsMain.txt"))
                list.add(LateClick(x, yulactiv + "ttsX.txt"))
            }
            89 -> {
                list.add(LateClick(m, yulmain + "sqlMain.txt"))
                list.add(LateClick(x, yulactiv + "splX.txt"))
                list.add(LateClick("DataBaseHelper.kt", yulmain + "sqlDH.txt"))
                list.add(LateClick("DataBaseConTainer.kt", yulmain + "sqlDC.txt"))
            }
            90 -> {
                list.add(LateClick(m, yulmain + "sqlRMain.txt"))
                list.add(LateClick(x, yulactiv + "sqlRX.txt"))
                list.add(LateClick("DatabaseHelper.kt", yulmain + "sqlRDH.txt"))
                list.add(LateClick("DatabaseContainer.kt", yulmain + "sqlRDC.txt"))
            }
            91 -> {
                list.add(LateClick(m, yulmain + "sqlDMain.txt"))
                list.add(LateClick(x, yulactiv + "sqlDX.txt"))
                list.add(LateClick("DatabaseHelper.kt", yulmain + "sqlDDH.txt"))
                list.add(LateClick("DatabaseContainer.kt", yulmain + "sqlDDC.txt"))

            }
            92 -> {
                list.add(LateClick(m, yulmain + "sqlUMain.txt"))
                list.add(LateClick(x, yulactiv + "sqlUX.txt"))
                list.add(LateClick("DatabaseHelper.kt", yulmain + "sqlUDH.txt"))
                list.add(LateClick("DatabaseContainer.kt", yulmain + "sqlUDC.txt"))
            }
            93 -> {
                list.add(LateClick(m, yulmain + "blueofMain.txt"))
                list.add(LateClick(x, yulactiv + "blueofX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/blueofma.txt"))
            }
            94 -> {
                list.add(LateClick(m, yulmain + "bluepairMani.txt"))
                list.add(LateClick(x, yulactiv + "bluepairX.txt"))
                list.add(LateClick("AndoidManifest.xml", "animdemo/bluepairMani.txt"))
            }
            95 -> {
                list.add(LateClick(m, yulmain + "fbMain.txt"))
                list.add(LateClick(x, yulactiv + "fbX.txt"))
            }
            96 -> {
                list.add(LateClick(m, yulmain + "twiMain.txt"))
                list.add(LateClick(x, yulactiv + "twiX.txt"))
            }
            97 -> {
                list.add(LateClick(m, yulmain + "waMain.txt"))
                list.add(LateClick(x, yulactiv + "waX.txt"))
            }
            98 -> {
                list.add(LateClick(m, yulmain + "gMain.txt"))
                list.add(LateClick(x, yulactiv + "gX.txt"))
            }
            99 -> {
                list.add(LateClick(m, yulmain + "pdMain.txt"))
                list.add(LateClick(x, yulactiv + "pdX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/pdMani.txt"))
            }
            100 -> {
                list.add(LateClick(m, yulmain + "rcMain.txt"))
                list.add(LateClick(x, yulactiv + "rcX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/rcMani.txt"))
            }
            101 -> {
                list.add(LateClick(m, yulmain + "rsMain.txt"))
                list.add(LateClick(x, yulactiv + "rsX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/rsMani.txt"))
            }
            102 -> {
                list.add(LateClick(m, yulmain + "viewInstallMain.txt"))
                list.add(LateClick(x, yulactiv + "viewInstallX.txt"))
            }
            103 -> {
                list.add(LateClick(m, yulmain + "vibrateMain.txt"))
                list.add(LateClick(x, yulactiv + "vibrateX.txt"))
                list.add(LateClick("AndroidManifest", "animdemo/vibrateManiX.txt"))
            }
            104 -> {
                list.add(LateClick(m, yulmain + "brightnessMain.txt"))
                list.add(LateClick(x, yulactiv + "brightnessX.txt"))
            }
            105 -> {
                list.add(LateClick(m, yulmain + "flashMain.txt"))
                list.add(LateClick(x, yulactiv + "flashX.txt"))
                list.add(LateClick("AndroidManifest", "animdemo/flashManiX.txt"))
            }
            106 -> {
                list.add(LateClick(m, yulmain + "spMain.txt"))
                list.add(LateClick(x, yulactiv + "spX.txt"))
            }
            113 -> {
                list.add(LateClick(m, yulmain + "csMain.txt"))
                list.add(LateClick(x, yulactiv + "csX.txt"))
            }
            108 -> {
                list.add(LateClick(m, yulmain + "insMain.txt"))
                list.add(LateClick(x, yulactiv + "insX.txt"))
            }
            109 -> {
                list.add(LateClick(m, yulmain + "exsMain.txt"))
                list.add(LateClick(x, yulactiv + "exsX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/exsMani.txt"))
            }
            110 -> {
                list.add(LateClick(m, yulmain + "sciMain.txt"))
                list.add(LateClick(x, yulactiv + "sciX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/sciMani.txt"))
                list.add(LateClick("xml/provider_paths.xml", yulactiv + "provider_paths.txt"))
            }
            111 -> {
                list.add(LateClick(m, yulmain + "scvMain.txt"))
                list.add(LateClick(x, yulactiv + "scvX.txt"))
                list.add(LateClick("AndroidManifest.xml", "animdemo/scvMani.txt"))
                list.add(LateClick("xml/provider_paths.xml", yulactiv + "provider_paths.txt"))
            }
            112 -> {
                list.add(LateClick(m, yulmain + "openMapMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "openMapActivityMain.txt"))
            }
            113 -> {
                list.add(LateClick(m, yulmain + "searchOnMapMainActivity.txt"))
                list.add(LateClick(x, yulactiv + "searchOnMapctivityMain.txt"))
            }
        }
    }

    override fun onItemClickListener(position: Int, lateClick: LateClick) {
        var intent = Intent(this, ReadtxtActivity::class.java)
        intent.putExtra("txt", lateClick.txtFile)
        startActivity(intent)
    }

    override fun onButtonClickListener(position: Int) {

    }
}
