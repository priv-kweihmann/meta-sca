SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.10.0.tgz"
SRC_URI[md5sum] = "301e2d1ac97547749543c7d7003b39c5"
SRC_URI[sha256sum] = "5f83d19b6cc8ac140c7c19bab22c5ee0bf89caed7a653557c9f5f20f541ff0d7"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
