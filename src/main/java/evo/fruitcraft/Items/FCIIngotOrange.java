package evo.fruitcraft.Items;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.FruitCraftCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FCIIngotOrange{
  public static Item FCIIngotOrange;


  @EventHandler
	public void perInit(FMLPreInitializationEvent event) {
	  FCIIngotOrange = new Item()
			  .setCreativeTab(FruitCraftCore.FCTTabFruitCraft)
			  .setTextureName("fruitcraft:ingot_orange")
			  .setUnlocalizedName("FCIIngotOrange");
	  GameRegistry.registerItem(FCIIngotOrange, "FCIIngotOrange");
	  //OreDictionary
	  OreDictionary.registerOre("ingotOrange", new ItemStack(FCIIngotOrange, 1, 0));
	  //MaterialRegistry

  }
}