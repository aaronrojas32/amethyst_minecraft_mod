
package net.mcreator.espadaamatista.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.espadaamatista.init.EspadaAmatistaModItems;

public class AmethysAxeItem extends AxeItem {
	public AmethysAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1796;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EspadaAmatistaModItems.AMETHYS_AXE.get()),
						new ItemStack(EspadaAmatistaModItems.AMETHYST_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
