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

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.13.0.tgz"
SRC_URI[md5sum] = "3ac21c84822cdd5d2440633bdc6d25be"
SRC_URI[sha256sum] = "547b7add45968ab0397dae54632910bb6f46f77e58accd37391914abcc8903d7"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
