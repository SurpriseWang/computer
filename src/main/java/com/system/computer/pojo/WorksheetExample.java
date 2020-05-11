package com.system.computer.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorksheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksheetExample() {
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

        public Criteria andWorksheetIdIsNull() {
            addCriterion("worksheet_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdIsNotNull() {
            addCriterion("worksheet_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdEqualTo(Integer value) {
            addCriterion("worksheet_id =", value, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdNotEqualTo(Integer value) {
            addCriterion("worksheet_id <>", value, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdGreaterThan(Integer value) {
            addCriterion("worksheet_id >", value, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("worksheet_id >=", value, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdLessThan(Integer value) {
            addCriterion("worksheet_id <", value, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdLessThanOrEqualTo(Integer value) {
            addCriterion("worksheet_id <=", value, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdIn(List<Integer> values) {
            addCriterion("worksheet_id in", values, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdNotIn(List<Integer> values) {
            addCriterion("worksheet_id not in", values, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdBetween(Integer value1, Integer value2) {
            addCriterion("worksheet_id between", value1, value2, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("worksheet_id not between", value1, value2, "worksheetId");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentIsNull() {
            addCriterion("worksheet_content is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentIsNotNull() {
            addCriterion("worksheet_content is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentEqualTo(String value) {
            addCriterion("worksheet_content =", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentNotEqualTo(String value) {
            addCriterion("worksheet_content <>", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentGreaterThan(String value) {
            addCriterion("worksheet_content >", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentGreaterThanOrEqualTo(String value) {
            addCriterion("worksheet_content >=", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentLessThan(String value) {
            addCriterion("worksheet_content <", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentLessThanOrEqualTo(String value) {
            addCriterion("worksheet_content <=", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentLike(String value) {
            addCriterion("worksheet_content like", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentNotLike(String value) {
            addCriterion("worksheet_content not like", value, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentIn(List<String> values) {
            addCriterion("worksheet_content in", values, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentNotIn(List<String> values) {
            addCriterion("worksheet_content not in", values, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentBetween(String value1, String value2) {
            addCriterion("worksheet_content between", value1, value2, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetContentNotBetween(String value1, String value2) {
            addCriterion("worksheet_content not between", value1, value2, "worksheetContent");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalIsNull() {
            addCriterion("worksheet_approval is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalIsNotNull() {
            addCriterion("worksheet_approval is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalEqualTo(Byte value) {
            addCriterion("worksheet_approval =", value, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalNotEqualTo(Byte value) {
            addCriterion("worksheet_approval <>", value, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalGreaterThan(Byte value) {
            addCriterion("worksheet_approval >", value, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalGreaterThanOrEqualTo(Byte value) {
            addCriterion("worksheet_approval >=", value, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalLessThan(Byte value) {
            addCriterion("worksheet_approval <", value, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalLessThanOrEqualTo(Byte value) {
            addCriterion("worksheet_approval <=", value, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalIn(List<Byte> values) {
            addCriterion("worksheet_approval in", values, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalNotIn(List<Byte> values) {
            addCriterion("worksheet_approval not in", values, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalBetween(Byte value1, Byte value2) {
            addCriterion("worksheet_approval between", value1, value2, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetApprovalNotBetween(Byte value1, Byte value2) {
            addCriterion("worksheet_approval not between", value1, value2, "worksheetApproval");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminIsNull() {
            addCriterion("worksheet_admin is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminIsNotNull() {
            addCriterion("worksheet_admin is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminEqualTo(Integer value) {
            addCriterion("worksheet_admin =", value, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminNotEqualTo(Integer value) {
            addCriterion("worksheet_admin <>", value, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminGreaterThan(Integer value) {
            addCriterion("worksheet_admin >", value, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("worksheet_admin >=", value, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminLessThan(Integer value) {
            addCriterion("worksheet_admin <", value, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminLessThanOrEqualTo(Integer value) {
            addCriterion("worksheet_admin <=", value, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminIn(List<Integer> values) {
            addCriterion("worksheet_admin in", values, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminNotIn(List<Integer> values) {
            addCriterion("worksheet_admin not in", values, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminBetween(Integer value1, Integer value2) {
            addCriterion("worksheet_admin between", value1, value2, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("worksheet_admin not between", value1, value2, "worksheetAdmin");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserIsNull() {
            addCriterion("worksheet_user is null");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserIsNotNull() {
            addCriterion("worksheet_user is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserEqualTo(Integer value) {
            addCriterion("worksheet_user =", value, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserNotEqualTo(Integer value) {
            addCriterion("worksheet_user <>", value, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserGreaterThan(Integer value) {
            addCriterion("worksheet_user >", value, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("worksheet_user >=", value, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserLessThan(Integer value) {
            addCriterion("worksheet_user <", value, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserLessThanOrEqualTo(Integer value) {
            addCriterion("worksheet_user <=", value, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserIn(List<Integer> values) {
            addCriterion("worksheet_user in", values, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserNotIn(List<Integer> values) {
            addCriterion("worksheet_user not in", values, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserBetween(Integer value1, Integer value2) {
            addCriterion("worksheet_user between", value1, value2, "worksheetUser");
            return (Criteria) this;
        }

        public Criteria andWorksheetUserNotBetween(Integer value1, Integer value2) {
            addCriterion("worksheet_user not between", value1, value2, "worksheetUser");
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