SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-21.0.0.tgz"
SRC_URI[md5sum] = "81fee5ad98d3f834f6034853b0ca60f3"
SRC_URI[sha256sum] = "2027e6d85e69acc003762f992f2ef7f431a38fc4f558851493532b61beb3a495"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
