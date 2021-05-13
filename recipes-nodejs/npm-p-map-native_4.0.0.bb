SUMMARY = "NPM: p-map"
DESCRIPTION = "Map over promises concurrently"
HOMEPAGE = "https://github.com/sindresorhus/p-map#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-aggregate-error-native"

SRC_URI = "https://registry.npmjs.org/p-map/-/p-map-4.0.0.tgz"
SRC_URI[md5sum] = "3bb4aec7015ac6e67a789d83f99c3e39"
SRC_URI[sha256sum] = "a130237561c3eeb75a25a215213ae6423bc1b57123b360528fd945703531ff90"

NPM_PKGNAME = "p-map"

inherit npmhelper
inherit native
