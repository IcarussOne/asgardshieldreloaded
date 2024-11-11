package com.mangregory.asgardshieldreloaded.compat;

import net.minecraftforge.fml.common.Loader;

import com.mangregory.asgardshieldreloaded.compat.harkenscythe.init.HSModItems;

public class CompatHandler
{
    public static void init()
    {
        if (Loader.isModLoaded("harkenscythe"))
        {
            HSModItems.init();
        }
    }
}