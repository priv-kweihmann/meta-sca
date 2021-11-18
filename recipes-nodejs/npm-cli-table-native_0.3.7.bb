SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7426c3e07cd555a7113d8e4740f8bf6a"

DEPENDS = "npm-colors-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.7.tgz"
SRC_URI[md5sum] = "6a9d021659a4520c6388a07ff459939d"
SRC_URI[sha256sum] = "13023d039a96f70f3f84bd127c677e3ea60d5282c92345e522837d0003ae5edd"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
