SUMMARY = "NPM: retire"
DESCRIPTION = "Retire is a tool for detecting use of vulnerable libraries"
HOMEPAGE = "https://github.com/RetireJS/retire.js#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
# does not provide a license
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "npm-colors-native \
           npm-commander-native \
           npm-https-proxy-agent-native \
           npm-read-installed-native \
           npm-walkdir-native"

SRC_URI = "https://registry.npmjs.org/retire/-/retire-3.0.3.tgz"
SRC_URI[md5sum] = "a2da71673a72f07d9feef19fe55cb68b"
SRC_URI[sha256sum] = "8d9d0748b39aefcc92cb4df4ea8f12914107292caa16c89976e9873d252f5f08"

NPM_PKGNAME = "retire"

inherit npmhelper
inherit native
