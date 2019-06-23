package com.lnsf.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReidIsNull() {
            addCriterion("reid is null");
            return (Criteria) this;
        }

        public Criteria andReidIsNotNull() {
            addCriterion("reid is not null");
            return (Criteria) this;
        }

        public Criteria andReidEqualTo(Integer value) {
            addCriterion("reid =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(Integer value) {
            addCriterion("reid <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(Integer value) {
            addCriterion("reid >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reid >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(Integer value) {
            addCriterion("reid <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(Integer value) {
            addCriterion("reid <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<Integer> values) {
            addCriterion("reid in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<Integer> values) {
            addCriterion("reid not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(Integer value1, Integer value2) {
            addCriterion("reid between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(Integer value1, Integer value2) {
            addCriterion("reid not between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNull() {
            addCriterion("rcontent is null");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNotNull() {
            addCriterion("rcontent is not null");
            return (Criteria) this;
        }

        public Criteria andRcontentEqualTo(String value) {
            addCriterion("rcontent =", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotEqualTo(String value) {
            addCriterion("rcontent <>", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThan(String value) {
            addCriterion("rcontent >", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThanOrEqualTo(String value) {
            addCriterion("rcontent >=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThan(String value) {
            addCriterion("rcontent <", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThanOrEqualTo(String value) {
            addCriterion("rcontent <=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLike(String value) {
            addCriterion("rcontent like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotLike(String value) {
            addCriterion("rcontent not like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentIn(List<String> values) {
            addCriterion("rcontent in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotIn(List<String> values) {
            addCriterion("rcontent not in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentBetween(String value1, String value2) {
            addCriterion("rcontent between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotBetween(String value1, String value2) {
            addCriterion("rcontent not between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRuidIsNull() {
            addCriterion("ruid is null");
            return (Criteria) this;
        }

        public Criteria andRuidIsNotNull() {
            addCriterion("ruid is not null");
            return (Criteria) this;
        }

        public Criteria andRuidEqualTo(Integer value) {
            addCriterion("ruid =", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotEqualTo(Integer value) {
            addCriterion("ruid <>", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidGreaterThan(Integer value) {
            addCriterion("ruid >", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ruid >=", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidLessThan(Integer value) {
            addCriterion("ruid <", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidLessThanOrEqualTo(Integer value) {
            addCriterion("ruid <=", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidIn(List<Integer> values) {
            addCriterion("ruid in", values, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotIn(List<Integer> values) {
            addCriterion("ruid not in", values, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidBetween(Integer value1, Integer value2) {
            addCriterion("ruid between", value1, value2, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ruid not between", value1, value2, "ruid");
            return (Criteria) this;
        }

        public Criteria andRphotoIsNull() {
            addCriterion("rphoto is null");
            return (Criteria) this;
        }

        public Criteria andRphotoIsNotNull() {
            addCriterion("rphoto is not null");
            return (Criteria) this;
        }

        public Criteria andRphotoEqualTo(Integer value) {
            addCriterion("rphoto =", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotEqualTo(Integer value) {
            addCriterion("rphoto <>", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoGreaterThan(Integer value) {
            addCriterion("rphoto >", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rphoto >=", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLessThan(Integer value) {
            addCriterion("rphoto <", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoLessThanOrEqualTo(Integer value) {
            addCriterion("rphoto <=", value, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoIn(List<Integer> values) {
            addCriterion("rphoto in", values, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotIn(List<Integer> values) {
            addCriterion("rphoto not in", values, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoBetween(Integer value1, Integer value2) {
            addCriterion("rphoto between", value1, value2, "rphoto");
            return (Criteria) this;
        }

        public Criteria andRphotoNotBetween(Integer value1, Integer value2) {
            addCriterion("rphoto not between", value1, value2, "rphoto");
            return (Criteria) this;
        }

        public Criteria andTouidIsNull() {
            addCriterion("touid is null");
            return (Criteria) this;
        }

        public Criteria andTouidIsNotNull() {
            addCriterion("touid is not null");
            return (Criteria) this;
        }

        public Criteria andTouidEqualTo(Integer value) {
            addCriterion("touid =", value, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidNotEqualTo(Integer value) {
            addCriterion("touid <>", value, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidGreaterThan(Integer value) {
            addCriterion("touid >", value, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("touid >=", value, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidLessThan(Integer value) {
            addCriterion("touid <", value, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidLessThanOrEqualTo(Integer value) {
            addCriterion("touid <=", value, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidIn(List<Integer> values) {
            addCriterion("touid in", values, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidNotIn(List<Integer> values) {
            addCriterion("touid not in", values, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidBetween(Integer value1, Integer value2) {
            addCriterion("touid between", value1, value2, "touid");
            return (Criteria) this;
        }

        public Criteria andTouidNotBetween(Integer value1, Integer value2) {
            addCriterion("touid not between", value1, value2, "touid");
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