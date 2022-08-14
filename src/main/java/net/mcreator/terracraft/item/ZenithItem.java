
package net.mcreator.terracraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.terracraft.init.TerraCraftModTabs;

public class ZenithItem extends SwordItem {
	public ZenithItem() {
		super(new Tier() {
			public int getUses() {
				return 4062;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 43f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -1.1999999999999997f, new Item.Properties().tab(TerraCraftModTabs.TAB_TERRARIA_COMBAT));
	}
}
