package com.willfp.raritydisplay.commands

import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.core.command.impl.Subcommand
import com.willfp.eco.util.NumberUtils
import com.willfp.eco.util.StringUtils
import org.bukkit.command.CommandSender

class CommandReload(plugin: EcoPlugin) : Subcommand(
    plugin,
    "reload",
    "raritydisplay.command.reload",
    false
) {
    override fun onExecute(sender: CommandSender, args: List<String>) {
        sender.sendMessage(
            plugin.langYml.getMessage("reloaded", StringUtils.FormatOption.WITHOUT_PLACEHOLDERS)
                .replace("%time%", NumberUtils.format(plugin.reloadWithTime().toDouble()))
        )
    }
}
