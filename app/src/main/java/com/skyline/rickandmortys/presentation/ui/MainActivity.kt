package com.skyline.rickandmortys.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.skyline.rickandmortys.data.remote.RickAndMortyService
import com.skyline.rickandmortys.presentation.ui.theme.RickAndMortysTheme
import retrofit2.Retrofit


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickAndMortysTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val retrofit = Retrofit.Builder()
                        .baseUrl("https://rickandmortyapi.com/")
                        .build()
                    val rickAndMortyService: RickAndMortyService = retrofit.create(
                        RickAndMortyService::class.java)
                    rickAndMortyService.getCharacterById()

                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RickAndMortysTheme {
        Greeting("Android")
    }
}