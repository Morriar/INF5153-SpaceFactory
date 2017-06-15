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
package inf5153.spacefactory.commands;

import inf5153.spacefactory.ships.Ship;
import inf5153.spacefactory.weapons.Weapon;

public class LoadWeapon implements Command {

    private Ship ship;
    private Weapon weapon;

    public LoadWeapon(Ship ship, Weapon weapon) {
        this.ship = ship;
        this.weapon = weapon;
    }

    @Override
    public void execute() {
        ship.loadWeapon(weapon);
    }

}
