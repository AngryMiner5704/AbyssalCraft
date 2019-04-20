#### Intro:

OK, so you know how you said use 1.9.1.3-FINAL? Well, that doesn't work either. Please, fix this I LOVE this mod!

#### Description:
I tried to use it in my own modpack that I made, but It crashes all by itself with out anything else.

#### Crash report:

[pastebin/gist/etc link here if the bug results in a crash, leave line empty otherwise]
---- Minecraft Crash Report ----
// Oh - I know what I did wrong!

Time: 4/20/19 2:32 PM
Description: Initializing game

java.lang.ArrayIndexOutOfBoundsException: -3
	at com.shinoow.abyssalcraft.AbyssalCraft.checkBiomeIds(AbyssalCraft.java:2091)
	at com.shinoow.abyssalcraft.AbyssalCraft.preInit(AbyssalCraft.java:476)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at cpw.mods.fml.common.FMLModContainer.handleModStateEvent(FMLModContainer.java:532)
	at sun.reflect.GeneratedMethodAccessor3.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at com.google.common.eventbus.EventSubscriber.handleEvent(EventSubscriber.java:74)
	at com.google.common.eventbus.SynchronizedEventSubscriber.handleEvent(SynchronizedEventSubscriber.java:47)
	at com.google.common.eventbus.EventBus.dispatch(EventBus.java:322)
	at com.google.common.eventbus.EventBus.dispatchQueuedEvents(EventBus.java:304)
	at com.google.common.eventbus.EventBus.post(EventBus.java:275)
	at cpw.mods.fml.common.LoadController.sendEventToModContainer(LoadController.java:212)
	at cpw.mods.fml.common.LoadController.propogateStateMessage(LoadController.java:190)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at com.google.common.eventbus.EventSubscriber.handleEvent(EventSubscriber.java:74)
	at com.google.common.eventbus.SynchronizedEventSubscriber.handleEvent(SynchronizedEventSubscriber.java:47)
	at com.google.common.eventbus.EventBus.dispatch(EventBus.java:322)
	at com.google.common.eventbus.EventBus.dispatchQueuedEvents(EventBus.java:304)
	at com.google.common.eventbus.EventBus.post(EventBus.java:275)
	at cpw.mods.fml.common.LoadController.distributeStateMessage(LoadController.java:119)
	at cpw.mods.fml.common.Loader.preinitializeMods(Loader.java:556)
	at cpw.mods.fml.client.FMLClientHandler.beginMinecraftLoading(FMLClientHandler.java:243)
	at net.minecraft.client.Minecraft.func_71384_a(Minecraft.java:480)
	at net.minecraft.client.Minecraft.func_99999_d(Minecraft.java:878)
	at net.minecraft.client.main.Main.main(SourceFile:148)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at net.minecraft.launchwrapper.Launch.launch(Launch.java:135)
	at net.minecraft.launchwrapper.Launch.main(Launch.java:28)


A detailed walkthrough of the error, its code path and all known details is as follows:
---------------------------------------------------------------------------------------

-- Head --
Stacktrace:
	at com.shinoow.abyssalcraft.AbyssalCraft.checkBiomeIds(AbyssalCraft.java:2091)
	at com.shinoow.abyssalcraft.AbyssalCraft.preInit(AbyssalCraft.java:476)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at cpw.mods.fml.common.FMLModContainer.handleModStateEvent(FMLModContainer.java:532)
	at sun.reflect.GeneratedMethodAccessor3.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at com.google.common.eventbus.EventSubscriber.handleEvent(EventSubscriber.java:74)
	at com.google.common.eventbus.SynchronizedEventSubscriber.handleEvent(SynchronizedEventSubscriber.java:47)
	at com.google.common.eventbus.EventBus.dispatch(EventBus.java:322)
	at com.google.common.eventbus.EventBus.dispatchQueuedEvents(EventBus.java:304)
	at com.google.common.eventbus.EventBus.post(EventBus.java:275)
	at cpw.mods.fml.common.LoadController.sendEventToModContainer(LoadController.java:212)
	at cpw.mods.fml.common.LoadController.propogateStateMessage(LoadController.java:190)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at com.google.common.eventbus.EventSubscriber.handleEvent(EventSubscriber.java:74)
	at com.google.common.eventbus.SynchronizedEventSubscriber.handleEvent(SynchronizedEventSubscriber.java:47)
	at com.google.common.eventbus.EventBus.dispatch(EventBus.java:322)
	at com.google.common.eventbus.EventBus.dispatchQueuedEvents(EventBus.java:304)
	at com.google.common.eventbus.EventBus.post(EventBus.java:275)
	at cpw.mods.fml.common.LoadController.distributeStateMessage(LoadController.java:119)
	at cpw.mods.fml.common.Loader.preinitializeMods(Loader.java:556)
	at cpw.mods.fml.client.FMLClientHandler.beginMinecraftLoading(FMLClientHandler.java:243)
	at net.minecraft.client.Minecraft.func_71384_a(Minecraft.java:480)

