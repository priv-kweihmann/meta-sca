SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.10.1.tgz"
SRC_URI[md5sum] = "7a2922ccb627a795eec63fc477eb513e"
SRC_URI[sha256sum] = "36eb433110b4851c4b77befd513c99b8b36e3a79fe8c69fdb6468f53d6c38b0a"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
