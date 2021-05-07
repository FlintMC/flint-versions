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

import java.net.URI;

group = "net.flintmc.versions"

flint {
    description = "Minecraft 1.15.2"

    staticFiles {
        create("version.json") {
            from("minecraft-version.json")
            to("versions/flint-1.15.2/flint-1.15.2.json")
        }
        create("methodMappings") {
            from(URI.create("jar:https://files.minecraftforge.net/maven/de/oceanlabs/mcp/mcp_snapshot/20200610-1.15.1/mcp_snapshot-20200610-1.15.1.zip!/methods.csv"))
            to("flint/assets/1.15.2/methods.csv")
        }
        create("fieldMappings") {
            from(URI.create("jar:https://files.minecraftforge.net/maven/de/oceanlabs/mcp/mcp_snapshot/20200610-1.15.1/mcp_snapshot-20200610-1.15.1.zip!/fields.csv"))
            to("flint/assets/1.15.2/fields.csv")
        }
        create("joinedMappings") {
            from(URI.create("jar:https://files.minecraftforge.net/maven/de/oceanlabs/mcp/mcp_config/1.15.2-20200515.085601/mcp_config-1.15.2-20200515.085601.zip!/config/joined.tsrg"))
            to("flint/assets/1.15.2/joined.tsrg")
        }
    }
}
