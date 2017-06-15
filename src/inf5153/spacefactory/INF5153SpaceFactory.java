/*
 * Copyright 2017 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inf5153.spacefactory;

import inf5153.spacefactory.commands.CommandList;
import inf5153.spacefactory.commands.LoadWeapon;
import inf5153.spacefactory.commands.UnloadWeapon;
import inf5153.spacefactory.factories.FactoryFactory;
import inf5153.spacefactory.factories.SpaceFactory;
import inf5153.spacefactory.ships.Ship;
import inf5153.spacefactory.weapons.Weapon;

public class INF5153SpaceFactory {

    public static void main(String[] args) {

        SpaceFactory shipFactory = FactoryFactory.getFactory("SHIP");
        Ship s1 = shipFactory.getShip("SX-V-Light", "s1");
        Ship s2 = shipFactory.getShip("SX-V-Heavy", "s2");

        SpaceFactory weaponFactory = FactoryFactory.getFactory("WEAPON");
        Weapon w1 = weaponFactory.getWeapon("WX-Blaster", "w1");
        Weapon w2 = weaponFactory.getWeapon("WX-Phaser", "w2");

        CommandList commands = new CommandList();
        commands.addCommand(new LoadWeapon(s1, w1));
        commands.addCommand(new LoadWeapon(s1, w2));
        commands.addCommand(new UnloadWeapon(s1, w2));
        commands.addCommand(new LoadWeapon(s2, w2));
        commands.executeCommands();
    }

}
