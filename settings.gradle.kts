/*
 * FlintMC
 * Copyright (C) 2020-2021 LabyMedia GmbH and contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

rootProject.name = "flint-versions"

pluginManagement {
    plugins {
        id("net.flintmc.flint-gradle") version "2.10.0"
    }

    buildscript {
        dependencies {
            classpath("net.flintmc", "flint-gradle", "2.10.0")
        }
        repositories {
            maven {
                setUrl("https://dist.labymod.net/api/v1/maven/release")
                name = "Flint"
            }
            mavenCentral()
        }
    }
}

include(":minecraft-1-15-2")
include(":minecraft-1-16-5")
