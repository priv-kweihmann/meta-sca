SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.9.tgz"
SRC_URI[md5sum] = "759083d720771857f0836b41e48fd6c3"
SRC_URI[sha256sum] = "994046f2e604573b22425e39a926f60fc53f778020144de461d3b2b6a8ac1105"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
