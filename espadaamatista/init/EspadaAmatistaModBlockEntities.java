
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.espadaamatista.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.espadaamatista.block.entity.AmethystCutterBlockEntity;
import net.mcreator.espadaamatista.EspadaAmatistaMod;

public class EspadaAmatistaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			EspadaAmatistaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> AMETHYST_CUTTER = register("amethyst_cutter", EspadaAmatistaModBlocks.AMETHYST_CUTTER,
			AmethystCutterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
