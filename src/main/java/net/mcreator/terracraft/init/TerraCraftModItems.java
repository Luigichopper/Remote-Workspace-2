
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terracraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.terracraft.item.ZenithItem;
import net.mcreator.terracraft.item.UseableCrystalHeartItem;
import net.mcreator.terracraft.item.TinShortswordItem;
import net.mcreator.terracraft.item.TinPickaxeItem;
import net.mcreator.terracraft.item.TinIngotItem;
import net.mcreator.terracraft.item.RawTinItem;
import net.mcreator.terracraft.item.MewomereProjectileItem;
import net.mcreator.terracraft.item.MeowmereItem;
import net.mcreator.terracraft.item.LeadShortswordItem;
import net.mcreator.terracraft.item.LeadPickaxeItem;
import net.mcreator.terracraft.item.LeadIngotItem;
import net.mcreator.terracraft.item.GreenCapItem;
import net.mcreator.terracraft.item.CopperShortswordItem;
import net.mcreator.terracraft.item.CopperPickaxeItem;
import net.mcreator.terracraft.item.CopperAxeItem;
import net.mcreator.terracraft.item.CactusSwordItem;
import net.mcreator.terracraft.item.AdvancementTimberItem;
import net.mcreator.terracraft.item.AdvancementOreItem;
import net.mcreator.terracraft.TerraCraftMod;

public class TerraCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TerraCraftMod.MODID);
	public static final RegistryObject<Item> CACTUS_SWORD = REGISTRY.register("cactus_sword", () -> new CactusSwordItem());
	public static final RegistryObject<Item> ZENITH = REGISTRY.register("zenith", () -> new ZenithItem());
	public static final RegistryObject<Item> MEWOMERE_PROJECTILE = REGISTRY.register("mewomere_projectile", () -> new MewomereProjectileItem());
	public static final RegistryObject<Item> MEOWMERE = REGISTRY.register("meowmere", () -> new MeowmereItem());
	public static final RegistryObject<Item> GUIDE = REGISTRY.register("guide_spawn_egg",
			() -> new ForgeSpawnEggItem(TerraCraftModEntities.GUIDE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> GREEN_CAP_HELMET = REGISTRY.register("green_cap_helmet", () -> new GreenCapItem.Helmet());
	public static final RegistryObject<Item> COPPER_SHORTSWORD = REGISTRY.register("copper_shortsword", () -> new CopperShortswordItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> ADVANCEMENT_TIMBER = REGISTRY.register("advancement_timber", () -> new AdvancementTimberItem());
	public static final RegistryObject<Item> TIN_SHORTSWORD = REGISTRY.register("tin_shortsword", () -> new TinShortswordItem());
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_PICKAXE = REGISTRY.register("tin_pickaxe", () -> new TinPickaxeItem());
	public static final RegistryObject<Item> TIN_ORE = block(TerraCraftModBlocks.TIN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> ADVANCEMENT_ORE = REGISTRY.register("advancement_ore", () -> new AdvancementOreItem());
	public static final RegistryObject<Item> LEAD_SHORTSWORD = REGISTRY.register("lead_shortsword", () -> new LeadShortswordItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> LEAD_PICKAXE = REGISTRY.register("lead_pickaxe", () -> new LeadPickaxeItem());
	public static final RegistryObject<Item> CRYSTAL_HEART = block(TerraCraftModBlocks.CRYSTAL_HEART, null);
	public static final RegistryObject<Item> USEABLE_CRYSTAL_HEART = REGISTRY.register("useable_crystal_heart", () -> new UseableCrystalHeartItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
