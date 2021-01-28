SUMMARY = "NPM: internal-slot"
DESCRIPTION = "ES spec-like internal slots"
HOMEPAGE = "https://github.com/ljharb/internal-slot#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-get-intrinsic-native \
           npm-has-native \
           npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/internal-slot/-/internal-slot-1.0.3.tgz"
SRC_URI[md5sum] = "01f7b7499f71622547496b12f902bec8"
SRC_URI[sha256sum] = "a509a651045c962081e6bdff2561795720697377381368fdee2d8f39d6f40463"

NPM_PKGNAME = "internal-slot"

inherit npmhelper
inherit native
