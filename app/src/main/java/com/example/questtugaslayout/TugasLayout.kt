package com.example.questtugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayout(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = dimensionResource(id = R.dimen.screen_top_padding))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = dimensionResource(R.dimen.text_prodi).value.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = dimensionResource(R.dimen.text_univ).value.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.header_spacer)))

        ProfileCard(
            namaRes = R.string.syeera,
            noHpRes = R.string.noHp_1,
            alamatRes = R.string.alamatsyeera,
            bgColorRes = R.color.card_4_bg,
            namaFontFamily = FontFamily.Cursive,
            noHpColorRes = R.color.purple_500,
            alamatColorRes = R.color.white
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.card_spacing)))

        ProfileCard(
            namaRes = R.string.tika,
            noHpRes = R.string.noHp_2,
            alamatRes = R.string.alamatTika,
            bgColorRes = R.color.card_2_bg,
            noHpColorRes = R.color.teal_700,
            alamatColorRes = R.color.purple_200
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.card_spacing)))

        ProfileCard(
            namaRes = R.string.haechan,
            noHpRes = R.string.noHp_3,
            alamatRes = R.string.alamathaechan,
            bgColorRes = R.color.card_3_bg,
            noHpColorRes = R.color.biru,
            alamatColorRes = R.color.coklat
        )

    }
}