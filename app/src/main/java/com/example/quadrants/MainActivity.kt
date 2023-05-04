package com.example.quadrants

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrants.ui.theme.QuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    quad()
                }
            }
        }
    }
}

@Composable
fun quad() {
    Column(
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().weight(.5f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(.5f).fillMaxSize().background(Color.Blue))
            {
                Text(text = "Text composable", textAlign = TextAlign.Center,fontWeight = FontWeight.Bold)
                Text(text = "Displays text and follows Material Design guidelines.", textAlign = TextAlign.Center)
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(.5f).fillMaxSize().background(Color.Green))
            {
                Text(text = "Image composable", textAlign = TextAlign.Center,fontWeight = FontWeight.Bold, color = Color.Black)
                Text(text = "Creates a composable that lays out and draws a given Painter class object.", textAlign = TextAlign.Center, color = Color.Black)
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().weight(.5f)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(.5f).background(Color.Red).fillMaxSize())
            {
                Text(text = "Row composable", textAlign = TextAlign.Center,fontWeight = FontWeight.Bold)
                Text(text = "A layout composable that places its children in a horizontal sequence.", textAlign = TextAlign.Center)
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(.5f).background(Color.LightGray).fillMaxSize())
            {
                Text(text = "Column composable", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color.Black)
                Text(text = "A layout composable that places its children in a vertical sequence.", textAlign = TextAlign.Center, color = Color.Black)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantsPreview() {
    QuadrantsTheme {
        quad()
    }
}