package com.example.pamlanjut3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pamlanjut3.data.DummyData
import com.example.pamlanjut3.model.User

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                UserListScreen()
            }
        }
    }
}

@Composable
fun UserListScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "NIM: 225150400111017",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Nama: Dian Indah May Kurnia",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn {
            items(DummyData.userList) { user ->
                UserItem(user)
            }
        }
    }
}

@Composable
fun UserItem(user: User) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Name: ${user.name}", fontSize = 18.sp)
            Text(text = "Username: ${user.username}", fontSize = 14.sp)
            Text(text = "Email: ${user.email}", fontSize = 14.sp)
        }
    }
}