SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-19.0.4.tgz"
SRC_URI[md5sum] = "629a61fa00e4f2825db8d8db05b38bc2"
SRC_URI[sha256sum] = "c01575c0442f3e84b922908e80b6548500608d8f7f61ee08fd3810142bc1d23a"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
