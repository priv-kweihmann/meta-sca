SUMMARY = "NPM: gingerbread"
DESCRIPTION = "A wrapper around Ginger proofreader."
HOMEPAGE = "https://github.com/RobinvdVleuten/gingerbread#readme"

DEPENDS = "npm-commander-native npm-lodash.defaults-native npm-request-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=076f3bf88eee1569e9568702c2e68dbd"

SRC_URI = "https://registry.npmjs.org/gingerbread/-/gingerbread-0.5.0.tgz"
SRC_URI[md5sum] = "883273693defa143086317fde9c17aca"
SRC_URI[sha256sum] = "7de2f41c439063db88eb05364111f4520ed1cfeaa4c788eb822e55194833854e"

NPM_PKGNAME = "gingerbread"

inherit npmhelper
inherit native
