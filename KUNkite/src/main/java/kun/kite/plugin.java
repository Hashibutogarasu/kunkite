package kun.kite;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, Command command, @NotNull String label, String[] args) {

        FileConfiguration config = getConfig();

        if(command.getName().equals("kunkite")) {

            Player p = (Player) sender;

            String pn = p.getName();
            String uuid = p.getUniqueId().toString();

            try {
                p.chat("/tp " + "roadhog_kun " + p.getDisplayName());
            }
            catch (Exception e){
                getLogger().warning(e.toString());
                p.chat("KUNさんは見つからないようだ...");
            }
        }
        return false;
    }
}
