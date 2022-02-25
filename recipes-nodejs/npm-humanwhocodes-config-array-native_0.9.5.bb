SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.9.5.tgz"
SRC_URI[md5sum] = "eca2bc50cc13e438f62d9ee84f2fe5af"
SRC_URI[sha256sum] = "1007199c9852712083f7b2a0c42b852f146224f6adcfeff1519e8e322c56e7a5"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
