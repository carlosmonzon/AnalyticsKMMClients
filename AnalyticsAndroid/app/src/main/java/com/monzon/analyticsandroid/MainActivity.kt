package com.monzon.analyticsandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.monzon.analytics.Analytics
import com.monzon.analytics.domain.AddProductEvent
import com.monzon.analytics.domain.ProductProperty
import com.monzon.analyticsandroid.ui.theme.AnalyticsAndroidTheme

class MainActivity : ComponentActivity() {

    private val analytics = Analytics()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnalyticsAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        AddProductButton {
                            val property = ProductProperty(skuId = "id1", price = 100.00)
                            analytics.track(AddProductEvent(property))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AddProductButton(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text(text = "Add product")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AnalyticsAndroidTheme {
        AddProductButton {}
    }
}