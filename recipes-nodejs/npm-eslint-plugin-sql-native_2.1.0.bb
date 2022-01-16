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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-sql/-/eslint-plugin-sql-2.1.0.tgz"
SRC_URI[md5sum] = "4eaec5645136998922a9f28eefdb8210"
SRC_URI[sha256sum] = "12ac668522e857a0c29a16d2b60abc840be409a3a211d59924f2d87640d1be80"

NPM_PKGNAME = "eslint-plugin-sql"

inherit npmhelper
inherit native
