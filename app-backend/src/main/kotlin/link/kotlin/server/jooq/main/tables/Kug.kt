/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables


import java.time.LocalDate

import link.kotlin.server.jooq.main.Public
import link.kotlin.server.jooq.main.keys.KUG_PKEY
import link.kotlin.server.jooq.main.tables.records.KugRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row8
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Kug(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, KugRecord>?,
    aliased: Table<KugRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<KugRecord>(
    alias,
    Public.PUBLIC,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>public.kug</code>
         */
        val KUG: Kug = Kug()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<KugRecord> = KugRecord::class.java

    /**
     * The column <code>public.kug.id</code>.
     */
    val ID: TableField<KugRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.kug.continent</code>.
     */
    val CONTINENT: TableField<KugRecord, String?> = createField(DSL.name("continent"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kug.name</code>.
     */
    val NAME: TableField<KugRecord, String?> = createField(DSL.name("name"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kug.country</code>.
     */
    val COUNTRY: TableField<KugRecord, String?> = createField(DSL.name("country"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kug.url</code>.
     */
    val URL: TableField<KugRecord, String?> = createField(DSL.name("url"), SQLDataType.VARCHAR(500).nullable(false), this, "")

    /**
     * The column <code>public.kug.latitude</code>.
     */
    val LATITUDE: TableField<KugRecord, Double?> = createField(DSL.name("latitude"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.kug.longitude</code>.
     */
    val LONGITUDE: TableField<KugRecord, Double?> = createField(DSL.name("longitude"), SQLDataType.DOUBLE, this, "")

    /**
     * The column <code>public.kug.created</code>.
     */
    val CREATED: TableField<KugRecord, LocalDate?> = createField(DSL.name("created"), SQLDataType.LOCALDATE.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<KugRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<KugRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>public.kug</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.kug</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.kug</code> table reference
     */
    constructor(): this(DSL.name("kug"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, KugRecord>): this(Internal.createPathAlias(child, key), child, key, KUG, null)
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<KugRecord, Long?> = super.getIdentity() as Identity<KugRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<KugRecord> = KUG_PKEY
    override fun `as`(alias: String): Kug = Kug(DSL.name(alias), this)
    override fun `as`(alias: Name): Kug = Kug(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Kug = Kug(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Kug = Kug(name, null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<Long?, String?, String?, String?, String?, Double?, Double?, LocalDate?> = super.fieldsRow() as Row8<Long?, String?, String?, String?, String?, Double?, Double?, LocalDate?>
}
