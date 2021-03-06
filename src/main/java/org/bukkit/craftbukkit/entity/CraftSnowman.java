package org.bukkit.craftbukkit.entity;

import com.destroystokyo.paper.entity.CraftRangedEntity;
import net.minecraft.entity.monster.EntitySnowman;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowman;

public class CraftSnowman extends CraftGolem implements Snowman, CraftRangedEntity<EntitySnowman> { // Paper
    public CraftSnowman(CraftServer server, EntitySnowman entity) {
        super(server, entity);
    }

    @Override
    public boolean isDerp() {
        return !getHandle().isPumpkinEquipped();
    }

    @Override
    public void setDerp(boolean derpMode) {
        getHandle().setPumpkinEquipped(!derpMode);
    }

    @Override
    public EntitySnowman getHandle() {
        return (EntitySnowman) entity;
    }

    @Override
    public String toString() {
        return "CraftSnowman";
    }

    public EntityType getType() {
        return EntityType.SNOWMAN;
    }
}
