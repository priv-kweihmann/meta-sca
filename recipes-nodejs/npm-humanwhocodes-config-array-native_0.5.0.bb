SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.5.0.tgz"
SRC_URI[md5sum] = "f213b462bcaeafab8b1b485dd0ce0334"
SRC_URI[sha256sum] = "fcbac7458173e19b06a44959a9c53ae453e866da1ce2f2ca5baf93562f594f72"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
