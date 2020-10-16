SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-20.2.2.tgz"
SRC_URI[md5sum] = "75f0c8e2962c7be7a485ee0df7b68f65"
SRC_URI[sha256sum] = "507c989d54a6654bc060beaad7738ec0a91387cfcdf2a70f07a80f6b9e1ee691"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
