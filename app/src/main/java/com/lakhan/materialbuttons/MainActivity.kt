package com.lakhan.materialbuttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lakhan.materialbuttons.ui.theme.MaterialButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                        ) {
                            Text(text = "filled button")
                        }
                        
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "add to card button",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Add to card")
                        }

                        FilledTonalButton(onClick = { /*TODO*/ }) {
                            Text(text = "Open in music")
                        }
                        
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Back")
                        }

                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Know more")
                        }

                        IconButton(onClick = { /* doSomething() */ }) {
                            Icon(Icons.Filled.Create, contentDescription = "Localized description")
                        }
                        
                        FloatingActionButton(
                            onClick = { /*TODO*/ },
                            containerColor = MaterialTheme.colorScheme.tertiary
                        ) {
                            Icon(Icons.Filled.Create, contentDescription = "just FAB")
                        }

                        ExtendedFloatingActionButton(
                            onClick = { /* do something */ },
                            icon = { Icon(Icons.Filled.Add, "Localized description") },
                            text = { Text(text = "Extended FAB") },
                        )

                    }
                }
            }
        }
    }
    
}
