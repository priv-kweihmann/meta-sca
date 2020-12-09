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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-2.2.4.tgz"
SRC_URI[md5sum] = "b32a947997cf7dee4741a14168c52ba8"
SRC_URI[sha256sum] = "261e2d013bb059c6e8d0bb0eefac4ec2d0327780c14415e00268a6909cc00f72"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
