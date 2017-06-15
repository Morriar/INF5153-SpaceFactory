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
package inf5153.spacefactory.ships;

import inf5153.spacefactory.weapons.Weapon;
import java.util.ArrayList;
import java.util.List;

abstract public class AbstractShip implements Ship {

    private String id;

    private List<Weapon> weapons = new ArrayList<>();

    public AbstractShip(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void loadWaypon(Weapon weapon) {
        System.out.println("Load " + weapon + " into " + this);
        weapons.add(weapon);
    }

    @Override
    public void unloadWaypon(Weapon weapon) {
        System.out.println("Unload " + weapon + " from " + this);
        weapons.remove(weapon);
    }

    @Override
    public List<Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return id;
    }

}
