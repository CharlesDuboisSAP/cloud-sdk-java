/*
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */

/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 4.21.0
 */

package com.sap.cloud.sdk.datamodel.odatav4.referenceservice.namespaces.trippin;

import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.sap.cloud.sdk.datamodel.odata.client.request.ODataEntityKey;
import com.sap.cloud.sdk.datamodel.odatav4.core.VdmComplex;
import com.sap.cloud.sdk.result.ElementName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 * Original complex type name from the Odata EDM: <b>AirportLocation</b>
 * </p>
 *
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString( doNotUseGetters = true, callSuper = true )
@EqualsAndHashCode( doNotUseGetters = true, callSuper = true )
@JsonAdapter( com.sap.cloud.sdk.datamodel.odatav4.adapter.GsonVdmAdapterFactory.class )
@JsonSerialize( using = com.sap.cloud.sdk.datamodel.odatav4.adapter.JacksonVdmObjectSerializer.class )
@JsonDeserialize( using = com.sap.cloud.sdk.datamodel.odatav4.adapter.JacksonVdmObjectDeserializer.class )
public class AirportLocation extends VdmComplex<AirportLocation>
{

    @Getter
    private final java.lang.String odataType = "Trippin.AirportLocation";
    /**
     * Constraints: Nullable
     * <p>
     * Original property name from the Odata EDM: <b>Address</b>
     * </p>
     *
     * @return The address contained in this {@link VdmComplex}.
     */
    @Nullable
    @ElementName( "Address" )
    private java.lang.String address;
    public final static com.sap.cloud.sdk.datamodel.odatav4.core.SimpleProperty.String<AirportLocation> ADDRESS =
        new com.sap.cloud.sdk.datamodel.odatav4.core.SimpleProperty.String<AirportLocation>(
            AirportLocation.class,
            "Address");
    /**
     * Constraints: Nullable
     * <p>
     * Original property name from the Odata EDM: <b>City</b>
     * </p>
     *
     * @return The city contained in this {@link VdmComplex}.
     */
    @Nullable
    @ElementName( "City" )
    private City city;
    /**
     * Use with available request builders to apply the <b>City</b> complex property to query operations.
     *
     */
    public final static com.sap.cloud.sdk.datamodel.odatav4.core.ComplexProperty.Single<AirportLocation, City> CITY =
        new com.sap.cloud.sdk.datamodel.odatav4.core.ComplexProperty.Single<AirportLocation, City>(
            AirportLocation.class,
            "City",
            City.class);

    @Nonnull
    @Override
    public Class<AirportLocation> getType()
    {
        return AirportLocation.class;
    }

    @Nonnull
    @Override
    protected Map<java.lang.String, Object> toMapOfFields()
    {
        final Map<java.lang.String, Object> values = super.toMapOfFields();
        values.put("Address", getAddress());
        values.put("City", getCity());
        return values;
    }

    @Override
    protected void fromMap( final Map<java.lang.String, Object> inputValues )
    {
        final Map<java.lang.String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if( values.containsKey("Address") ) {
                final Object value = values.remove("Address");
                if( (value == null) || (!value.equals(getAddress())) ) {
                    setAddress(((java.lang.String) value));
                }
            }
        }
        // structured properties
        {
            if( values.containsKey("City") ) {
                final Object value = values.remove("City");
                if( value instanceof Map ) {
                    if( getCity() == null ) {
                        setCity(new City());
                    }
                    @SuppressWarnings( "unchecked" )
                    final Map<java.lang.String, Object> inputMap = ((Map<java.lang.String, Object>) value);
                    getCity().fromMap(inputMap);
                }
                if( (value == null) && (getCity() != null) ) {
                    setCity(null);
                }
            }
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    @Nonnull
    @Override
    protected ODataEntityKey getKey()
    {
        final ODataEntityKey entityKey = super.getKey();
        return entityKey;
    }

    /**
     * Constraints: Nullable
     * <p>
     * Original property name from the Odata EDM: <b>Address</b>
     * </p>
     *
     * @param address
     *            The address to set.
     */
    public void setAddress( @Nullable final java.lang.String address )
    {
        rememberChangedField("Address", this.address);
        this.address = address;
    }

    /**
     * Constraints: Nullable
     * <p>
     * Original property name from the Odata EDM: <b>City</b>
     * </p>
     *
     * @param city
     *            The city to set.
     */
    public void setCity( @Nullable final City city )
    {
        rememberChangedField("City", this.city);
        this.city = city;
    }

}
