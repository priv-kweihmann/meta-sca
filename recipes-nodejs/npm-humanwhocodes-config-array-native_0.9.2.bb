SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.9.2.tgz"
SRC_URI[md5sum] = "ce42d9f2f9b9b5e351f97a3f77813e1d"
SRC_URI[sha256sum] = "948ce9e2f962b494cf32cd12dfdbc7dbadb140491b0c1ba1cd50c01d29f299f3"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
