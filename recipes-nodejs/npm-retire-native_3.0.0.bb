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

SRC_URI = "https://registry.npmjs.org/retire/-/retire-3.0.0.tgz"
SRC_URI[md5sum] = "1e6caf08396e6258227753f0df85486f"
SRC_URI[sha256sum] = "b9963a32008e89880a708d19077c1946965bf682ee27e79bca4ba5bf14bb3a5f"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
