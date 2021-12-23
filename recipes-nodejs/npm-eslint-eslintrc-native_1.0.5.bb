SUMMARY = "NPM: @eslint/eslintrc"
DESCRIPTION = "The legacy ESLintRC config file format for ESLint"
HOMEPAGE = "https://github.com/eslint/eslintrc#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f0f520c61625b7338d0a038d6bb8e34"

DEPENDS = "npm-ajv-native \
           npm-debug-native \
           npm-espree-native \
           npm-globals-native \
           npm-ignore-native \
           npm-import-fresh-native \
           npm-js-yaml-native \
           npm-minimatch-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.0.5.tgz"
SRC_URI[md5sum] = "451254e23699495f513d5398f02ff6aa"
SRC_URI[sha256sum] = "4ddb0c08b3c1d66c9adad85ab0c5fd59c952861adcf1cd2c6b3d075c7152a006"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
