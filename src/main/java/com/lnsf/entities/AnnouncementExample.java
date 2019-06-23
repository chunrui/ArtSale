package com.lnsf.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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

        public Criteria andAnidIsNull() {
            addCriterion("anid is null");
            return (Criteria) this;
        }

        public Criteria andAnidIsNotNull() {
            addCriterion("anid is not null");
            return (Criteria) this;
        }

        public Criteria andAnidEqualTo(Integer value) {
            addCriterion("anid =", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidNotEqualTo(Integer value) {
            addCriterion("anid <>", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidGreaterThan(Integer value) {
            addCriterion("anid >", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("anid >=", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidLessThan(Integer value) {
            addCriterion("anid <", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidLessThanOrEqualTo(Integer value) {
            addCriterion("anid <=", value, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidIn(List<Integer> values) {
            addCriterion("anid in", values, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidNotIn(List<Integer> values) {
            addCriterion("anid not in", values, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidBetween(Integer value1, Integer value2) {
            addCriterion("anid between", value1, value2, "anid");
            return (Criteria) this;
        }

        public Criteria andAnidNotBetween(Integer value1, Integer value2) {
            addCriterion("anid not between", value1, value2, "anid");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNull() {
            addCriterion("announcement is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNotNull() {
            addCriterion("announcement is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementEqualTo(String value) {
            addCriterion("announcement =", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotEqualTo(String value) {
            addCriterion("announcement <>", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThan(String value) {
            addCriterion("announcement >", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThanOrEqualTo(String value) {
            addCriterion("announcement >=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThan(String value) {
            addCriterion("announcement <", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThanOrEqualTo(String value) {
            addCriterion("announcement <=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLike(String value) {
            addCriterion("announcement like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotLike(String value) {
            addCriterion("announcement not like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIn(List<String> values) {
            addCriterion("announcement in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotIn(List<String> values) {
            addCriterion("announcement not in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementBetween(String value1, String value2) {
            addCriterion("announcement between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotBetween(String value1, String value2) {
            addCriterion("announcement not between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(Integer value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(Integer value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(Integer value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(Integer value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(Integer value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<Integer> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<Integer> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(Integer value1, Integer value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
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