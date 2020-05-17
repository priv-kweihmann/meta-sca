SUMMARY = "NPM: retire"
DESCRIPTION = "Retire is a tool for detecting use of vulnerable libraries"
HOMEPAGE = "https://github.com/RetireJS/retire.js#readme"

LICENSE = "Apache-2.0"
# does not provide a license
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "npm-colors-native \
           npm-commander-native \
           npm-https-proxy-agent-native \
           npm-read-installed-native \
           npm-walkdir-native"

SRC_URI = "https://registry.npmjs.org/retire/-/retire-2.2.1.tgz"
SRC_URI[md5sum] = "4be814239b2f7eccb4224e8e08767b89"
SRC_URI[sha256sum] = "364b566e78054952e5af06a71e081f54233683edc4b9c42330981067ab513c58"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
