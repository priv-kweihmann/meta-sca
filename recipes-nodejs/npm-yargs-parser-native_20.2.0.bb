SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.0.tgz"
SRC_URI[md5sum] = "74a714fad457999196c0008152e693e2"
SRC_URI[sha256sum] = "46cf57f8e303df1c94f3c4a4cefa3bb1e99487d0a3f8c690f980c7b2b0e51ced"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
