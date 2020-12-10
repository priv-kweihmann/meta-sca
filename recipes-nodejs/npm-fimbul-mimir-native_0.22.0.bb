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

SRC_URI = "https://registry.npmjs.org/@fimbul/mimir/-/mimir-0.22.0.tgz"
SRC_URI[md5sum] = "b82e84f29356e743d80c94939a5dbc31"
SRC_URI[sha256sum] = "e8fb44619be4632d5d8534b27bb1f563db91139ee8fff88d653f1e2a7ff5aeec"

NPM_PKGNAME = "@fimbul/mimir"

inherit npmhelper
inherit native
