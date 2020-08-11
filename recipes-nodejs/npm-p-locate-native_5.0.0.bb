SUMMARY = "NPM: p-locate"
DESCRIPTION = "Get the first fulfilled promise that satisfies the provided testing function"
HOMEPAGE = "https://github.com/sindresorhus/p-locate#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-limit-native"

SRC_URI = "https://registry.npmjs.org/p-locate/-/p-locate-5.0.0.tgz"
SRC_URI[md5sum] = "f179aa668706b232c29cb580eea96619"
SRC_URI[sha256sum] = "2ec11480a90965a753b141be5432d24f4ca98860b844fd1b10cab0a1023423fc"

NPM_PKGNAME = "p-locate"

inherit npmhelper
inherit native
