/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.command.commands.gm0;

import client.MapleClient;
import client.command.Command;
import server.MapleShopFactory;

/**
 *
 * @author Symphofear
 */
public class ShopCommand extends Command{

    {
        setDescription("");
    }
    
    @Override
    public void execute(MapleClient c, String[] params) {
        MapleShopFactory.getInstance().getShop(1000).sendShop(c);
    }
    
}
