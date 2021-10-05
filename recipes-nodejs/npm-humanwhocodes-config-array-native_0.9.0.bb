SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.9.0.tgz"
SRC_URI[md5sum] = "93da9e6c840ffb5776a4914fd06ff5e4"
SRC_URI[sha256sum] = "c2323959ee39e224b176156c14ca7772a79d918bcab397392b3a44e1049e277d"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
