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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-sql/-/eslint-plugin-sql-1.2.1.tgz"
SRC_URI[md5sum] = "ad07b411ed89aae935b2bd99f37e29e6"
SRC_URI[sha256sum] = "4e67983db705570cd25f1216f522267d51f97a0f4c5ec1283108d4d31917df26"

NPM_PKGNAME = "eslint-plugin-sql"

inherit npmhelper
inherit native
