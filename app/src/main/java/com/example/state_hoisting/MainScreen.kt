package com.example.state_hoisting

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun MainScreen(modifier: Modifier = Modifier){

//    var name = ""
//    var name by mutableStateOf("")
//    var name by remember { mutableStateOf("") }
    var name by rememberSaveable { mutableStateOf("") }


Column(modifier) {
    TextField(value = name,
        onValueChange = {name = it} ,
        modifier
    )
    SideEffect {
        println("SideEffect - Composition executed")

    }   // End SideEEffect



    }   // End Column
}   // End Main Screen