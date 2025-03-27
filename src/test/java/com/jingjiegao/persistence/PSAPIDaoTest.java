package com.jingjiegao.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Psapi dao test.
 */
class PSAPIDaoTest {

    /**
     * Gets order success.
     */
    @Test
    void getOrderSuccess() {
        PSAPIDao dao = new PSAPIDao();
        assertEquals("placed", dao.getOrder().getStatus());
    }
}