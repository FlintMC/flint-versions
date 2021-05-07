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
    description = "Minecraft 1.16.5"

    staticFiles {
        create("version.json") {
            from("minecraft-version.json")
            to("versions/flint-1.16.5/flint-1.16.5.json")
        }
        create("methodMappings") {
            from(URI.create("jar:https://files.minecraftforge.net/maven/de/oceanlabs/mcp/mcp_snapshot/20210309-1.16.5/mcp_snapshot-20210309-1.16.5.zip!/methods.csv"))
            to("flint/assets/1.16.5/methods.csv")
        }
        create("fieldMappings") {
            from(URI.create("jar:https://files.minecraftforge.net/maven/de/oceanlabs/mcp/mcp_snapshot/20210309-1.16.5/mcp_snapshot-20210309-1.16.5.zip!/fields.csv"))
            to("flint/assets/1.16.5/fields.csv")
        }
        create("joinedMappings") {
            from(URI.create("jar:https://files.minecraftforge.net/maven/de/oceanlabs/mcp/mcp_config/1.16.5/mcp_config-1.16.5.zip!/config/joined.tsrg"))
            to("flint/assets/1.16.5/joined.tsrg")
        }
    }
}
