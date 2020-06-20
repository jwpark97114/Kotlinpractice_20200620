package kr.co.namu.kotlinpractice_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Button이 눌리면 입력한 내용을 받아서 TextView에 출력

        okBtn.setOnClickListener {

//            입력한 내용을 문자열로 변환하여 inputMessage란 공간에 기록
//            messageEdt한테 text값을 get
            val inputMessage = messageEdt.text.toString()

//            기록된 내용을 토스트로 출력
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

//            출력용 텍스트뷰에 입력한 내용을 그대로 반영
//            resultTxt의 text값을 set
            resultTxt.text = inputMessage
        }


        }
    }
