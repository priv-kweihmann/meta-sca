SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.0.0.tgz"
SRC_URI[md5sum] = "3903df0faeae79cbb8dbba332a088467"
SRC_URI[sha256sum] = "36e2759dd123a00410e5360596818646c770dd5e6f35a8793c3fb61992c7142b"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
