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

package person.model;

import person.attributes.*;
import vanilla.java.datamodel.CodeGenerator;
import vanilla.java.datamodel.annotations.Immutable;
import vanilla.java.datamodel.annotations.Wrapper;

public class Model {
    @Wrapper
    class PersonId {
        int value;
    }

    class Person {
        @Immutable
        PersonId id;
        Name name;
        DateOfBirth dateOfBirth;
        Address address;
        TaxId taxId;
        MartialStatus martialStatus;
        Gender gender;
        PhoneNumber homePhone;
        PhoneNumber mobilePhone;
        PhoneNumber workPhone;
    }

    public static void main(String... args) {
        CodeGenerator dm = new CodeGenerator(Model.class);
        dm.addGettersSetters(true);
        System.out.println(dm.simplifyModel());
    }
}
