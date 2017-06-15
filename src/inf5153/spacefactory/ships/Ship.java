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
import java.util.List;

public interface Ship {

    public String getId();

    public void loadWeapon(Weapon weapon);

    public void unloadWeapon(Weapon weapon);

    public List<Weapon> getWeapons();

}
