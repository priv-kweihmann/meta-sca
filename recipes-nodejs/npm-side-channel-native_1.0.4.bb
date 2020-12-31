SUMMARY = "NPM: side-channel"
DESCRIPTION = "Store information about any JS value in a side channel. Uses WeakMap if available."
HOMEPAGE = "https://github.com/ljharb/side-channel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-call-bind-native \
           npm-get-intrinsic-native \
           npm-object-inspect-native"

SRC_URI = "https://registry.npmjs.org/side-channel/-/side-channel-1.0.4.tgz"
SRC_URI[md5sum] = "abcc258cdccfd0db4007c7be3888d7df"
SRC_URI[sha256sum] = "352b84bca536881ae429da1b0574e6805572bdc0312384033f0445204b06d735"

NPM_PKGNAME = "side-channel"

inherit npmhelper
inherit native
