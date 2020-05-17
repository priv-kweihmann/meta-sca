SUMMARY = "NPM: eslint-plugin-sql"
DESCRIPTION = "SQL linting rules for ESLint."
HOMEPAGE = "https://github.com/gajus/eslint-plugin-sql#readme"

DEPENDS = "npm-astring-native npm-debug-native npm-lodash-native npm-pg-formatter-native npm-sql-parse-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4bb3b4cf3aad3c70d9709d211ad30c41"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-sql/-/eslint-plugin-sql-1.1.1.tgz"
SRC_URI[md5sum] = "182c5a8ea19a4eeb42ab25c36705a635"
SRC_URI[sha256sum] = "3c56d704ec2466d44551f2bd2f10928a354a3459ee7208421afa52cc5694a7ef"

NPM_PKGNAME = "eslint-plugin-sql"

inherit npmhelper
inherit native
