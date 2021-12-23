SUMMARY = "NPM: eslint-plugin-sql"
DESCRIPTION = "SQL linting rules for ESLint."
HOMEPAGE = "https://github.com/gajus/eslint-plugin-sql#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4bb3b4cf3aad3c70d9709d211ad30c41"

DEPENDS = "npm-astring-native \
           npm-debug-native \
           npm-lodash-native \
           npm-pg-formatter-native \
           npm-sql-parse-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-sql/-/eslint-plugin-sql-2.0.0.tgz"
SRC_URI[md5sum] = "8a1631c51f630e3e13f38acb935592cb"
SRC_URI[sha256sum] = "ad951346636481cade0eb02c970bb0057b851a58628fe5eb82f5748c302f2088"

NPM_PKGNAME = "eslint-plugin-sql"

inherit npmhelper
inherit native
