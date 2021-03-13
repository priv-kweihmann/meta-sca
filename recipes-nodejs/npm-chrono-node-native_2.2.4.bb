SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.4.tgz"
SRC_URI[md5sum] = "34c0459b201d93649e8ccf5e7b57b116"
SRC_URI[sha256sum] = "d0abc049b24f1fb2265f931aecc2da7ff5ac7431fc2ccae523386ed26e71307b"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
