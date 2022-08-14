
package net.mcreator.terracraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.terracraft.init.TerraCraftModTabs;

public class CopperAxeItem extends AxeItem {
	public CopperAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 60;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(TerraCraftModTabs.TAB_TERRARIA_TOOLS));
	}
}
