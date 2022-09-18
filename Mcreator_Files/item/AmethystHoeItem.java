
package net.mcreator.espadaamatista.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.espadaamatista.init.EspadaAmatistaModItems;

public class AmethystHoeItem extends HoeItem {
	public AmethystHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1796;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EspadaAmatistaModItems.AMETHYST_INGOT.get()),
						new ItemStack(EspadaAmatistaModItems.AMETHYST_HOE.get()));
			}
		}, 0, 0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
