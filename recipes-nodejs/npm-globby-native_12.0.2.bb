SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-array-union-native \
           npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-12.0.2.tgz"
SRC_URI[md5sum] = "1d19a96ef08750fe0d837f55ad8fa1a1"
SRC_URI[sha256sum] = "145d446d480dbbded2b9e09561327c748677ff7706f94a47cec4d4a1e44ccb9f"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
