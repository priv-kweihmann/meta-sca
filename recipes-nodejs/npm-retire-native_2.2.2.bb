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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-2.2.2.tgz"
SRC_URI[md5sum] = "4beb6acb47b4147a515a7b1f2b047ce2"
SRC_URI[sha256sum] = "7d6d6c5fbd8b7aec2d1673180a4e1c64c0ebb6200d1b9e0212d801581c5832db"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
