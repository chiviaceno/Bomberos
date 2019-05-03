package com.blac.model;

import com.blac.model.SolicitudInspeccion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-03T16:29:33")
@StaticMetamodel(EstadoSolicitud.class)
public class EstadoSolicitud_ { 

    public static volatile CollectionAttribute<EstadoSolicitud, SolicitudInspeccion> solicitudInspeccionCollection;
    public static volatile SingularAttribute<EstadoSolicitud, String> nombreEstadoSolicitud;
    public static volatile SingularAttribute<EstadoSolicitud, Integer> idEstadoSolicitud;

}