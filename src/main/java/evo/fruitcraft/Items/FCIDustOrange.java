package evo.fruitcraft.Items;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.item.Item;

public class FCIDustOrange{
	public FCIDustOrange(){}
	public static Item FCIDustOrange;
	@EventHandler
	public void perInit(FMLPreInitializationEvent event) {
		FCIDustOrange = new Item()
				.setCreativeTab(FruitCraftCore.FCTTabFruitCraft)
				.setUnlocalizedName("FCIDustOrange")
				.setTextureName("fruitcraft:dust_orange");
		GameRegistry.registerItem(FCIDustOrange, "FCIDustOrange");

	}

}