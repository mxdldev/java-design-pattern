package com.mxdl.desigin.pattern.create.a04_abstract_factory.factory;

import com.mxdl.desigin.pattern.create.a04_abstract_factory.contract.IPerson;
import com.mxdl.desigin.pattern.create.a04_abstract_factory.contract.IPersonFactory;
import com.mxdl.desigin.pattern.create.a04_abstract_factory.entity.BlackManPerson;
import com.mxdl.desigin.pattern.create.a04_abstract_factory.entity.WhiteManPerson;
import com.mxdl.desigin.pattern.create.a04_abstract_factory.entity.WhiteWomanPerson;
import com.mxdl.desigin.pattern.create.a04_abstract_factory.entity.YellowManPerson;
import com.mxdl.desigin.pattern.create.a04_abstract_factory.entity.YellowWomanPerson;

/**
 * Description: <ManFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class WomanFactory implements IPersonFactory {
    @Override
    public IPerson createWhitePersonFactory() {
        return new WhiteWomanPerson();
    }

    @Override
    public IPerson createBlackPersonFactory() {
        return new WhiteWomanPerson();
    }

    @Override
    public IPerson createYellowPersonFactory() {
        return new YellowWomanPerson();
    }
}
