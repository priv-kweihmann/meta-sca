SUMMARY = "NPM: @fimbul/mimir"
DESCRIPTION = "Core rules of the Fimbullinter project"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-chalk-native \
           npm-debug-native \
           npm-fimbul-ymir-native \
           npm-tslib-native \
           npm-tsutils-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/mimir/-/mimir-0.23.0.tgz"
SRC_URI[md5sum] = "03f3a518917566c8f20b427059a56efd"
SRC_URI[sha256sum] = "72ccee7d525d0b7d107bab15f58f50fdba5bbfc2dc230944e700a0fb30024068"

NPM_PKGNAME = "@fimbul/mimir"

inherit npmhelper
inherit native
