SUMMARY = "NPM: p-locate"
DESCRIPTION = "Get the first fulfilled promise that satisfies the provided testing function"
HOMEPAGE = "https://github.com/sindresorhus/p-locate#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-limit-native"

SRC_URI = "https://registry.npmjs.org/p-locate/-/p-locate-6.0.0.tgz"
SRC_URI[md5sum] = "5057ecf6618f4e7b8135d5f83d53e484"
SRC_URI[sha256sum] = "02779148d39ed9c11805e42ea013c42e83e83e9c5c5dd1a9176ca28c873dd588"

NPM_PKGNAME = "p-locate"

inherit npmhelper
inherit native
