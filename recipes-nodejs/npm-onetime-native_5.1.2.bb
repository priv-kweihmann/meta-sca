SUMMARY = "NPM: onetime"
DESCRIPTION = "Ensure a function is only called once"
HOMEPAGE = "https://github.com/sindresorhus/onetime#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/onetime/-/onetime-5.1.2.tgz"
SRC_URI[md5sum] = "3718ac1c293209cfe5a1c19aae16c5a3"
SRC_URI[sha256sum] = "f059b2ea801cb7b253c4613f43d96cd56ae8dda56faa0999539aa1795725aacd"

NPM_PKGNAME = "onetime"

inherit npmhelper
inherit native
