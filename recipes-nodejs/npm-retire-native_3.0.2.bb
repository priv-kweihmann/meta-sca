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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-3.0.2.tgz"
SRC_URI[md5sum] = "78ee7f9570fb37f7504e2e40e41959ba"
SRC_URI[sha256sum] = "951b6fa90c7ed18e4b5389f577293bf68d3b923449bf40e5684226c3177925d6"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
