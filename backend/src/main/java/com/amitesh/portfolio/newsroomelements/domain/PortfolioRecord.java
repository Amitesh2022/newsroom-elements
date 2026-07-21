package com.amitesh.portfolio.newsroomelements.domain;

import java.time.Instant;
import java.util.UUID;

public record PortfolioRecord(UUID id, String title, String status, String note, Instant updatedAt) {}
