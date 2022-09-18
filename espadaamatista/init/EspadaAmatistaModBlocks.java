
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.espadaamatista.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.espadaamatista.block.AmethystCutterBlock;
import net.mcreator.espadaamatista.EspadaAmatistaMod;

public class EspadaAmatistaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EspadaAmatistaMod.MODID);
	public static final RegistryObject<Block> AMETHYST_CUTTER = REGISTRY.register("amethyst_cutter", () -> new AmethystCutterBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AmethystCutterBlock.registerRenderLayer();
		}
	}
}
