package com.khw.mbti

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.khw.mbti.ui.theme.MbtiTheme

class EstjLoveActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Column {
                    val context = LocalContext.current as? Activity

                    Image(
                        painter = painterResource(id = R.drawable.estjlove),
                        contentDescription = null
                    )
                    Button(onClick = {
                        context?.finish()
                    }) {
                        Text(text = "닫기!!!")
                    }
                }
            }
        }
    }

}