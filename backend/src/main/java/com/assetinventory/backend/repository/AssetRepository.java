package com.assetinventory.backend.repository;

import com.assetinventory.backend.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
}
