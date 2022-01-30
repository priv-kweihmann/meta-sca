SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.9.3.tgz"
SRC_URI[md5sum] = "8cb466c0c4e9bce699b83e78715281d9"
SRC_URI[sha256sum] = "9151ddaa942fb053d5af9dc1663f014bcbb54676e268eddf6ff96a91e8144db8"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
