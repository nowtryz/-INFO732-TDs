package net.nowtryz.info732.TD1.castle;

public interface CastleListener {
    /**
     * Notifies the listener that the given castle is collapsing
     * @param castle the castle collapsing
     */
    void onCastleCollapsing(Castle castle);

    /**
     * Notifies the listener that le castle just collapsed
     * @param castle the castle that collapsed
     */
    void onCastleCollapsed(Castle castle);
}
