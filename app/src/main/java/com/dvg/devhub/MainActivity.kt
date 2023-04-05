package com.dvg.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dvg.devhub.ui.theme.DevhubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevhubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreen(){
    Column {
        val boxHeight = remember {
            150.dp
        }
        val imageHeight = remember {
            boxHeight
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(0xFF3F4E66), shape = RoundedCornerShape(
                        bottomStart = 16.dp,
                        bottomEnd = 16.dp
                    )
                )
                .height(boxHeight)
        ) {
            Image(
                painterResource(id = R.drawable.img_profile),
                "Image Profile",
                modifier = Modifier
                    .offset(y = imageHeight / 2)
                    .size(imageHeight)
                    .align(Alignment.BottomCenter)
                    .clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(imageHeight / 2))

        Column(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Name("Diego Alves")
            GithubUser("diegoalves94")
            Bio("Android Developer, learning Jetpack Compose")
        }
    }
}

@Composable
fun Name(name: String) {
    Text(text = name,
        fontSize = 32.sp)
}

@Composable
fun GithubUser(user: String) {
    Text(text = user,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold)
}

@Composable
fun Bio(bio: String) {
    Text(text = bio,
        Modifier
            .padding(
                start = 8.dp,
                bottom = 8.dp,
                end = 8.dp
            )
            .fillMaxWidth(),
        textAlign = TextAlign.Center)
}