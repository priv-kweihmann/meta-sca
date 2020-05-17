SUMMARY = "NPM: @fimbul/mimir"
DESCRIPTION = "Core rules of the Fimbullinter project"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEPENDS = "npm-chalk-native npm-debug-native npm-fimbul-ymir-native npm-tslib-native npm-tsutils-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://registry.npmjs.org/@fimbul/mimir/-/mimir-0.21.0.tgz"
SRC_URI[md5sum] = "925a9d1373be7b787278985bf2fa8bad"
SRC_URI[sha256sum] = "f7b2fbde7878977624d265bb1837cb687b37f8e9a96f0ad3293886f836ea9e5b"

NPM_PKGNAME = "@fimbul/mimir"

inherit npmhelper
inherit native
