SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.10.2.tgz"
SRC_URI[md5sum] = "3552b1492333bae7bfeb85f5861f7177"
SRC_URI[sha256sum] = "0133cb65672e0847d3d9d182af2d8728f361d2989f206fb6b5d9c541cb8ea074"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
