SUMMARY = "NPM: tsconfig-paths"
DESCRIPTION = "Load node modules according to tsconfig paths, in run-time or via API."
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c17ca18a648da5ade1f324b80ea4540"

DEPENDS = "npm-json5-native \
           npm-minimist-native \
           npm-strip-bom-native \
           npm-types-json5-native"

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.12.0.tgz"
SRC_URI[md5sum] = "864704be71309d70ae4a2045ce17e2e0"
SRC_URI[sha256sum] = "99c2bb5ac67ade10dc163b295eabb1b2a827e7857cdfeeccf5c9f8e496af3f81"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
