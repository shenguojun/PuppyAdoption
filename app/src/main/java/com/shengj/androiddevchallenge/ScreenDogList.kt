/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shengj.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.shengj.androiddevchallenge.data.dogs
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun ScreenDogList(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.main_title)) },
                backgroundColor = Color.Transparent,
                elevation = 0.dp
            )
        },
        modifier = Modifier.background(color = MaterialTheme.colors.background),
        content = {
            LazyColumn(
                contentPadding = PaddingValues(10.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                itemsIndexed(dogs) { index, dog ->
                    Card(
                        elevation = 2.dp,
                        modifier = Modifier.clickable {
                            navController.navigate("${MainActivity.SCREEN_DOG_DETAIL}/$index")
                        }
                    ) {
                        GlideImage(
                            data = dog.imageUrl,
                            contentDescription = dog.description,
                            modifier = Modifier.fillMaxSize(),
                            loading = {
                                Box(modifier = Modifier.fillMaxSize()) {
                                    CircularProgressIndicator()
                                }
                            }
                        )
                        Surface(
                            color = colorResource(id = R.color.color_mask),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = dog.description,
                                color = Color.White,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(8.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}
