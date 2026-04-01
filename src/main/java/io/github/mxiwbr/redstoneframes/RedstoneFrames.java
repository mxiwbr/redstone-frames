package io.github.mxiwbr.redstoneframes;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class RedstoneFrames extends JavaPlugin {

    @Override
    public void onEnable() {

        int bStatsPluginId = 30517;
        Metrics metrics = new Metrics(this, bStatsPluginId);
    }

}
