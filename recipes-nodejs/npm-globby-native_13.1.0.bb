SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-13.1.0.tgz"
SRC_URI[md5sum] = "1adec2da5f814d9aeb0dbdcfb393b5de"
SRC_URI[sha256sum] = "6e878d10f8c3202a505232fbc8f9a4d2c3e108e3af3ca9f3697c0bc5854916b4"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
