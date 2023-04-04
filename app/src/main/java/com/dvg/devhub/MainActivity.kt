package com.dvg.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
                    Column {
                        Image(painterResource(id = R.drawable.img_profile), "Image Profile")
                        Name("Diego Alves")
                        GithubUser("diegoalves94")
                        Bio("Android Developer, learning Jetpack Compose")
                    }

                }
            }
        }
    }
}

@Composable
fun Name(name: String) {
    Text(text = name)
}

@Composable
fun GithubUser(user: String) {
    Text(text = user)
}

@Composable
fun Bio(bio: String) {
    Text(text = bio)
}