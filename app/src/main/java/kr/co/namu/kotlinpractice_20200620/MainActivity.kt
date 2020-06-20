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
//            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()


//            출력용 텍스트뷰에 입력한 내용을 그대로 반영
//            resultTxt의 text값을 set
            resultTxt.text = inputMessage

            if(inputMessage == "Hello"){
//                조건문 검사 결과가 true 일때만 실행되는 영역
                Toast.makeText(this,"인사입니다",Toast.LENGTH_SHORT).show()
            }
            else if (inputMessage == "Hi"){
                Toast.makeText(this,"다른 인사입니다.",Toast.LENGTH_SHORT).show()

            }
            else if (inputMessage == "bye"){
                Toast.makeText(this,"작별 인사",Toast.LENGTH_SHORT).show()
            }
            else {
//                위 어느 경우에도 해당하지 않는 경우
                Toast.makeText(this,"그 외의 메세지입니다.", Toast.LENGTH_SHORT).show()
            }
        }


        }
    }
