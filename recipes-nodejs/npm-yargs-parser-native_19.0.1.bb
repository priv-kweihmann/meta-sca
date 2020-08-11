SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-19.0.1.tgz"
SRC_URI[md5sum] = "0ea5d95ed4771ecdafcc2ed681b26367"
SRC_URI[sha256sum] = "3e0608194b60c53c6a838b660bd34f9da9a4a85abf6e0e78bfd0e5289845eedf"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
