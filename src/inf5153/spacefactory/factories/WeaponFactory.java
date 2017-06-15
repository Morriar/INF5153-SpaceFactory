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
package inf5153.spacefactory.factories;

import inf5153.spacefactory.ships.Ship;
import inf5153.spacefactory.weapons.Blaster;
import inf5153.spacefactory.weapons.Phaser;
import inf5153.spacefactory.weapons.Weapon;

public class WeaponFactory implements SpaceFactory {

    @Override
    public Weapon getWeapon(String model, String id) {
        switch (model) {
            case "WX-Blaster":
                return new Blaster(id);
            case "WX-Phaser":
                return new Phaser(id);
            default:
                throw new IllegalArgumentException("Unknown ship model");
        }
    }

    @Override
    public Ship getShip(String model, String id) {
        throw new UnsupportedOperationException("Not supported");
    }
}
