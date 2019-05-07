package com.blac.model;

import com.blac.model.DetallePermiso;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-05-07T14:17:31")
@StaticMetamodel(Permisos.class)
public class Permisos_ { 

    public static volatile SingularAttribute<Permisos, Integer> numeroPermiso;
    public static volatile SingularAttribute<Permisos, String> responsable;
    public static volatile SingularAttribute<Permisos, Integer> idPermiso;
    public static volatile SingularAttribute<Permisos, Date> fechaEmision;
    public static volatile CollectionAttribute<Permisos, DetallePermiso> detallePermisoCollection;

}