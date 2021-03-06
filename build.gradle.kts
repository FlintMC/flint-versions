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

plugins {
    id("net.flintmc.flint-gradle")
}

group = "net.flintmc.versions"
version = System.getenv().getOrDefault("VERSION", "1.0.0")

repositories {
    mavenCentral()
}

dependencies {
    subprojects.forEach { implementation(it) }
}

subprojects {
    version = "1.0.0"

    repositories {
        mavenCentral()
    }

    plugins.withId("java") {
        apply<MavenPublishPlugin>()
    }
}

flint {
    flintVersion = "2.0.50"

    projectFilter { true }

    authors = arrayOf("LabyMedia GmbH")
    type = net.flintmc.gradle.extension.FlintGradleExtension.Type.LIBRARY

    installJar(false)
}
