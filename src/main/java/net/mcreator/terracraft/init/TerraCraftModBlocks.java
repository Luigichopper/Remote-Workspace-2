
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terracraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.terracraft.block.TinOreBlock;
import net.mcreator.terracraft.block.CrystalHeartBlock;
import net.mcreator.terracraft.TerraCraftMod;

public class TerraCraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TerraCraftMod.MODID);
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> CRYSTAL_HEART = REGISTRY.register("crystal_heart", () -> new CrystalHeartBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CrystalHeartBlock.registerRenderLayer();
		}
	}
}
