package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.item.EntityXPOrb;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;

public class CraftExperienceOrb extends CraftEntity implements ExperienceOrb {
    public CraftExperienceOrb(CraftServer server, EntityXPOrb entity) {
        super(server, entity);
    }

    public int getExperience() {
        return getHandle().xpValue;
    }

    public void setExperience(int value) {
        getHandle().xpValue = value;
    }

    // Paper start
    public java.util.UUID getTriggerEntityId() {
        return getHandle().triggerEntityId;
    }

    public java.util.UUID getSourceEntityId() {
        return getHandle().sourceEntityId;
    }

    public SpawnReason getSpawnReason() {
        return getHandle().spawnReason;
    }
    // Paper end

    @Override
    public EntityXPOrb getHandle() {
        return (EntityXPOrb) entity;
    }

    @Override
    public String toString() {
        return "CraftExperienceOrb";
    }

    public EntityType getType() {
        return EntityType.EXPERIENCE_ORB;
    }
}
