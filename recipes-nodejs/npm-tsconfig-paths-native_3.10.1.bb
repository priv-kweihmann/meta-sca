SUMMARY = "NPM: tsconfig-paths"
DESCRIPTION = "Load node modules according to tsconfig paths, in run-time or via API."
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c17ca18a648da5ade1f324b80ea4540"

DEPENDS = "npm-json5-native \
           npm-minimist-native \
           npm-strip-bom-native"

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.10.1.tgz"
SRC_URI[md5sum] = "d69405722e6c5f4c6a7f813bba501916"
SRC_URI[sha256sum] = "d1fa7aafafe007ec1d8b4b298d5ff99d2af2829ad5ebf841e9a76d1532aa48f9"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
