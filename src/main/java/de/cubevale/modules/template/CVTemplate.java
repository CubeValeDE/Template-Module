package de.cubevale.modules.template;

import de.cubevale.core.api.Core;
import de.cubevale.core.api.Module;
import de.cubevale.core.api.ModuleOptions;
import de.cubevale.modules.template.commands.ExampleCommand;
import de.cubevale.modules.template.events.JoinEvent;

@ModuleOptions(
        name = "CVTemplate",
        version = "1.0",
        authors = "Bapty"
)
public final class CVTemplate extends Module {

    public CVTemplate(Core core) {
        super(core);
    }

    @Override
    public void onEnable() {
        // Module start logic
        registerCommand(new ExampleCommand());
        registerListener(new JoinEvent());
    }

    @Override
    public void onDisable() {
        // Module stop logic
    }
}
