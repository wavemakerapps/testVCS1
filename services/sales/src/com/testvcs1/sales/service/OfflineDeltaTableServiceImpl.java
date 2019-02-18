/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testvcs1.sales.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testvcs1.sales.OfflineDeltaTable;


/**
 * ServiceImpl object for domain model class OfflineDeltaTable.
 *
 * @see OfflineDeltaTable
 */
@Service("sales.OfflineDeltaTableService")
@Validated
public class OfflineDeltaTableServiceImpl implements OfflineDeltaTableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OfflineDeltaTableServiceImpl.class);


    @Autowired
    @Qualifier("sales.OfflineDeltaTableDao")
    private WMGenericDao<OfflineDeltaTable, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<OfflineDeltaTable, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public OfflineDeltaTable create(OfflineDeltaTable offlineDeltaTable) {
        LOGGER.debug("Creating a new OfflineDeltaTable with information: {}", offlineDeltaTable);

        OfflineDeltaTable offlineDeltaTableCreated = this.wmGenericDao.create(offlineDeltaTable);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(offlineDeltaTableCreated);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public OfflineDeltaTable getById(Integer offlinedeltatableId) {
        LOGGER.debug("Finding OfflineDeltaTable by id: {}", offlinedeltatableId);
        return this.wmGenericDao.findById(offlinedeltatableId);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public OfflineDeltaTable findById(Integer offlinedeltatableId) {
        LOGGER.debug("Finding OfflineDeltaTable by id: {}", offlinedeltatableId);
        try {
            return this.wmGenericDao.findById(offlinedeltatableId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No OfflineDeltaTable found with id: {}", offlinedeltatableId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public List<OfflineDeltaTable> findByMultipleIds(List<Integer> offlinedeltatableIds, boolean orderedReturn) {
        LOGGER.debug("Finding OfflineDeltaTables by ids: {}", offlinedeltatableIds);

        return this.wmGenericDao.findByMultipleIds(offlinedeltatableIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "salesTransactionManager")
    @Override
    public OfflineDeltaTable update(OfflineDeltaTable offlineDeltaTable) {
        LOGGER.debug("Updating OfflineDeltaTable with information: {}", offlineDeltaTable);

        this.wmGenericDao.update(offlineDeltaTable);
        this.wmGenericDao.refresh(offlineDeltaTable);

        return offlineDeltaTable;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public OfflineDeltaTable delete(Integer offlinedeltatableId) {
        LOGGER.debug("Deleting OfflineDeltaTable with id: {}", offlinedeltatableId);
        OfflineDeltaTable deleted = this.wmGenericDao.findById(offlinedeltatableId);
        if (deleted == null) {
            LOGGER.debug("No OfflineDeltaTable found with id: {}", offlinedeltatableId);
            throw new EntityNotFoundException(String.valueOf(offlinedeltatableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public void delete(OfflineDeltaTable offlineDeltaTable) {
        LOGGER.debug("Deleting OfflineDeltaTable with {}", offlineDeltaTable);
        this.wmGenericDao.delete(offlineDeltaTable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<OfflineDeltaTable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all OfflineDeltaTables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<OfflineDeltaTable> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all OfflineDeltaTables");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service sales for table OfflineDeltaTable to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service sales for table OfflineDeltaTable to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}