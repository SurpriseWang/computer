package com.system.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class CabinetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CabinetExample() {
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

        public Criteria andCabinetIdIsNull() {
            addCriterion("cabinet_id is null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIsNotNull() {
            addCriterion("cabinet_id is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetIdEqualTo(Integer value) {
            addCriterion("cabinet_id =", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotEqualTo(Integer value) {
            addCriterion("cabinet_id <>", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThan(Integer value) {
            addCriterion("cabinet_id >", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cabinet_id >=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThan(Integer value) {
            addCriterion("cabinet_id <", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdLessThanOrEqualTo(Integer value) {
            addCriterion("cabinet_id <=", value, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdIn(List<Integer> values) {
            addCriterion("cabinet_id in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotIn(List<Integer> values) {
            addCriterion("cabinet_id not in", values, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdBetween(Integer value1, Integer value2) {
            addCriterion("cabinet_id between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cabinet_id not between", value1, value2, "cabinetId");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeIsNull() {
            addCriterion("cabinet_describe is null");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeIsNotNull() {
            addCriterion("cabinet_describe is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeEqualTo(String value) {
            addCriterion("cabinet_describe =", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeNotEqualTo(String value) {
            addCriterion("cabinet_describe <>", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeGreaterThan(String value) {
            addCriterion("cabinet_describe >", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("cabinet_describe >=", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeLessThan(String value) {
            addCriterion("cabinet_describe <", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeLessThanOrEqualTo(String value) {
            addCriterion("cabinet_describe <=", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeLike(String value) {
            addCriterion("cabinet_describe like", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeNotLike(String value) {
            addCriterion("cabinet_describe not like", value, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeIn(List<String> values) {
            addCriterion("cabinet_describe in", values, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeNotIn(List<String> values) {
            addCriterion("cabinet_describe not in", values, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeBetween(String value1, String value2) {
            addCriterion("cabinet_describe between", value1, value2, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetDescribeNotBetween(String value1, String value2) {
            addCriterion("cabinet_describe not between", value1, value2, "cabinetDescribe");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressIsNull() {
            addCriterion("cabinet_address is null");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressIsNotNull() {
            addCriterion("cabinet_address is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressEqualTo(String value) {
            addCriterion("cabinet_address =", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressNotEqualTo(String value) {
            addCriterion("cabinet_address <>", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressGreaterThan(String value) {
            addCriterion("cabinet_address >", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cabinet_address >=", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressLessThan(String value) {
            addCriterion("cabinet_address <", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressLessThanOrEqualTo(String value) {
            addCriterion("cabinet_address <=", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressLike(String value) {
            addCriterion("cabinet_address like", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressNotLike(String value) {
            addCriterion("cabinet_address not like", value, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressIn(List<String> values) {
            addCriterion("cabinet_address in", values, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressNotIn(List<String> values) {
            addCriterion("cabinet_address not in", values, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressBetween(String value1, String value2) {
            addCriterion("cabinet_address between", value1, value2, "cabinetAddress");
            return (Criteria) this;
        }

        public Criteria andCabinetAddressNotBetween(String value1, String value2) {
            addCriterion("cabinet_address not between", value1, value2, "cabinetAddress");
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