SUMMARY = "NPM: tsconfig-paths"
DESCRIPTION = "Load node modules according to tsconfig paths, in run-time or via API."
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c17ca18a648da5ade1f324b80ea4540"

DEPENDS = "npm-json5-native \
           npm-minimist-native \
           npm-strip-bom-native \
           npm-types-json5-native"

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.11.0.tgz"
SRC_URI[md5sum] = "79ff9f4559ce1a7f5eaec86c4d90b069"
SRC_URI[sha256sum] = "d6ec47c755b2814cf11c01a67964778fb12c60bc2a949352053de13aec4903fc"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
