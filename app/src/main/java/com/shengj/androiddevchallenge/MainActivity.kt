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

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.shengj.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {

    companion object {
        const val SCREEN_DOG_LIST = "screen_dog_list"
        const val SCREEN_DOG_DETAIL = "screen_dog_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = SCREEN_DOG_LIST) {
                    composable(SCREEN_DOG_LIST) {
                        ScreenDogList(navController)
                    }
                    composable(
                        "$SCREEN_DOG_DETAIL/{index}",
                        arguments = listOf(navArgument("index") { type = NavType.IntType })
                    ) {
                        ScreenDogDetail(navController, it.arguments?.getInt("index") ?: 0)
                    }
                }
            }
        }
    }
}
