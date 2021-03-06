/*
 * Copyright 2012 Peter Lawrey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vanilla.java.datamodel;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MutableModelTest {
    @Test(expected = IllegalArgumentException.class)
    public void nonNestedClass() {
        new MutableModel(Wrapped.class);

        fail();
    }

    @Test
    public void simpleModel() {
        MutableModel model = new MutableModel(SimpleModel.class);
        final List<TypeModel> types = model.getTypes();
        assertEquals(1, types.size());
        assertEquals(SimpleModel.SimpleClass.class, types.get(0).getBaseType());
    }
}
