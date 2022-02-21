
package net.mcreator.raysstone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.raysstone.init.RaysstoneModTabs;

public class CopperSulfateChunkItem extends Item {
	public CopperSulfateChunkItem() {
		super(new Item.Properties().tab(RaysstoneModTabs.TAB_MINERALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("copper_sulfate_chunk");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
