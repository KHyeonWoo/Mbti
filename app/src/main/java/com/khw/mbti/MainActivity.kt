package com.khw.mbti

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.khw.mbti.ui.theme.MbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MbtiTheme {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val context = LocalContext.current
                    Column {

                        Image(
                            painter = painterResource(id = R.drawable.estjimg),
                            contentDescription = null
                        )

                        Button(
                            modifier = Modifier
                                .padding(32.dp, 0.dp),
                            onClick = {
                                val intent = Intent(context, ESTJActivity::class.java)
                                context.startActivity(intent)
                            }
                        ) {
                            Text(text = "estj")
                        }

                        Button(
                            modifier = Modifier
                                .padding(32.dp, 0.dp),
                            onClick = {
                                val intent = Intent(context, EstjLoveActivity::class.java)
                                context.startActivity(intent)
                            }) {
                            Text(text = "estjlove")
                        }

                        Button(
                            modifier = Modifier
                                .padding(32.dp, 0.dp),
                            onClick = {
                                val intent = Intent(context, EstjBoyFreindActivity::class.java)
                                context.startActivity(intent)
                            }) {
                            Text(text = "estj 남자친구~?")
                        }
                        Button(
                            modifier = Modifier
                                .padding(32.dp, 0.dp),
                            onClick = {
                                val intent = Intent(context, GukActivity::class.java)
                                context.startActivity(intent)
                            }) {
                            Text(text = "gukguk")


                        }
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                            Column(
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.image_3),
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                        }
                    }
                }
            }
        }
    }

}