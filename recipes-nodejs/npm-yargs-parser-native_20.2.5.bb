SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.5.tgz"
SRC_URI[md5sum] = "87a37b31cc5a9a191645a847af7d24c1"
SRC_URI[sha256sum] = "96be874c7cdf1029370c95d575ac1ddd87bb3fab5c1a495c9576e117243e5e8a"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
