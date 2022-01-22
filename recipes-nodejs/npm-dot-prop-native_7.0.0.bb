SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-7.0.0.tgz"
SRC_URI[md5sum] = "88f6b4a9da6b0e583c4a0923a0dd86b9"
SRC_URI[sha256sum] = "b8f54a0c10273f8b05e88227222b3e37ffa88ad4d28912670e02fbd475bb6008"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
