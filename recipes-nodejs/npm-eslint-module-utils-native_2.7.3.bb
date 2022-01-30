SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.7.3.tgz"
SRC_URI[md5sum] = "b209efc416d3e5b3f9b15c9177a19fec"
SRC_URI[sha256sum] = "0f6c6dd2c1754ae39c8467748f67d10faad647ed4d10ea4a2b796b2ef853abe6"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
