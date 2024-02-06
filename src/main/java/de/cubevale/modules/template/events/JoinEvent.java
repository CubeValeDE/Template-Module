package de.cubevale.modules.template.events;

import de.cubevale.core.api.enums.MessageType;
import de.cubevale.core.api.event.EventListener;
import de.cubevale.core.api.events.UserJoinEvent;
import de.cubevale.core.api.user.OnlineUser;

public class JoinEvent extends EventListener {
    public void onJoin(UserJoinEvent event) {
        OnlineUser user = event.getUser();
        user.sendMessage(MessageType.INFO, "Welcome!");
    }
}
