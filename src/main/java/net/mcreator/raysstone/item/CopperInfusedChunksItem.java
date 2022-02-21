
package net.mcreator.raysstone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CopperInfusedChunksItem extends Item {
	public CopperInfusedChunksItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("copper_infused_chunks");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
