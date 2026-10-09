package com.example.questtugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource

@Composable
fun TugasLayout(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = dimensionResource(id = R.dimen.screen_top_padding))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) { }
}