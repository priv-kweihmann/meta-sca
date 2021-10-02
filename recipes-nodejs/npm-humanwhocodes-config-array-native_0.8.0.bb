SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.8.0.tgz"
SRC_URI[md5sum] = "6a8eab71956ed8a64ce67077a150f1dd"
SRC_URI[sha256sum] = "77adabad35469f6cde81d2a18356016d78c96bbe92d3db6cfdbd6bda7efa7a4d"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
