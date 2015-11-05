package evo.fruitcraft.blocks;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import evo.fruitcraft.FruitCraftCore;
import evo.fruitcraft.Items.FCIDustOrange;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.oredict.OreDictionary;

public class FCBOreOrange extends Block implements IWorldGenerator {

	@EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new FCBOreOrange(), 0);
	}


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider instanceof WorldProviderSurface) {
			generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int x, int z) {
		for(int i = 0; i < 10; i++) {
			int genX = x + random.nextInt(16);
			int genY = 1 + random.nextInt(15);
			int genZ = z + random.nextInt(16);
			new WorldGenMinable(FCBOreOrange, 0, 20, Blocks.stone).generate(world, random, genX, genY, genZ);
		}
	}
	@SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public static Block FCBOreOrange;

    @EventHandler
    public void preInite(FMLPreInitializationEvent event)

    {FCBOreOrange = new FCBOreOrange();
    GameRegistry.registerBlock(FCBOreOrange, "FCBOreOrange");
   OreDictionary.registerOre("oreOrange", FCBOreOrange);;}

    public FCBOreOrange(){
    	super(Material.rock);
    	setCreativeTab(FruitCraftCore.FCTTabFruitCraft);
    	setBlockName("FCBOreOrange");
    	setBlockTextureName("fruitcraft:oreOrange");
    	setHardness(1.5F);
        setResistance(1.0F);
        setStepSound(Block.soundTypeStone);
        setLightOpacity(0);
        setLightLevel(0F);
    }
    @Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return FCIDustOrange.FCIDustOrange;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, random, fortune)) {
			int i = random.nextInt(fortune + 2) - 1;
			if (i < 0) {
				i = 0;
			}
			return this.quantityDropped(random) * (i + 1);
		} else {
			return this.quantityDropped(random);
		}
	}

	@Override
	public int getExpDrop(IBlockAccess iBlockAccess, int meta, int fortune) {
		return MathHelper.getRandomIntegerInRange( null, 4, 9);
	}

}
