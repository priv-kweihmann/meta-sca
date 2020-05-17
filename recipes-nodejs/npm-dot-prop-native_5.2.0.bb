SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"

DEPENDS = "npm-is-obj-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-5.2.0.tgz"
SRC_URI[md5sum] = "49b5d53752953e0b8db16318e6891063"
SRC_URI[sha256sum] = "3df80e281c29f3f9b19571d350013d815ce83e7901fcd483902f72ab4936a8a0"

S = "${WORKDIR}/package"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
