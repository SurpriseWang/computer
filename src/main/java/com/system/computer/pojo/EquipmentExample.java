package com.system.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Integer value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Integer value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Integer value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Integer value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Integer> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Integer> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeIsNull() {
            addCriterion("equipment_describe is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeIsNotNull() {
            addCriterion("equipment_describe is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeEqualTo(String value) {
            addCriterion("equipment_describe =", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotEqualTo(String value) {
            addCriterion("equipment_describe <>", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeGreaterThan(String value) {
            addCriterion("equipment_describe >", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_describe >=", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeLessThan(String value) {
            addCriterion("equipment_describe <", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeLessThanOrEqualTo(String value) {
            addCriterion("equipment_describe <=", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeLike(String value) {
            addCriterion("equipment_describe like", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotLike(String value) {
            addCriterion("equipment_describe not like", value, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeIn(List<String> values) {
            addCriterion("equipment_describe in", values, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotIn(List<String> values) {
            addCriterion("equipment_describe not in", values, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeBetween(String value1, String value2) {
            addCriterion("equipment_describe between", value1, value2, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentDescribeNotBetween(String value1, String value2) {
            addCriterion("equipment_describe not between", value1, value2, "equipmentDescribe");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetIsNull() {
            addCriterion("equipment_cabinet is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetIsNotNull() {
            addCriterion("equipment_cabinet is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetEqualTo(Integer value) {
            addCriterion("equipment_cabinet =", value, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetNotEqualTo(Integer value) {
            addCriterion("equipment_cabinet <>", value, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetGreaterThan(Integer value) {
            addCriterion("equipment_cabinet >", value, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_cabinet >=", value, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetLessThan(Integer value) {
            addCriterion("equipment_cabinet <", value, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_cabinet <=", value, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetIn(List<Integer> values) {
            addCriterion("equipment_cabinet in", values, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetNotIn(List<Integer> values) {
            addCriterion("equipment_cabinet not in", values, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetBetween(Integer value1, Integer value2) {
            addCriterion("equipment_cabinet between", value1, value2, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentCabinetNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_cabinet not between", value1, value2, "equipmentCabinet");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseIsNull() {
            addCriterion("equipment_storehouse is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseIsNotNull() {
            addCriterion("equipment_storehouse is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseEqualTo(Integer value) {
            addCriterion("equipment_storehouse =", value, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseNotEqualTo(Integer value) {
            addCriterion("equipment_storehouse <>", value, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseGreaterThan(Integer value) {
            addCriterion("equipment_storehouse >", value, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_storehouse >=", value, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseLessThan(Integer value) {
            addCriterion("equipment_storehouse <", value, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_storehouse <=", value, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseIn(List<Integer> values) {
            addCriterion("equipment_storehouse in", values, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseNotIn(List<Integer> values) {
            addCriterion("equipment_storehouse not in", values, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseBetween(Integer value1, Integer value2) {
            addCriterion("equipment_storehouse between", value1, value2, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentStorehouseNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_storehouse not between", value1, value2, "equipmentStorehouse");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineIsNull() {
            addCriterion("equipment_online is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineIsNotNull() {
            addCriterion("equipment_online is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineEqualTo(Byte value) {
            addCriterion("equipment_online =", value, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineNotEqualTo(Byte value) {
            addCriterion("equipment_online <>", value, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineGreaterThan(Byte value) {
            addCriterion("equipment_online >", value, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("equipment_online >=", value, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineLessThan(Byte value) {
            addCriterion("equipment_online <", value, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("equipment_online <=", value, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineIn(List<Byte> values) {
            addCriterion("equipment_online in", values, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineNotIn(List<Byte> values) {
            addCriterion("equipment_online not in", values, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineBetween(Byte value1, Byte value2) {
            addCriterion("equipment_online between", value1, value2, "equipmentOnline");
            return (Criteria) this;
        }

        public Criteria andEquipmentOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("equipment_online not between", value1, value2, "equipmentOnline");
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