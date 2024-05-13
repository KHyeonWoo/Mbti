package com.khw.mbti

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import org.w3c.dom.Text

class GukActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val imglist = listOf(
                R.drawable.image_1,
                R.drawable.image_2,
                R.drawable.image_3,
                R.drawable.image_4,
                R.drawable.image_5
            )
            val context = LocalContext.current as? Activity
            
            Column {

                for (i in imglist) {
                    CreateImg(imgid = i)
                }    
                Button(onClick = {
                    context?.finish()
                }) {
                    Text(text = "닫기")
                }
            }
        }
    }

    @Composable
    fun CreateImg(imgid: Int) {
        Image(painter = painterResource(id = imgid), contentDescription = null)
    }
}