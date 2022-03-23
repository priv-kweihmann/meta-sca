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

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.14.1.tgz"
SRC_URI[md5sum] = "4d77fe4a7d930f1ecb5942b37f359909"
SRC_URI[sha256sum] = "9c764c11733958e34f461ca43b430f4c54edc9167cfbbb9088660f3431e9f401"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
