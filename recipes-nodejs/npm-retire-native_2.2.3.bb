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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-2.2.3.tgz"
SRC_URI[md5sum] = "7a543de5651412db45a51be973cd06f2"
SRC_URI[sha256sum] = "21177c9415e83ea9f1535aa7f8fd61019a9e15cd698b5e23f77d51b5cc9601f8"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
