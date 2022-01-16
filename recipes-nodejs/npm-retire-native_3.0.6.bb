SUMMARY = "NPM: retire"
DESCRIPTION = "Retire is a tool for detecting use of vulnerable libraries"
HOMEPAGE = "https://github.com/RetireJS/retire.js#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
# does not provide a license
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "npm-ansi-colors-native \
           npm-commander-native \
           npm-https-proxy-agent-native \
           npm-read-installed-native \
           npm-walkdir-native"

SRC_URI = "https://registry.npmjs.org/retire/-/retire-3.0.6.tgz"
SRC_URI[md5sum] = "b56c3fd2fc6135ea8480d442e533d671"
SRC_URI[sha256sum] = "b6876e7917c9fc50a56a261e2b8156543f03ebb1bcff16869294a5ce4b86c49f"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
