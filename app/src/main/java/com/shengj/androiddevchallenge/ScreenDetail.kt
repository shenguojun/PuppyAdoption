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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.shengj.androiddevchallenge.data.dogs
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun ScreenDogDetail(navController: NavController, index: Int) {
    val dog by rememberSaveable { mutableStateOf(dogs[index]) }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = dog.description) })
        },
        modifier = Modifier.background(color = MaterialTheme.colors.background),
        content = {
            Column {
                GlideImage(
                    data = dog.imageUrl,
                    contentDescription = dog.description,
                    modifier = Modifier.wrapContentSize(),
                    loading = {
                        Box(modifier = Modifier.fillMaxSize()) {
                            CircularProgressIndicator()
                        }
                    },
                )
                Text(modifier = Modifier.padding(10.dp), text = dog.detail, fontSize = 18.sp)
            }
        }
    )
}
