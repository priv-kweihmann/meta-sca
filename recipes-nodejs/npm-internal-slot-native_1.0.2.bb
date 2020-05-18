SUMMARY = "NPM: internal-slot"
DESCRIPTION = "ES spec-like internal slots"
HOMEPAGE = "https://github.com/ljharb/internal-slot#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-es-abstract-native \
           npm-has-native \
           npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/internal-slot/-/internal-slot-1.0.2.tgz"
SRC_URI[md5sum] = "5a03b32cf50f610f0ceafccd7c19d0b7"
SRC_URI[sha256sum] = "9199973a89619ebdec0ec9502943e0ea66370235353001a8060c95570bf9dfa1"

NPM_PKGNAME = "internal-slot"

inherit npmhelper
inherit native
