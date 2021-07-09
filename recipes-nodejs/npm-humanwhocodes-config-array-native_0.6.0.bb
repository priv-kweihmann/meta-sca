SUMMARY = "NPM: @humanwhocodes/config-array"
DESCRIPTION = "Glob-based configuration matching."
HOMEPAGE = "https://github.com/humanwhocodes/config-array#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-debug-native \
           npm-humanwhocodes-object-schema-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/@humanwhocodes/config-array/-/config-array-0.6.0.tgz"
SRC_URI[md5sum] = "92d8b2fb0f91381ba01dc42e7d6fc661"
SRC_URI[sha256sum] = "9269847fe237721322d19be17c7d1c419c026c649a12a4908ad6ba7fc3cb1ec6"

NPM_PKGNAME = "@humanwhocodes/config-array"

inherit npmhelper
inherit native
