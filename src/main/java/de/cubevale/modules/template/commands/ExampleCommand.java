package de.cubevale.modules.template.commands;

import de.cubevale.core.api.command.Command;
import de.cubevale.core.api.command.CommandOptions;
import de.cubevale.core.api.enums.MessageType;
import de.cubevale.core.api.user.OnlineUser;

@CommandOptions(
        name = "example",
        permission = "cubevale.command.example",
        aliases = {"e", "ex"}
)
public class ExampleCommand extends Command {
    @Override
    public boolean onCommand(OnlineUser user, String[] args) {
        user.sendMessage(MessageType.INFO, "I am an example command!");
        return true;
    }
}
