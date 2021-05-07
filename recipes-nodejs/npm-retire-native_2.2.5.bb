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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-2.2.5.tgz"
SRC_URI[md5sum] = "7cbe00e3acb039cc0235676716284546"
SRC_URI[sha256sum] = "8d2b766bc6cdaa55f7aeb7c6e74ad5897ed48b5c62dc6b9f3ac90643f2166739"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
