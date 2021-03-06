package org.bukkit.craftbukkit.entity;

import com.destroystokyo.paper.entity.CraftSentientNPC;
import net.minecraft.entity.EntityCreature;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Creature;

public class CraftCreature extends CraftLivingEntity implements Creature, CraftSentientNPC { // Paper
    public CraftCreature(CraftServer server, EntityCreature entity) {
        super(server, entity);
    }

    @Override
    public EntityCreature getHandle() {
        return (EntityCreature) entity;
    }

    @Override
    public String toString() {
        return "CraftCreature{name=" + this.entityName + "}";
    }
}
