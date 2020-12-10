SUMMARY = "NPM: @fimbul/bifrost"
DESCRIPTION = "Compatibility layer for TSLint rules"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-fimbul-ymir-native \
           npm-get-caller-file-native \
           npm-tslib-native \
           npm-tsutils-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/bifrost/-/bifrost-0.22.0.tgz"
SRC_URI[md5sum] = "0667ec1cc30ff3534456afc9816bd79b"
SRC_URI[sha256sum] = "69f4b23e36be4cd9fcdfeb03fc27f1e9f027ed3e3dff5424c80e9a607631416d"

NPM_PKGNAME = "@fimbul/bifrost"

inherit npmhelper
inherit native
