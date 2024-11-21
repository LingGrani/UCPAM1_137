package com.example.ucp1pam

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Ucp1(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf("")}
    var phone by remember { mutableStateOf("")}
    var address by remember { mutableStateOf("")}
    var year by remember { mutableStateOf("")}

    var iemail by remember { mutableStateOf("")}
    var iphone by remember { mutableStateOf("")}
    var iaddress by remember { mutableStateOf("")}
    var iyear by remember { mutableStateOf("")}

    val list = listOf("2020", "2021", "2022")

    val navy = Color(0xFF2C417A)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().
            background(color = navy),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier.padding(end = 10.dp, start = 10.dp, top = 40.dp, bottom = 10.dp).
                weight(1f)
            ) {
                Image(
                    painter = painterResource(R.drawable.catmlbb),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).size(80.dp)
                )
                Image(
                    painter = painterResource(R.drawable.verif),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).size(30.dp)
                )
            }
            Column (
                modifier = Modifier.padding(16.dp).weight(2f),
                verticalArrangement = Arrangement.Bottom,

            ){
                Text(
                    text = "Halo",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 15.sp
                    ),
                )
                Text(
                    text = "Muhammad Adri",
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp
                    )
                )
            }
            Icon(
                Icons.Filled.Notifications,
                contentDescription = null,
                modifier = Modifier.size(30.dp).weight(1f),
                Color.White
            )
        }
        Column (
            modifier = Modifier.padding(end = 10.dp, start = 10.dp, top = 40.dp, bottom = 10.dp)
        ){
            Text(
                text = "Masukan Biodata Kamu!",
                fontWeight = FontWeight.Bold
            )
            Text(text = "Silahkan isi semua data dengan benar")
            Column (
                Modifier.background(color = Color.Gray, shape = RoundedCornerShape(10.dp)).padding(10.dp)
            ) {
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    placeholder = { Text("isi Email anda")},
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                )
                TextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text("Phone") },
                    placeholder = { Text("isi Phone anda")},
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                )
                TextField(
                    value = address,
                    onValueChange = { address = it },
                    label = { Text("Address") },
                    placeholder = { Text("isi Address anda")},
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                )
                Text(
                    text = "Tahun Masuk:",
                    fontWeight = FontWeight.Bold
                )
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    list.forEach { Selected ->
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = year == Selected,
                                onClick = {year = Selected}
                            )
                            Text(text = Selected)
                        }
                    }
                }
            }
        }
        Button(
            onClick = {
                iemail = email
                iphone = phone
                iaddress = address
                iyear = year
            },
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            colors = ButtonDefaults.buttonColors(navy)
        ) {
            Text(text = "Submit")
        }
        Column (
            modifier = Modifier.
            background(color = navy, shape = RoundedCornerShape(10.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text="Data Kamu",
                style = TextStyle(
                    color = Color.White,
                ),
            )
            Column (
                modifier = Modifier.background(color = navy, shape = RoundedCornerShape(10.dp))
            ){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Icon(
                        Icons.Filled.Email,
                        contentDescription = null,
                        modifier = Modifier.size(15.dp),
                        Color.White
                    )
                    Text(
                        text = "Email",
                        modifier = Modifier.weight(0.8f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text= ":",
                        modifier = Modifier.weight(0.2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text = iemail,
                        modifier = Modifier.weight(2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Icon(
                        Icons.Filled.Phone,
                        contentDescription = null,
                        modifier = Modifier.size(15.dp),
                        Color.White
                    )
                    Text(
                        text = "Phone",
                        modifier = Modifier.weight(0.8f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text= ":",
                        modifier = Modifier.weight(0.2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text = iphone,
                        modifier = Modifier.weight(2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Icon(
                        Icons.Filled.LocationOn,
                        contentDescription = null,
                        modifier = Modifier.size(15.dp),
                        Color.White
                    )
                    Text(
                        text = "address",
                        modifier = Modifier.weight(0.8f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text= ":",
                        modifier = Modifier.weight(0.2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text = iaddress,
                        modifier = Modifier.weight(2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Icon(
                        Icons.Filled.DateRange,
                        contentDescription = null,
                        modifier = Modifier.size(10.dp),
                        Color.White
                    )
                    Text(
                        text = "Year",
                        modifier = Modifier.weight(0.8f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text= ":",
                        modifier = Modifier.weight(0.2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                    Text(
                        text = iyear,
                        modifier = Modifier.weight(2f),
                        style = TextStyle(
                            color = Color.White,
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun Detail(
    para:String, argu:String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Icon(
                Icons.Filled.Notifications,
                contentDescription = null,
                modifier = Modifier.size(10.dp)
            )
            Text(
                text = para,
                modifier = Modifier.weight(0.8f),
                style = TextStyle(
                    color = Color.White,
                )
            )
            Text(
                text= ":",
                modifier = Modifier.weight(0.2f),
                style = TextStyle(
                    color = Color.White,
                )
            )
            Text(
                text = argu,
                modifier = Modifier.weight(2f),
                style = TextStyle(
                    color = Color.White,
                )
            )
        }
    }
}