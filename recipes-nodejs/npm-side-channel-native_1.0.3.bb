SUMMARY = "NPM: side-channel"
DESCRIPTION = "Store information about any JS value in a side channel. Uses WeakMap if available."
HOMEPAGE = "https://github.com/ljharb/side-channel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-es-abstract-native \
           npm-object-inspect-native"

SRC_URI = "https://registry.npmjs.org/side-channel/-/side-channel-1.0.3.tgz"
SRC_URI[md5sum] = "65f86031294a28cb0a7ca7d54e7587b3"
SRC_URI[sha256sum] = "3e94642afc363a90c53806e5abdeed638a217a11309cacb4cf51bbc0c0bfb87c"

NPM_PKGNAME = "side-channel"

inherit npmhelper
inherit native
