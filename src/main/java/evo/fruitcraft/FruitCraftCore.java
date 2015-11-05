package evo.fruitcraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import evo.fruitcraft.Items.FCIDustOrange;
import evo.fruitcraft.Items.FCIIngotOrange;
import evo.fruitcraft.Tools.FCTOrangeIngotSword;
import evo.fruitcraft.blocks.FCBOreOrange;
import evo.fruitcraft.foods.FCFCuttedOrange;
import evo.fruitcraft.foods.FCFOrangeWhole;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid="evo_Fruitcraft", name="FruitCraft", version="B17.1.0a")
public class FruitCraftCore
{
  public static final CreativeTabs FCTTabFruitCraft = new FCTTabFruitCraft("FruitCraft");

  private void chest(ItemStack item, int min, int max, int rare)
  {
    ChestGenHooks.addItem("mineshaftCorridor", new WeightedRandomChestContent(item, min, max, rare));
    ChestGenHooks.addItem("pyramidDesertyChest", new WeightedRandomChestContent(item, min, max, rare));
    ChestGenHooks.addItem("pyramidJungleChest", new WeightedRandomChestContent(item, min, max, rare));
    ChestGenHooks.addItem("villageBlacksmith", new WeightedRandomChestContent(item, min, max, rare));
    ChestGenHooks.addItem("dungeonChest", new WeightedRandomChestContent(item, min, max, rare));

  }


  public static ToolMaterial ORANGEINGOT;

  @Instance("evo.FruitCraft")
  public static FruitCraftCore instance;
  //Foods
  FCFOrangeWhole FCF_OrangeWhole = new evo.fruitcraft.foods.FCFOrangeWhole();
  FCFCuttedOrange FCF_CuttedOrange = new evo.fruitcraft.foods.FCFCuttedOrange();
  //Blocks
  FCBOreOrange FCB_OreOrange = new evo.fruitcraft.blocks.FCBOreOrange();
  //Items
  FCIDustOrange FCI_DustOrange =new evo.fruitcraft.Items.FCIDustOrange();
  FCIIngotOrange FCI_IngotOrange = new evo.fruitcraft.Items.FCIIngotOrange();
  //Tools
  FCTOrangeIngotSword FCT_OrangeIngotSword = new evo.fruitcraft.Tools.FCTOrangeIngotSword();


  @Mod.EventHandler
  public void PreInit(FMLPreInitializationEvent event)
  {
	  ORANGEINGOT = EnumHelper.addToolMaterial("ORANGEINGOT", 3, 900, 7.5F, 2.5F, 15)
			  .setRepairItem(new ItemStack(FCIIngotOrange.FCIIngotOrange));
  }


@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {}

@Mod.EventHandler
public void Init(FMLInitializationEvent event){}




}