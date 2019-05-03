package com.blac.model;

import com.blac.model.SolicitudInspeccion;
import com.blac.model.TipoServicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-03T16:29:33")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> nombreServicio;
    public static volatile SingularAttribute<Servicio, String> descripcionServicio;
    public static volatile CollectionAttribute<Servicio, SolicitudInspeccion> solicitudInspeccionCollection;
    public static volatile SingularAttribute<Servicio, Integer> idUsuario;
    public static volatile SingularAttribute<Servicio, Integer> idServicio;
    public static volatile SingularAttribute<Servicio, TipoServicio> idTipoServicio;

}