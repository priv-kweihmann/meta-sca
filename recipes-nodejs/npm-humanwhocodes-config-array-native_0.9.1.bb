SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.9.1.tgz"
SRC_URI[md5sum] = "134893356a56dc7d0a2d11b2e4cd36a1"
SRC_URI[sha256sum] = "5e1e3ddd57ff31b5bb59ae897ae317e0c6ccc34fc3d55e38204592bdae74a87a"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
