package com.jubayer_ahamad_tayef.row_in_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jubayer_ahamad_tayef.row_in_jetpack_compose.ui.theme.Row_In_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Row_In_Jetpack_ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyRow(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxSize().padding(horizontal = 5.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .weight(1f)
        )
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .weight(1f)
                .align(Alignment.Bottom)
        )
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .padding(start = 5.dp)
                .background(MaterialTheme.colorScheme.primary)
                .weight(1f)
                .align(Alignment.Bottom)
        )
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        Spacer(
            modifier = Modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .weight(1f)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyRowPreview() {
    MyRow(modifier = Modifier.padding(5.dp))
}