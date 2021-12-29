SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.5.tgz"
SRC_URI[md5sum] = "c80a2a471dc4ad8ade94e8aa16e648b4"
SRC_URI[sha256sum] = "a3488f327fb7e2d5ca47f13d7e2ef49bccdf722368caec25d9871b5db8cdd48c"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
