package me.StevenLawson.BukkitTelnet.session;

import java.util.Set;
import java.util.UUID;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SessionCommandSender implements CommandSender
{
    private final ClientSession session;

    protected SessionCommandSender(ClientSession session)
    {
        this.session = session;
    }

    @Override
    public void sendMessage(String message)
    {
        session.printRaw(message + "\r\n:");
    }

    @Override
    public String getName()
    {
        return this.session.getUserName();
    }

    @Override
    public @NotNull Spigot spigot()
    {
        return null;
    }

    @Override
    public @NotNull Component name()
    {
        return null;
    }

    @Override
    public void sendMessage(String[] messages)
    {
        for (String message : messages)
        {
            sendMessage(message);
        }
    }

    @Override
    public void sendMessage(@Nullable UUID sender, @NotNull String message)
    {
        sendMessage(message);
    }

    @Override
    public void sendMessage(@Nullable UUID sender, @NotNull String... messages)
    {
        for (String message : messages)
        {
            sendMessage(message);
        }
    }

    @Override
    public Server getServer()
    {
        return Bukkit.getServer();
    }

    @Override
    public boolean isPermissionSet(String name)
    {
        return true;
    }

    @Override
    public boolean isPermissionSet(Permission perm)
    {
        return true;
    }

    @Override
    public boolean hasPermission(String name)
    {
        return true;
    }

    @Override
    public boolean hasPermission(Permission perm)
    {
        return true;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value)
    {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin)
    {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks)
    {
        return null;
    }

    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks)
    {
        return null;
    }

    @Override
    public void removeAttachment(PermissionAttachment attachment)
    {
    }

    @Override
    public void recalculatePermissions()
    {
    }

    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions()
    {
        return null;
    }

    @Override
    public boolean isOp()
    {
        return true;
    }

    @Override
    public void setOp(boolean value)
    {
    }
}
