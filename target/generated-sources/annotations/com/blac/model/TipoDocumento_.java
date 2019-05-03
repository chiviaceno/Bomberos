package com.blac.model;

import com.blac.model.Cuentas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-29T16:55:51")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile CollectionAttribute<TipoDocumento, Cuentas> cuentasCollection;
    public static volatile SingularAttribute<TipoDocumento, Integer> idTipoDocumento;
    public static volatile SingularAttribute<TipoDocumento, String> nombreTipoDocumento;

}