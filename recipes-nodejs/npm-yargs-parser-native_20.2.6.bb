SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.6.tgz"
SRC_URI[md5sum] = "09d96200452cc0f90c774d7a0a73b39d"
SRC_URI[sha256sum] = "a467c6477881de7b306a16850cc69eed93244d7f848b968e8fe410d14bba2799"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
