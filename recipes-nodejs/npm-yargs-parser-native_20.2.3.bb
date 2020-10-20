SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.3.tgz"
SRC_URI[md5sum] = "5d67017f418bcd1a780c5edb7a17da91"
SRC_URI[sha256sum] = "c7a2c031b7897e2c03011d66c84098ad4c7a1cd1772619441d71b34466e6c57e"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
