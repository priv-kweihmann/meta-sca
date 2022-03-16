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

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.14.0.tgz"
SRC_URI[md5sum] = "d1011372553b22508b19b19d3f7a6c12"
SRC_URI[sha256sum] = "b74e7118d15b5266508d92baafe5980a29c702fcec0f995c6a026b1b388fb873"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
