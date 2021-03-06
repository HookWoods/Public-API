package com.pvphall.hallclientapi.api;

import com.pvphall.hallclientapi.api.emotes.IEmote;
import com.pvphall.hallclientapi.api.players.IPlayerManager;
import org.bukkit.entity.Player;

import java.util.List;

public interface IHallAPI {

    /**
     * Make a player perform a emote.
     *
     * @param player - The player who should perform the emote
     * @param emote - The emote to send
     * @param toEveryone - If the emote should be send to everyone on the server
     */
    void sendEmote(Player player, IEmote emote, boolean toEveryone);

    /**
     * Set a list of mods to disallow for the given player.
     *
     * @param player - The player to send the list of disallowed mods
     * @param disallowedMods - The list of mods to disallow
     */
    void setDisallowedMods(Player player, List<String> disallowedMods);

    /**
     * Set the Discord rich presence for the given player.
     *
     * @param player - The player to set the rich presence
     * @param richPresence - The rich presence string
     */
    void setRichPresence(Player player, String richPresence);

    /**
     * Set if this server should be accessible only with PvPHall Client.
     *
     * @param hallClientOnly - If the server is restricted
     */
    void setHallClientOnly(boolean hallClientOnly);

    /**
     * Check if the server only allow players with PvPHall Client.
     *
     * @return True if the server is restricted
     */
    boolean isHallClientOnly();

    /**
     * Set if the server should be accessible only with PvPHall AC.
     *
     * @param acOnly - If the server is restricted
     */
    void setACOnly(boolean acOnly);

    /**
     * Check if the server only allow players with PvPHall AC.
     *
     * @return True if the server is restricted
     */
    boolean isACOnly();

    /**
     * Check if a player is playing with PvPHall Client.
     *
     * @param player - The player to check
     * @return True if the player is playing with PvPHall Client
     */
    boolean isRunningHallClient(Player player);

    /**
     * Check if a player is playing with PvPHall AC.
     *
     * @param player - The player to check
     * @return True if the player is playing with PvPHall AC
     */
    boolean isRunningAC(Player player);

    /**
     * Get the instance of IPlayerManager to manage players.
     *
     * @return The IPlayerManager instance
     */
    IPlayerManager getPlayerManager();
}
