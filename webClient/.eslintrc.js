module.exports = {
  root: true,
  env: {
    node: true,
  },
  extends: [
    "plugin:vue/vue3-recommended",
    "prettier",
    "prettier/vue",
  ],
  parserOptions: {
    parser: "babel-eslint",
  },
  rules: {
    "vue/attributes-order": "off",
    "no-console": process.env.NODE_ENV === "production" ? "warn" : "off",
    "no-debugger": process.env.NODE_ENV === "production" ? "warn" : "off",
    "space-before-function-paren": "off",
    "comma-dangle": ["error", "always-multiline"],
    "generator-star-spacing": "off",
  },
};
