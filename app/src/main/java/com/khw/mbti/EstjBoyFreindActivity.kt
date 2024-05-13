package com.khw.mbti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EstjBoyFreindActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Yellow)
            ) {

                Text(
                    text = "ESTJ 남자친구",
                    fontSize = 32.sp,
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Image(
                    painter = painterResource(id = R.drawable.estjboyfreind),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.Center)
                )

                Column(
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Text(text = "다소 가부장적", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "예의바르고 공손", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "ㄹㅇ 선비 스타일", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "간섭 심함", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "노력형 사랑꾼", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "한결같음", fontSize = 16.sp)
                }

                Column(
                    modifier = Modifier.align(Alignment.CenterEnd)
                ) {
                    Text(text = "말로 상처 주기도 함", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "독점욕이 강함", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "밀당할 줄 모름", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "호불호 확실", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "냉철하고 칼 같음", fontSize = 16.sp)
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(text = "연하를 주로 만남", fontSize = 16.sp)
                }

                Button(
                    modifier = Modifier
                        .align(Alignment.TopEnd),
                    onClick = {
                    finish()
                }) {
                    Text(text = "X")
                }
            }
        }
    }
}