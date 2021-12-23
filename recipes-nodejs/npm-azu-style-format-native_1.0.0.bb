SUMMARY = "NPM: @azu/style-format"
DESCRIPTION = "Library to easily style texts with string formatting"
HOMEPAGE = "https://github.com/azu/style-format#readme"

DEPENDS = "npm-azu-format-text-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "https://registry.npmjs.org/@azu/style-format/-/style-format-1.0.0.tgz"
SRC_URI[md5sum] = "fd57d47c8e04c2aadc1641e831719e22"
SRC_URI[sha256sum] = "e037c8f88100e2f6023879fb572a2edd39b240d1a22634d44d59e6933d96dfe8"

NPM_PKGNAME = "@azu/style-format"

inherit npmhelper
inherit native
