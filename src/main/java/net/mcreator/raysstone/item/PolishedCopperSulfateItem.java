
package net.mcreator.raysstone.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.raysstone.init.RaysstoneModTabs;

public class PolishedCopperSulfateItem extends Item {
	public PolishedCopperSulfateItem() {
		super(new Item.Properties().tab(RaysstoneModTabs.TAB_MINERALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("polished_copper_sulfate");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
