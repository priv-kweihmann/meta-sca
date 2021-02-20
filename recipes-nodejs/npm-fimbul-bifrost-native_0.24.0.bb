SUMMARY = "NPM: @fimbul/bifrost"
DESCRIPTION = "Compatibility layer for TSLint rules"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-fimbul-ymir-native \
           npm-get-caller-file-native \
           npm-tslib-native \
           npm-tsutils-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/bifrost/-/bifrost-0.24.0.tgz"
SRC_URI[md5sum] = "5fe8edabdc7d964f917ad8607503791e"
SRC_URI[sha256sum] = "fb343f3a026e11abfb8ce12c569e604a72b6adc497c66040cf0d11f7addddb53"

NPM_PKGNAME = "@fimbul/bifrost"

inherit npmhelper
inherit native
