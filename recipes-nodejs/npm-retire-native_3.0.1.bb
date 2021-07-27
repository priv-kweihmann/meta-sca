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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-3.0.1.tgz"
SRC_URI[md5sum] = "f6b848d9df9bb517ac1eb9560f2d677a"
SRC_URI[sha256sum] = "f370147c2120392a074eab78eb10f4876c6c9368ba830d7ff8f1347dc938ca44"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
