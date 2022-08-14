
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terracraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TerraCraftModTabs {
	public static CreativeModeTab TAB_TERRARIA_COMBAT;
	public static CreativeModeTab TAB_TERRARIA_VANITY;
	public static CreativeModeTab TAB_TERRARIA_TOOLS;

	public static void load() {
		TAB_TERRARIA_COMBAT = new CreativeModeTab("tabterraria_combat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TerraCraftModItems.COPPER_SHORTSWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TERRARIA_VANITY = new CreativeModeTab("tabterraria_vanity") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TerraCraftModItems.GREEN_CAP_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TERRARIA_TOOLS = new CreativeModeTab("tabterraria_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TerraCraftModItems.COPPER_PICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
