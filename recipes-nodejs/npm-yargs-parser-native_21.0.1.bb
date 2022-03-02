SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-21.0.1.tgz"
SRC_URI[md5sum] = "68d4e22b7c619fc3c6b66e9041a2ee37"
SRC_URI[sha256sum] = "4a2dabbf8d510082b3423db5bd669e1518554e2fda4febea7ba98bf456beaef7"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native
