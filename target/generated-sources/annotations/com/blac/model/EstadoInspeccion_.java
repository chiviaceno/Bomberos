package com.blac.model;

import com.blac.model.DetalleInspeccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-04-29T16:55:51")
@StaticMetamodel(EstadoInspeccion.class)
public class EstadoInspeccion_ { 

    public static volatile SingularAttribute<EstadoInspeccion, String> nombreEstadoInspeccion;
    public static volatile SingularAttribute<EstadoInspeccion, Integer> idEstadoInspeccion;
    public static volatile CollectionAttribute<EstadoInspeccion, DetalleInspeccion> detalleInspeccionCollection;

}