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
package com.shengj.androiddevchallenge.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Dog(val imageUrl: String, val description: String, val detail: String) : Parcelable

val dogs = listOf(
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1610632215073-0914404ff012?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwyfHxzaGliYXxlbnwwfHx8&ixlib=rb-1.2.1&q=80&w=1080",
        description = "brown short coated dog with yellow string lights",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1550035605-144be67b33ea?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwzfHxzaGliYXxlbnwwfHx8&ixlib=rb-1.2.1&q=80&w=1080",
        description = "adult white Akita",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1567225591450-06036b3392a6?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHw1fHxzaGliYXxlbnwwfHx8&ixlib=rb-1.2.1&q=80&w=1080",
        description = "dog sleeping on floor",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1567522624917-2754d8b48220?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHw3fHxzaGliYXxlbnwwfHx8&ixlib=rb-1.2.1&q=80&w=1080",
        description = "Akita wearing collar",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1575535468632-345892291673?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHw5fHxzaGliYXxlbnwwfHx8&ixlib=rb-1.2.1&q=80&w=1080",
        description = "orange dog",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1596807353051-6751bab61d40?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwxMHx8c2hpYmF8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=1080",
        description = "HaHa dog",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1599792448678-942654a4e850?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwxNXx8c2hpYmF8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=1080",
        description = "Yuka the shiba",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1603296739295-ce60b685e09e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwxNnx8c2hpYmF8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=1080",
        description = "brown and white short coated puppy sitting on gray concrete floor",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1509119993276-d691aff73209?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwxN3x8c2hpYmF8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=1080",
        description = "My dog loves, loves being outdoors. He always so inquisitive, even though the backyard never changes and I thought this face captured his “what’s going on look” perfectly.\"",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
    Dog(
        imageUrl = "https://images.unsplash.com/photo-1614003023499-03187730c863?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MXwyMDk5NjN8MHwxfHNlYXJjaHwxOXx8c2hpYmF8ZW58MHx8fA&ixlib=rb-1.2.1&q=80&w=1080",
        description = "black and white siberian husky lying on floor",
        detail = "Man's best friend is something to behold in all forms: gorgeous Golden Retrievers, tiny yapping chihuahuas, fearsome pitbulls. Unsplash's community of incredible photographers has helped us curate an amazing selection of dog images that you can access and use free of charge."
    ),
)
