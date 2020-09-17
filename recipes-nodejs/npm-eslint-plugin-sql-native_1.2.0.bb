SUMMARY = "NPM: eslint-plugin-sql"
DESCRIPTION = "SQL linting rules for ESLint."
HOMEPAGE = "https://github.com/gajus/eslint-plugin-sql#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4bb3b4cf3aad3c70d9709d211ad30c41"

DEPENDS = "npm-astring-native \
           npm-debug-native \
           npm-lodash-native \
           npm-pg-formatter-native \
           npm-sql-parse-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-sql/-/eslint-plugin-sql-1.2.0.tgz"
SRC_URI[md5sum] = "b4efbe8c6388d0e1c942c553b3ca8e7b"
SRC_URI[sha256sum] = "b5cc028eb3d51c6bc12546526f608a08b1560bf12c472e026fb50b6352ae5687"

NPM_PKGNAME = "eslint-plugin-sql"

inherit npmhelper
inherit native
