SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.4.tgz"
SRC_URI[md5sum] = "dded5e7456c94ffc7f4ffddddcac0681"
SRC_URI[sha256sum] = "4fe61652a7e5375530ef19f941238fec925f34c7cad78f45bc73afad66bd0121"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
