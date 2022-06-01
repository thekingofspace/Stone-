
package net.mcreator.raysstone.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.raysstone.init.RaysstoneModTabs;

public class CopperInfusedIronItem extends Item {
	public CopperInfusedIronItem() {
		super(new Item.Properties().tab(RaysstoneModTabs.TAB_MINERALS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
