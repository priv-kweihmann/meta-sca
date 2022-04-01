SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-chalk-native \
           npm-commander-native \
           npm-glob-native \
           npm-is-glob-native \
           npm-node-fetch-native \
           npm-strip-json-comments-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-1.1.3.tgz"
SRC_URI[md5sum] = "65184cda548bb8c2b5da7a2c25db51ca"
SRC_URI[sha256sum] = "41d2006fc05fe8c4a02d3c7e38b8c51d0558a21144f57133990a8a3d22e838d0"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
