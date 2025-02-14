package com.example.androidLearnings.poc.poccompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.androidLearnings.R

@Composable
fun DetailsScreen(
    modifier: Modifier = Modifier,
    name: String?,
    url: String?,
    captions: Int? = null,
    boxCount: Int? = null,
    height: Int? = null,
    width: Int? = null,
) {

    Column(
        modifier
            .background(Color(0xffffc107))
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 45.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (url != null){
            AsyncImage(
                model = url, contentDescription = name,
                modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp)),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                error = painterResource(R.drawable.error)
            )

            ClickableTextUrl(url = url)

        }
        Spacer(modifier.height(20.dp))
        if (name != null){
            Text(
                text = name,
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 45.sp
            )
        }

        Spacer(modifier.height(10.dp))
        if (captions != null){
            Text(
                text = "Estimated number of all-time captions: $captions",
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                fontSize = 15.sp,
                textAlign = TextAlign.Start,
                lineHeight = 26.sp
            )
        }

        Spacer(modifier.height(10.dp))
        if (boxCount != null) {
            Text(
                text = "Default number of boxes: $boxCount",
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                fontSize = 15.sp,
                textAlign = TextAlign.Start,
                lineHeight = 26.sp
            )
        }

        Spacer(modifier.height(10.dp))
        if (height != null && width != null) {
            Text(
                text = "Dimensions: $height px x $width px",
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                fontSize = 15.sp,
                textAlign = TextAlign.Start,
                lineHeight = 26.sp
            )
        }
    }
}