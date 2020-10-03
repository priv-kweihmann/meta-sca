SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.1.tgz"
SRC_URI[md5sum] = "8a0b4d8fb9eccc0efa6431b630b4b8a4"
SRC_URI[sha256sum] = "f1610d1538b23f88327c347cc533abde120a6cfbf9b8b39b5e2720a6e8ba10aa"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
