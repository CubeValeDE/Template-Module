package de.cubevale.modules.template.commands;

import de.cubevale.core.api.command.Command;
import de.cubevale.core.api.command.CommandOptions;
import de.cubevale.core.api.user.User;

@CommandOptions(
        name = "example",
        permission = "cubevale.command.example",
        aliases = {"e", "ex"}
)
public class ExampleCommand extends Command {
    @Override
    public boolean onCommand(User user, String[] args) {
        return true;
    }
}