-- Initialization --
Details:
Stacktrace:
	at net.minecraft.client.Minecraft.func_99999_d(Minecraft.java:878)
	at net.minecraft.client.main.Main.main(SourceFile:148)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at net.minecraft.launchwrapper.Launch.launch(Launch.java:135)
	at net.minecraft.launchwrapper.Launch.main(Launch.java:28)

-- System Details --
Details:
	Minecraft Version: 1.7.10
	Operating System: Windows 10 (amd64) version 10.0
	Java Version: 1.8.0_171, Oracle Corporation
	Java VM Version: Java HotSpot(TM) 64-Bit Server VM (mixed mode), Oracle Corporation
	Memory: 1537072664 bytes (1465 MB) / 3667734528 bytes (3497 MB) up to 6120341504 bytes (5836 MB)
	Mod Pack: ~~ERROR~~ NullPointerException: null
	LiteLoader Mods: ~~ERROR~~ NullPointerException: null
	LaunchWrapper: 48 active transformer(s)
          - Transformer: cpw.mods.fml.common.asm.transformers.PatchingTransformer
          - Transformer: squeek.applecore.asm.TransformerModuleHandler
          - Transformer: cpw.mods.fml.common.asm.transformers.MarkerTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.SideTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.EventSubscriptionTransformer
          - Transformer: net.minecraftforge.classloading.FluidIdTransformer
          - Transformer: mods.battlegear2.coremod.transformers.EntityPlayerTransformer
          - Transformer: mods.battlegear2.coremod.transformers.ModelBipedTransformer
          - Transformer: mods.battlegear2.coremod.transformers.NetClientHandlerTransformer
          - Transformer: mods.battlegear2.coremod.transformers.NetServerHandlerTransformer
          - Transformer: mods.battlegear2.coremod.transformers.PlayerControllerMPTransformer
          - Transformer: mods.battlegear2.coremod.transformers.ItemRendererTransformer
          - Transformer: mods.battlegear2.coremod.transformers.MinecraftTransformer
          - Transformer: mods.battlegear2.coremod.transformers.ItemInWorldTransformer
          - Transformer: mods.battlegear2.coremod.transformers.EntityAIControlledByPlayerTransformer
          - Transformer: mods.battlegear2.coremod.transformers.EntityOtherPlayerMPTransformer
          - Transformer: am2.preloader.BytecodeTransformers
          - Transformer: appeng.transformer.asm.ASMIntegration
          - Transformer: codechicken.lib.asm.ClassHeirachyManager
          - Transformer: codechicken.core.asm.InterfaceDependancyTransformer
          - Transformer: codechicken.core.asm.TweakTransformer
          - Transformer: codechicken.core.asm.DelegatedTransformer
          - Transformer: codechicken.core.asm.DefaultImplementationTransformer
          - Transformer: micdoodle8.mods.miccore.MicdoodleTransformer
          - Transformer: stevekung.mods.moreplanets.plugin.asm.MorePlanetsTransformer
          - Transformer: codechicken.nei.asm.NEITransformer
          - Transformer: com.mumfrey.liteloader.transformers.event.EventProxyTransformer
          - Transformer: com.mumfrey.liteloader.launch.LiteLoaderTransformer
          - Transformer: com.mumfrey.liteloader.client.transformers.CrashReportTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.DeobfuscationTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.AccessTransformer
          - Transformer: net.minecraftforge.transformers.ForgeAccessTransformer
          - Transformer: mods.battlegear2.coremod.transformers.BattlegearAccessTransformer
          - Transformer: appeng.transformer.asm.ASMTweaker
          - Transformer: codechicken.core.asm.CodeChickenAccessTransformer
          - Transformer: cofh.asm.CoFHAccessTransformer
          - Transformer: micdoodle8.mods.miccore.MicdoodleAccessTransformer
          - Transformer: stevekung.mods.moreplanets.plugin.asm.MorePlanetsAccessTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.ModAccessTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.ItemStackTransformer
          - Transformer: cofh.asm.CoFHClassTransformer
          - Transformer: assets.rivalrebels.ASMTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.TerminalTransformer
          - Transformer: com.mumfrey.liteloader.client.transformers.LiteLoaderEventInjectionTransformer
          - Transformer: com.mumfrey.liteloader.client.transformers.MinecraftOverlayTransformer
          - Transformer: com.mumfrey.liteloader.common.transformers.LiteLoaderPacketTransformer
          - Transformer: com.thevoxelbox.voxelmap.litemod.VoxelMapTransformer
          - Transformer: cpw.mods.fml.common.asm.transformers.ModAPITransformer
	JVM Flags: 6 total; -Xmx6G -XX:+UseConcMarkSweepGC -XX:+CMSIncrementalMode -XX:-UseAdaptiveSizePolicy -Xmn3G -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump
	AABB Pool Size: 0 (0 bytes; 0 MB) allocated, 0 (0 bytes; 0 MB) used
	IntCache: cache: 0, tcache: 0, allocated: 0, tallocated: 0
	FML: MCP v9.05 FML v7.10.99.99 Minecraft Forge 10.13.4.1614 139 mods loaded, 139 mods active
	States: 'U' = Unloaded 'L' = Loaded 'C' = Constructed 'H' = Pre-initialized 'I' = Initialized 'J' = Post-initialized 'A' = Available 'D' = Disabled 'E' = Errored
	UCH	mcp{9.05} [Minecraft Coder Pack] (minecraft.jar) 
	UCH	FML{7.10.99.99} [Forge Mod Loader] (forge-1.7.10-10.13.4.1614-1.7.10.jar) 
	UCH	Forge{10.13.4.1614} [Minecraft Forge] (forge-1.7.10-10.13.4.1614-1.7.10.jar) 
	UCH	AM2-Preloader{0.0.2} [AMCore] (minecraft.jar) 
	UCH	appliedenergistics2-core{rv2-stable-1} [AppliedEnergistics2 Core] (minecraft.jar) 
	UCH	CodeChickenCore{1.0.4.29} [CodeChicken Core] (minecraft.jar) 
	UCH	Micdoodlecore{} [Micdoodle8 Core] (minecraft.jar) 
	UCH	MorePlanetsASM{} [More Planets Core] (minecraft.jar) 
	UCH	NotEnoughItems{1.0.3.74} [Not Enough Items] (NotEnoughItems-1.7.10-1.0.3.74-universal.jar) 
	UCH	<CoFH ASM>{000} [CoFH ASM] (minecraft.jar) 
	UCH	FamiliarsAPI{1.7.10} [Familiars API] (FamiliarsAPI-1.7.10.jar) 
	UCH	CoFHCore{1.7.10R3.0.2} [CoFH Core] (CoFHCore-[1.7.10]3.0.2-268.jar) 
	UCH	FusionWarfare{1.7.10-1.3.1} [Fusion Warfare] ((NEWEST) FusionWarfare-1.7.10-1.3.1.jar) 
	UCH	battlegear2{1.0.6.3} [Mine & Blade Battlegear 2 - Bullseye] (1.7.10-MB_Battlegear2-Bullseye-1.0.6.3.jar) 
	UCH	AnimationAPI{1.2.0} [AnimationAPI] (AnimationAPI-1.7.2.jar) 
	UCH	arsmagica2{1.4.0.008} [Ars Magica 2] (1.7.10_AM2-1.4.0.008.jar) 
	UCH	lucky{5.0.0} [Lucky Block] ([1-7-2]_Lucky_Block_v5-0-0.jar) 
	UCH	FLabsBF{4.1.2} [Better Furnaces] ([1.7.10]Better_Furnaces_V4.1.2.jar) 
	UCH	weaponsplus{v1.1 Pre-Release} [Weapons+ Mod] ([1.7.2] WeaponsPlus v1.5.1.jar) 
	UCE	abyssalcraft{1.9.1.3} [AbyssalCraft] (AbyssalCraft-1.7.10-1.9.1.3-FINAL.jar) 
	UCH	Baubles{1.0.1.10} [Baubles] (Baubles-1.7.10-1.0.1.10.jar) 
	UCH	adventurebackpack{1.7.10-0.8b} [Adventure Backpack] (adventurebackpack-1.7.10-0.8c.jar) 
	UCH	AppleCore{1.1.0} [AppleCore] (AppleCore-mc1.7.10-1.1.0.jar) 
	UCH	appliedenergistics2{rv2-stable-1} [Applied Energistics 2] (appliedenergistics2-rv2-stable-1.jar) 
	UCH	ArchimedesShips{1.7.10 v1.7.1} [Archimedes' Ships] (ArchimedesShips-1.7.1.jar) 
	UCH	atum{0.6} [Atum] (Atum-1.7.10-0.6.30.jar) 
	UCH	Thaumcraft{4.2.3.5} [Thaumcraft] (Thaumcraft-1.7.10-4.2.3.5.jar) 
	UCH	betterstorage{0.10.3.115} [BetterStorage] (BetterStorage-1.7.10-0.10.3.115.jar) 
	UCH	CarpentersBlocks{3.3.7} [Carpenter's Blocks] (Carpenter's Blocks v3.3.7 - MC 1.7.10.jar) 
	UCH	kegare.caveworld{1.6.0} [Caveworld] (Caveworld_1.7.10-v1.6.0.jar) 
	UCH	TwilightForest{2.3.3} [The Twilight Forest] (twilightforest-1.7.10-2.3.3.jar) 
	UCH	ForgeMultipart{1.1.2.331} [Forge Multipart] (ForgeMultipart-1.7.10-1.1.2.331-universal.jar) 
	UCH	chisel{2.9.5.11} [Chisel] (Chisel-2.9.5.11.jar) 
	UCH	chocolateQuest{1.0} [Chocolate Quest] (chocolateQuest-1.7.10-1.1d.jar) 
	UCH	ComputerCraft{1.75} [ComputerCraft] (ComputerCraft1.75.jar) 
	UCH	customnpcs{1.7.10c} [CustomNpcs] (CustomNPCs_1.7.10c.jar) 
	UCH	DamageIndicatorsMod{3.2.0} [Damage Indicators] (Damage-Indicators-Mod-1.7.10.jar) 
	UCH	MetallurgyCore{4.0.4} [Metallurgy Core] (MetallurgyCore-1.7.10-4.0.4.18.jar) 
	UCH	GalacticraftCore{3.0.12} [Galacticraft Core] (GalacticraftCore-1.7-3.0.12.423.jar) 
	UCH	Mekanism{9.1.0} [Mekanism] (Mekanism-1.7.10-9.1.0.281.jar) 
	UCH	DefenseTech{1.0.1} [DefenseTech] (DefenseTech-1.7.10-1.0.1.46.jar) 
	UCH	MoCreatures{6.3.1} [DrZhark's Mo'Creatures Mod] (DrZharks MoCreatures Mod v6.3.1.zip) 
	UCH	dungeonpack{1.7.10-1.0} [Dungeon Pack] (dungeonpack-1.7.10-1.0.jar) 
	UCH	eplus{1.7.10-3.0.1} [Enchanting Plus] (EnchantingPlus-1.7.10-3.0.1.jar) 
	UCH	MineFactoryReloaded{1.7.10R2.8.0} [MineFactory Reloaded] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	EnderIO{1.7.10-2.2.8.381} [Ender IO] (EnderIO-1.7.10-2.2.8.381.jar) 
	UCH	ThermalFoundation{1.7.10R1.0.0} [Thermal Foundation] (ThermalFoundation-[1.7.10]1.0.0-81.jar) 
	UCH	ThermalExpansion{1.7.10R4.0.1} [Thermal Expansion] (ThermalExpansion-[1.7.10]4.0.1-182.jar) 
	UCH	EnderTech{1.7.10-0.3.2.405} [EnderTech] (EnderTech-1.7.10-0.3.2.405.jar) 
	UCH	ExtraUtilities{1.2.5} [Extra Utilities] (extrautilities-1.2.5.jar) 
	UCH	Mantle{1.7.10-0.3.2.jenkins191} [Mantle] (Mantle-1.7.10-0.3.2b.jar) 
	UCH	TConstruct{1.7.10-1.8.8.build988} [Tinkers' Construct] (TConstruct-1.7.10-1.8.8.jar) 
	UCH	Metallurgy{4.0.5} [Metallurgy 4] (Metallurgy-1.7.10-4.0.5.75.jar) 
	UCH	ExtraTiC{1.4.5} [ExtraTiC] (ExtraTiC-1.7.10-1.4.5.jar) 
	UCH	carystanley_extremefarming{1.0} [Extreme Farming] (extremefarming_mod-1.7.2-v1.3(1).jar) 
	UCH	extvil{1.7.10-2.0} [Extended_Villages] (extvil-1.7.10-2.0.jar) 
	UCH	DefaultMobPack{1.7.10} [DefaultMobPack] (FamiliarsDefaultMobPack-1.7.10.jar) 
	UCH	ExtendedFamPack{1.7.10} [ExtendedFamPack] (FamiliarsExtendedFamPack-1.7.10.jar) 
	UCH	HerobrineFamPack{1.7.10} [HerobrineFamPack] (FamiliarsHerobrineFamPack-1.7.10.jar) 
	UCH	farlanders{1.2b} [The Farlanders] (farlanders-1.7.10-v1.2b.jar) 
	UCH	flansmod{4.10.0} [Flan's Mod] (Flans-Mod-1.7.10.jar) 
	UCH	FoodPlus{3.0rS} [§bFood Plus] (Food-Plus-Mod-1.7.10.jar) 
	UCH	ForbiddenMagic{1.7.10-0.562} [Forbidden Magic] (Forbidden Magic-1.7.10-0.562.jar) 
	UCH	freddycraftmod{1.2} [FreddyCraft] (FreddyCraft-1.7.10-1.2.jar) 
	UCH	GalacticraftMars{3.0.12} [Galacticraft Planets] (Galacticraft-Planets-1.7-3.0.12.423.jar) 
	UCH	planetguy_Gizmos{3.0} [Gizmos] (Gizmos-3.0.jar) 
	UCH	iChunUtil{4.2.2} [iChunUtil] (iChunUtil-4.2.2.jar) 
	UCH	GraviGun{4.0.0-beta} [GraviGun] (GravityGun-4.0.0-beta.jar) 
	UCH	grim3212core{V0.2 - 1.7.10} [Grim3212 Core] (Grim3212-Core-1.7.10.jar) 
	UCH	GrimoireOfGaia{1.0.0} [Grimoire of Gaia 3] (GrimoireOfGaia3-1.7.10-1.2.7.jar) 
	UCH	GunCus{1.7.10-3.50.0.-} [Gun Customization] (Gun-Customization-Mod-1.7.10.jar) 
	UCH	modtut{4.0} [Guns 'N' Stuff Mod] (GunsNStuff-5.0.jar) 
	UCH	Hats{4.0.1} [Hats] (Hats-4.0.1(1).jar) 
	UCH	headcrumbs{1.2.6} [Headcrumbs] (Headcrumbs-1.2.6.jar) 
	UCH	ani_koto{v1.6} [Kingdoms of the Overworld Mod] (Kingdoms of the Overworld-1.7.10-1.6.jar) 
	UCH	LBMED{1.0.0} [LBMED] (LBMED.zip) 
	UCH	lootbags{2.0.17} [Loot Bags] (LootBags-1.7.10-2.0.17.jar) 
	UCH	lycanitesmobs{1.10.11.1 - MC 1.7.10} [Lycanites Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	arcticmobs{1.10.11.1 - MC 1.7.10} [Lycanites Arctic Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	demonmobs{1.10.11.1 - MC 1.7.10} [Lycanites Demon Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	desertmobs{1.10.11.1 - MC 1.7.10} [Lycanites Desert Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	forestmobs{1.10.11.1 - MC 1.7.10} [Lycanites Forest Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	freshwatermobs{1.10.11.1 - MC 1.7.10} [Lycanites Freshwater Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	infernomobs{1.10.11.1 - MC 1.7.10} [Lycanites Inferno Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	junglemobs{1.10.11.1 - MC 1.7.10} [Lycanites Jungle Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	mountainmobs{1.10.11.1 - MC 1.7.10} [Lycanites Mountain Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	plainsmobs{1.10.11.1 - MC 1.7.10} [Lycanites Plains Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	saltwatermobs{1.10.11.1 - MC 1.7.10} [Lycanites Saltwater Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	shadowmobs{1.10.11.1 - MC 1.7.10} [Lycanites Shadow Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	swampmobs{1.10.11.1 - MC 1.7.10} [Lycanites Swamp Mobs] (LycanitesMobsComplete 1.10.11.1 [1.7.10].jar) 
	UCH	more{4.0} [M-Ore mod] (M-Ore 4.0.jar) 
	UCH	MekanismGenerators{9.1.0} [MekanismGenerators] (MekanismGenerators-1.7.10-9.1.0.281.jar) 
	UCH	MekanismTools{9.1.0} [MekanismTools] (MekanismTools-1.7.10-9.1.0.281.jar) 
	UCH	MineFactoryReloaded|CompatAppliedEnergistics{1.7.10R2.8.0} [MFR Compat: Applied Energistics] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatAtum{1.7.10R2.8.0} [MFR Compat: Atum] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatBackTools{1.7.10R2.8.0} [MFR Compat: BackTools] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatBuildCraft{1.7.10R2.8.0} [MFR Compat: BuildCraft] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatChococraft{1.7.10R2.8.0} [MFR Compat: Chococraft] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatExtraBiomes{1.7.10R2.8.0} [MFR Compat: ExtraBiomes] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatForestry{1.7.10R2.8.0} [MFR Compat: Forestry] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatForgeMicroblock{1.7.10R2.8.0} [MFR Compat: ForgeMicroblock] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatIC2{1.7.10R2.8.0} [MFR Compat: IC2] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatMystcraft{1.7.10R2.8.0} [MFR Compat: Mystcraft] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatProjRed{1.7.10R2.8.0} [MFR Compat ProjectRed] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatRailcraft{1.7.10R2.8.0} [MFR Compat: Railcraft] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatSufficientBiomes{1.7.10R2.8.0} [MFR Compat: Sufficient Biomes] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatThaumcraft{1.7.10R2.8.0} [MFR Compat: Thaumcraft] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatThermalExpansion{1.7.10R2.8.0} [MFR Compat: Thermal Expansion] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatTConstruct{1.7.10R2.8.0} [MFR Compat: Tinkers' Construct] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatTwilightForest{1.7.10R2.8.0} [MFR Compat: TwilightForest] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MineFactoryReloaded|CompatVanilla{1.7.10R2.8.0} [MFR Compat: Vanilla] (MineFactoryReloaded-[1.7.10]2.8.0-104.jar) 
	UCH	MoarFood{V5.5.0} [MoarFood] (MoarFood-5.5.0.jar) 
	UCH	MobAmputation{4.0.0} [MobAmputation] (MobAmputation-4.0.0.jar) 
	UCH	MobDismemberment{4.0.0} [MobDismemberment] (MobDismemberment-4.0.0.jar) 
	UCH	mobsgun{1.0} [Mobs Gun] (Mobs-Gun-1.3.jar) 
	UCH	MorePlanet{1.3.0} [More Planets] (More-Planets-1.7.10-1.3.0-Pre-6.jar) 
	UCH	Morph{0.9.1} [Morph] (Morphing-Mod-1.7.10.jar) 
	UCH	MSM3{3.0.0d} [More Swords 3] (MSM-SNAP-3.0.0e-For-MC-1.7.10.jar) 
	UCH	Netherless{0.9.0} [Netherless] (Netherless-0.9.0.jar) 
	UCH	NetherOres{1.7.10R2.3.0RC4} [Nether Ores] (NetherOres-[1.7.10]2.3.0RC4-4.jar) 
	UCH	pokeball{V0.1 - 1.7.10} [Pokeball] (Pokeball-Mod-by-grim3212-1.7.10.jar) 
	UCH	PortalGun{4.0.0-beta-2} [PortalGun] (Portal-Gun-Mod-1.7.10.jar) 
	UCH	quiverchevsky{b57} [QuiverBow] (QuiverBow-Mod-1.7.10.jar) 
	UCH	RainbowWorld{1.0.0} [RainbowWorld] (Rainbow World (1.7.x).jar) 
	UCH	Rediscovered{1.0.1} [Minecraft Rediscovered Mod] (Rediscovered-1.7.10-1.0.1.jar) 
	UCH	rivalrebels{1.7.10V} [Rival Rebels] (rivalrebels-yo-1.7.10V.jar) 
	UCH	secretroomsmod{4.7.1} [The SecretRoomsMod] (secretroomsmod-1.7.10-4.7.1.413.jar) 
	UCH	SpecialMobs{3.0.2} [Special Mobs] (SpecialMobs-1.7.10-3.0.2.jar) 
	UCH	stefinusguns{0.5.2} [New Stefinus Guns] (Stefinus Guns-0.5.2.jar) 
	UCH	telepads{1.6.4 v5} [Teleportation Pads] (Telepads-1.7.2_1.7.jar) 
	UCH	thaumcraftneiplugin{1.7.10-1.7} [Thaumcraft NEI Plugin] (thaumcraftneiplugin-1.7.10-1.7.jar) 
	UCH	thaumicenergistics{0.8.10.10} [Thaumic Energistics] (thaumicenergistics-0.8.10.10.jar) 
	UCH	ThermalDynamics{1.7.10R1.0.0RC7} [Thermal Dynamics] (ThermalDynamics-[1.7.10]1.0.0RC7-98.jar) 
	UCH	TiCTooltips{1.2.4} [TiC Tooltips] (TiCTooltips-mc1.7.10-1.2.4.jar) 
	UCH	Translocator{1.1.1.12} [Translocator] (Translocator-1.7.10-1.1.1.12-universal.jar) 
	UCH	UndergroundBiomes{0.7} [Underground Biomes Constructs] (UndergroundBiomesConstructs-1.7.2-test41.jar) 
	UCH	ubcores{1.7.10-0.1.2.0} [UBC Ore Registrar] (UBCOres-1.7.10-0.1.2.0.jar) 
	UCH	McMultipart{1.1.2.331} [Minecraft Multipart Plugin] (ForgeMultipart-1.7.10-1.1.2.331-universal.jar) 
	UCH	ForgeMicroblock{1.1.2.331} [Forge Microblocks] (ForgeMultipart-1.7.10-1.1.2.331-universal.jar) 
	CoFHCore: -[1.7.10]3.0.2-268
	AE2 Version: stable rv2-stable-1 for Forge 10.13.2.1291
	MineFactoryReloaded: -[1.7.10]2.8.0-104
	ThermalFoundation: -[1.7.10]1.0.0-81
	ThermalExpansion: -[1.7.10]4.0.1-182
	Mantle Environment: Environment healthy.
	TConstruct Environment: Environment healthy.
	NetherOres: Lacking version information.
	ThermalDynamics: -[1.7.10]1.0.0RC7-98
	Chisel: Errors like "[FML]: Unable to lookup ..." are NOT the cause of this crash. You can safely ignore these errors. And update forge while you're at it.
	Launched Version: 1.7.10-Forge10.13.4.1614-1.7.10
	LWJGL: 2.9.1
	OpenGL: Intel(R) HD Graphics 5500 GL version 4.4.0 - Build 20.19.15.4531, Intel
	GL Caps: Using GL 1.3 multitexturing.
Using framebuffer objects because OpenGL 3.0 is supported and separate blending is supported.
Anisotropic filtering is supported and maximum anisotropy is 16.
Shaders are available because OpenGL 2.1 is supported.

	Is Modded: Definitely; Client brand changed to 'fml,forge'
	Type: Client (map_client.txt)
	Resource Packs: []
	Current Language: English (US)
	Profiler Position: N/A (disabled)
	Vec3 Pool Size: 0 (0 bytes; 0 MB) allocated, 0 (0 bytes; 0 MB) used
	Anisotropic Filtering: Off (1)
----

#### Affected versions ("latest" is **NOT** a version):
- Minecraft:1.7.10
- Forge:10.13.4.1614
- AbyssalCraft:1.7.6 to 1.9.1.3-Final

#### Latest log file for when the issue was present:

[pastebin/gist/etc link here]
