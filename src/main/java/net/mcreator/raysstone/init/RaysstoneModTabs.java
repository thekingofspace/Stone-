
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RaysstoneModTabs {
	public static CreativeModeTab TAB_ORES;

	public static void load() {
		TAB_ORES = new CreativeModeTab("tabores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RaysstoneModItems.COPPER_SULFATE_CHUNK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
