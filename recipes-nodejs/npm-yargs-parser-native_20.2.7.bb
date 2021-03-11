SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.7.tgz"
SRC_URI[md5sum] = "f3015a0046a27e4463dc317265e6c90e"
SRC_URI[sha256sum] = "8a6ff0ec64609dca672e248552b7a0db817d7d99596ab7fb24c7bee96355fe85"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
