
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.espadaamatista.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.espadaamatista.item.PureAmethystItem;
import net.mcreator.espadaamatista.item.AmethystIngotItem;
import net.mcreator.espadaamatista.item.AmethystHoeItem;
import net.mcreator.espadaamatista.item.AmethysSwordItem;
import net.mcreator.espadaamatista.item.AmethysShovelItem;
import net.mcreator.espadaamatista.item.AmethysPicaxeItem;
import net.mcreator.espadaamatista.item.AmethysAxeItem;
import net.mcreator.espadaamatista.EspadaAmatistaMod;

public class EspadaAmatistaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EspadaAmatistaMod.MODID);
	public static final RegistryObject<Item> AMETHYST_INGOT = REGISTRY.register("amethyst_ingot", () -> new AmethystIngotItem());
	public static final RegistryObject<Item> PURE_AMETHYST = REGISTRY.register("pure_amethyst", () -> new PureAmethystItem());
	public static final RegistryObject<Item> AMETHYS_SWORD = REGISTRY.register("amethys_sword", () -> new AmethysSwordItem());
	public static final RegistryObject<Item> AMETHYS_PICAXE = REGISTRY.register("amethys_picaxe", () -> new AmethysPicaxeItem());
	public static final RegistryObject<Item> AMETHYS_AXE = REGISTRY.register("amethys_axe", () -> new AmethysAxeItem());
	public static final RegistryObject<Item> AMETHYS_SHOVEL = REGISTRY.register("amethys_shovel", () -> new AmethysShovelItem());
	public static final RegistryObject<Item> AMETHYST_HOE = REGISTRY.register("amethyst_hoe", () -> new AmethystHoeItem());
	public static final RegistryObject<Item> AMETHYST_CUTTER = block(EspadaAmatistaModBlocks.AMETHYST_CUTTER, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
