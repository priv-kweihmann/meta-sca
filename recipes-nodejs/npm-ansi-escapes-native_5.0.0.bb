SUMMARY = "NPM: ansi-escapes"
DESCRIPTION = "ANSI escape codes for manipulating the terminal"
HOMEPAGE = "https://github.com/sindresorhus/ansi-escapes#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/ansi-escapes/-/ansi-escapes-5.0.0.tgz"
SRC_URI[md5sum] = "b992d02b2849ecfc7e9a9857cc089784"
SRC_URI[sha256sum] = "c6f063a83673bea32090abdc95f443d2a7fe23c3708ca0409381aafc8a329fd3"

NPM_PKGNAME = "ansi-escapes"

inherit npmhelper
inherit native
