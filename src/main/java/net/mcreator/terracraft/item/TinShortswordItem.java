
package net.mcreator.terracraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.terracraft.init.TerraCraftModTabs;
import net.mcreator.terracraft.init.TerraCraftModItems;

public class TinShortswordItem extends SwordItem {
	public TinShortswordItem() {
		super(new Tier() {
			public int getUses() {
				return 91;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TerraCraftModItems.TIN_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(TerraCraftModTabs.TAB_TERRARIA_COMBAT));
	}
}
