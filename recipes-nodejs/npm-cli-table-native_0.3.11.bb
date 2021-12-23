SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7426c3e07cd555a7113d8e4740f8bf6a"

DEPENDS = "npm-colors-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.11.tgz"
SRC_URI[md5sum] = "96bfe0f1f5719a48401b6f196d0a83cf"
SRC_URI[sha256sum] = "627ad03eeb4c373530101bf982e0b2781ddef9b56b6c593dd29ca245dcbe90c0"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
