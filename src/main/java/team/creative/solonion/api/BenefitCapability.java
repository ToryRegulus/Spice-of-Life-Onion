package team.creative.solonion.api;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import team.creative.solonion.common.benefit.BenefitStack;

public interface BenefitCapability extends ICapabilitySerializable<CompoundTag> {
    
    public void updateStack(Player player, BenefitStack benefits);
    
}
