SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-7.1.1.tgz"
SRC_URI[md5sum] = "ed43d584ac31cf21734a9dba7721c93b"
SRC_URI[sha256sum] = "a4f3843e4b5e307347ad012ec34230248d2e9f7cb52b1235164b4fe53b120e97"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
