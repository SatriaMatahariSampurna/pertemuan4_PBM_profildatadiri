package id.utdi.satria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.utdi.satria.ui.theme.ProfilDataDiriTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilDataDiriTheme {
                //Surface container yang menggunakan warna 'latar belakang' dari tema
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfilDataDiri()
                }
            }
        }
    }
}

@Composable
fun ProfilDataDiri() {
    // Layout kolom dengan modifier dan warna background
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        // Elemen gambar untuk foto progfil dengan modifier
        MyImage(imageResource = R.drawable.satria)

        // Elemen Spacer
        Spacer(modifier = Modifier.height(16.dp))

        // Elemen text untuk nama, no.hp, sosial media, dan email dengan modifier
        Text(
            text = "SatriaMatahariSampurna",
            modifier = Modifier.padding(8.dp),
            fontSize = 24.sp,
            color = Color.Black
        )

        Text(
            text = "Phone: +6285601894852",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        Text(
            text = "Instagram : @satria.mss",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )

        Text(
            text = "fecebook : @satriams",
            modifier = Modifier.padding(8.dp),
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}

@Composable
fun MyImage(imageResource: Int) {
    // Elemen image dengan modifier
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ProfilDataDiriPreview() {
    ProfilDataDiriTheme {
        ProfilDataDiri()
    }
}

