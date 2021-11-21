SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7426c3e07cd555a7113d8e4740f8bf6a"

DEPENDS = "npm-colors-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.8.tgz"
SRC_URI[md5sum] = "2a80a0ac6fbc0fc685d6a238fd463bba"
SRC_URI[sha256sum] = "cacb0732632f84c99f49c447480c00b6b2baedfd6b3b9c3d0d50ce9db2ee035c"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
