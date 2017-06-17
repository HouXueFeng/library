package cn.xapi.hou.po;

import java.util.ArrayList;
import java.util.List;

public class ManagerinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerinfoExample() {
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

        public Criteria andMangnoIsNull() {
            addCriterion("mangNO is null");
            return (Criteria) this;
        }

        public Criteria andMangnoIsNotNull() {
            addCriterion("mangNO is not null");
            return (Criteria) this;
        }

        public Criteria andMangnoEqualTo(Integer value) {
            addCriterion("mangNO =", value, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoNotEqualTo(Integer value) {
            addCriterion("mangNO <>", value, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoGreaterThan(Integer value) {
            addCriterion("mangNO >", value, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mangNO >=", value, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoLessThan(Integer value) {
            addCriterion("mangNO <", value, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoLessThanOrEqualTo(Integer value) {
            addCriterion("mangNO <=", value, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoIn(List<Integer> values) {
            addCriterion("mangNO in", values, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoNotIn(List<Integer> values) {
            addCriterion("mangNO not in", values, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoBetween(Integer value1, Integer value2) {
            addCriterion("mangNO between", value1, value2, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnoNotBetween(Integer value1, Integer value2) {
            addCriterion("mangNO not between", value1, value2, "mangno");
            return (Criteria) this;
        }

        public Criteria andMangnameIsNull() {
            addCriterion("mangName is null");
            return (Criteria) this;
        }

        public Criteria andMangnameIsNotNull() {
            addCriterion("mangName is not null");
            return (Criteria) this;
        }

        public Criteria andMangnameEqualTo(String value) {
            addCriterion("mangName =", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameNotEqualTo(String value) {
            addCriterion("mangName <>", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameGreaterThan(String value) {
            addCriterion("mangName >", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameGreaterThanOrEqualTo(String value) {
            addCriterion("mangName >=", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameLessThan(String value) {
            addCriterion("mangName <", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameLessThanOrEqualTo(String value) {
            addCriterion("mangName <=", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameLike(String value) {
            addCriterion("mangName like", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameNotLike(String value) {
            addCriterion("mangName not like", value, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameIn(List<String> values) {
            addCriterion("mangName in", values, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameNotIn(List<String> values) {
            addCriterion("mangName not in", values, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameBetween(String value1, String value2) {
            addCriterion("mangName between", value1, value2, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangnameNotBetween(String value1, String value2) {
            addCriterion("mangName not between", value1, value2, "mangname");
            return (Criteria) this;
        }

        public Criteria andMangpasswordIsNull() {
            addCriterion("mangPassword is null");
            return (Criteria) this;
        }

        public Criteria andMangpasswordIsNotNull() {
            addCriterion("mangPassword is not null");
            return (Criteria) this;
        }

        public Criteria andMangpasswordEqualTo(String value) {
            addCriterion("mangPassword =", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordNotEqualTo(String value) {
            addCriterion("mangPassword <>", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordGreaterThan(String value) {
            addCriterion("mangPassword >", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mangPassword >=", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordLessThan(String value) {
            addCriterion("mangPassword <", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordLessThanOrEqualTo(String value) {
            addCriterion("mangPassword <=", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordLike(String value) {
            addCriterion("mangPassword like", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordNotLike(String value) {
            addCriterion("mangPassword not like", value, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordIn(List<String> values) {
            addCriterion("mangPassword in", values, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordNotIn(List<String> values) {
            addCriterion("mangPassword not in", values, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordBetween(String value1, String value2) {
            addCriterion("mangPassword between", value1, value2, "mangpassword");
            return (Criteria) this;
        }

        public Criteria andMangpasswordNotBetween(String value1, String value2) {
            addCriterion("mangPassword not between", value1, value2, "mangpassword");
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