package net.nowtryz.info732.TD1.castle;

import net.nowtryz.info732.TD1.Logger;

import java.util.ArrayList;
import java.util.List;

public class Castle {
    private static Castle instance;
    private final List<CastleListener> listeners = new ArrayList<>();

    private Castle() {}

    public static Castle getInstance() {
        if (instance == null) synchronized (Castle.class) {
            if (instance == null) instance = new Castle();
        }
        return instance;
    }

    public final void register(CastleListener listener) {
        this.listeners.add(listener);
    }

    public final void collapse() {
        Logger.getLogger().warn("A castle start collapsing");
        this.listeners.forEach(listener -> listener.onCastleCollapsing(this));
        Logger.getLogger().warn("A castle collapsed");
        this.listeners.forEach(listener -> listener.onCastleCollapsed(this));
    }
}
