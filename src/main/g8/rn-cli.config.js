module.exports = {
  getTransformModulePath() {
    return require.resolve(require("path").resolve("../../fastopt-noparse.js"));
  }
};
