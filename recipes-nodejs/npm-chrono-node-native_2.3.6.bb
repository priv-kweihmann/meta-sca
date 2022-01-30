SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.6.tgz"
SRC_URI[md5sum] = "8db18b65380d5fdce9883897389d7f7d"
SRC_URI[sha256sum] = "9540e7680a22d40d9efcac27ad3caf5ad61e5997b73f41aeafabc0801d63481d"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
