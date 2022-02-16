SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.7.tgz"
SRC_URI[md5sum] = "3a21bf426f4f6b8d13e27863d5ba95b7"
SRC_URI[sha256sum] = "b845136c5ddd3cab30b511560a1419ce2648198db1118d22c4f142658871f5b2"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
