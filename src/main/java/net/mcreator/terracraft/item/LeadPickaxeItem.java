
package net.mcreator.terracraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.terracraft.init.TerraCraftModTabs;
import net.mcreator.terracraft.init.TerraCraftModItems;

public class LeadPickaxeItem extends PickaxeItem {
	public LeadPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 92;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TerraCraftModItems.LEAD_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(TerraCraftModTabs.TAB_TERRARIA_TOOLS));
	}
}
