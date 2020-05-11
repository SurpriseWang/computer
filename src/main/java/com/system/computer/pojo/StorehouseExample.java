package com.system.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class StorehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorehouseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStorehouseIdIsNull() {
            addCriterion("storehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIsNotNull() {
            addCriterion("storehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdEqualTo(Integer value) {
            addCriterion("storehouse_id =", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotEqualTo(Integer value) {
            addCriterion("storehouse_id <>", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThan(Integer value) {
            addCriterion("storehouse_id >", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("storehouse_id >=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThan(Integer value) {
            addCriterion("storehouse_id <", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("storehouse_id <=", value, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdIn(List<Integer> values) {
            addCriterion("storehouse_id in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotIn(List<Integer> values) {
            addCriterion("storehouse_id not in", values, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_id between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("storehouse_id not between", value1, value2, "storehouseId");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeIsNull() {
            addCriterion("storehouse_describe is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeIsNotNull() {
            addCriterion("storehouse_describe is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeEqualTo(String value) {
            addCriterion("storehouse_describe =", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeNotEqualTo(String value) {
            addCriterion("storehouse_describe <>", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeGreaterThan(String value) {
            addCriterion("storehouse_describe >", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("storehouse_describe >=", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeLessThan(String value) {
            addCriterion("storehouse_describe <", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeLessThanOrEqualTo(String value) {
            addCriterion("storehouse_describe <=", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeLike(String value) {
            addCriterion("storehouse_describe like", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeNotLike(String value) {
            addCriterion("storehouse_describe not like", value, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeIn(List<String> values) {
            addCriterion("storehouse_describe in", values, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeNotIn(List<String> values) {
            addCriterion("storehouse_describe not in", values, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeBetween(String value1, String value2) {
            addCriterion("storehouse_describe between", value1, value2, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseDescribeNotBetween(String value1, String value2) {
            addCriterion("storehouse_describe not between", value1, value2, "storehouseDescribe");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressIsNull() {
            addCriterion("storehouse_address is null");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressIsNotNull() {
            addCriterion("storehouse_address is not null");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressEqualTo(String value) {
            addCriterion("storehouse_address =", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressNotEqualTo(String value) {
            addCriterion("storehouse_address <>", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressGreaterThan(String value) {
            addCriterion("storehouse_address >", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("storehouse_address >=", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressLessThan(String value) {
            addCriterion("storehouse_address <", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressLessThanOrEqualTo(String value) {
            addCriterion("storehouse_address <=", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressLike(String value) {
            addCriterion("storehouse_address like", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressNotLike(String value) {
            addCriterion("storehouse_address not like", value, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressIn(List<String> values) {
            addCriterion("storehouse_address in", values, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressNotIn(List<String> values) {
            addCriterion("storehouse_address not in", values, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressBetween(String value1, String value2) {
            addCriterion("storehouse_address between", value1, value2, "storehouseAddress");
            return (Criteria) this;
        }

        public Criteria andStorehouseAddressNotBetween(String value1, String value2) {
            addCriterion("storehouse_address not between", value1, value2, "storehouseAddress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}