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

import com.testvcs1.sales.OfflineReadWriteBundle;


/**
 * ServiceImpl object for domain model class OfflineReadWriteBundle.
 *
 * @see OfflineReadWriteBundle
 */
@Service("sales.OfflineReadWriteBundleService")
@Validated
public class OfflineReadWriteBundleServiceImpl implements OfflineReadWriteBundleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OfflineReadWriteBundleServiceImpl.class);


    @Autowired
    @Qualifier("sales.OfflineReadWriteBundleDao")
    private WMGenericDao<OfflineReadWriteBundle, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<OfflineReadWriteBundle, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public OfflineReadWriteBundle create(OfflineReadWriteBundle offlineReadWriteBundle) {
        LOGGER.debug("Creating a new OfflineReadWriteBundle with information: {}", offlineReadWriteBundle);

        OfflineReadWriteBundle offlineReadWriteBundleCreated = this.wmGenericDao.create(offlineReadWriteBundle);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(offlineReadWriteBundleCreated);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public OfflineReadWriteBundle getById(Integer offlinereadwritebundleId) {
        LOGGER.debug("Finding OfflineReadWriteBundle by id: {}", offlinereadwritebundleId);
        return this.wmGenericDao.findById(offlinereadwritebundleId);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public OfflineReadWriteBundle findById(Integer offlinereadwritebundleId) {
        LOGGER.debug("Finding OfflineReadWriteBundle by id: {}", offlinereadwritebundleId);
        try {
            return this.wmGenericDao.findById(offlinereadwritebundleId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No OfflineReadWriteBundle found with id: {}", offlinereadwritebundleId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public List<OfflineReadWriteBundle> findByMultipleIds(List<Integer> offlinereadwritebundleIds, boolean orderedReturn) {
        LOGGER.debug("Finding OfflineReadWriteBundles by ids: {}", offlinereadwritebundleIds);

        return this.wmGenericDao.findByMultipleIds(offlinereadwritebundleIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "salesTransactionManager")
    @Override
    public OfflineReadWriteBundle update(OfflineReadWriteBundle offlineReadWriteBundle) {
        LOGGER.debug("Updating OfflineReadWriteBundle with information: {}", offlineReadWriteBundle);

        this.wmGenericDao.update(offlineReadWriteBundle);
        this.wmGenericDao.refresh(offlineReadWriteBundle);

        return offlineReadWriteBundle;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public OfflineReadWriteBundle delete(Integer offlinereadwritebundleId) {
        LOGGER.debug("Deleting OfflineReadWriteBundle with id: {}", offlinereadwritebundleId);
        OfflineReadWriteBundle deleted = this.wmGenericDao.findById(offlinereadwritebundleId);
        if (deleted == null) {
            LOGGER.debug("No OfflineReadWriteBundle found with id: {}", offlinereadwritebundleId);
            throw new EntityNotFoundException(String.valueOf(offlinereadwritebundleId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "salesTransactionManager")
    @Override
    public void delete(OfflineReadWriteBundle offlineReadWriteBundle) {
        LOGGER.debug("Deleting OfflineReadWriteBundle with {}", offlineReadWriteBundle);
        this.wmGenericDao.delete(offlineReadWriteBundle);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<OfflineReadWriteBundle> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all OfflineReadWriteBundles");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager")
    @Override
    public Page<OfflineReadWriteBundle> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all OfflineReadWriteBundles");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service sales for table OfflineReadWriteBundle to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "salesTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service sales for table OfflineReadWriteBundle to {} format", options.getExportType());
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