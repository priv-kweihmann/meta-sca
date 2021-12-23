SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.4.tgz"
SRC_URI[md5sum] = "2cf1cc8893eb8621c7eaf1ca1382db4c"
SRC_URI[sha256sum] = "53110632f4aade1cce5c7cea0a0b0bb723e6e5190cfafd7ecfb21ab77a56d93e"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
