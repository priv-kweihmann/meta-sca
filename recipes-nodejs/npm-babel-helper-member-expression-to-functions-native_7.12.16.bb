SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-member-expression-to-functions"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.12.16.tgz"
SRC_URI[md5sum] = "619982af14ec79e31231427db61fc8dd"
SRC_URI[sha256sum] = "cbfff31d7b38d87e1511a3762aac2a797f77d353806228ad10edda9808050641"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
