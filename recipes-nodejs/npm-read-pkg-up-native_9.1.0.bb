SUMMARY = "NPM: read-pkg-up"
DESCRIPTION = "Read the closest package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg-up#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native \
           npm-read-pkg-native \
           npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/read-pkg-up/-/read-pkg-up-9.1.0.tgz"
SRC_URI[md5sum] = "82130c00c62f08467b9235b7feb580c5"
SRC_URI[sha256sum] = "857a10ae58205f344b5d87a52510e7fdcd3eada237f17f34242e1d88b617654b"

NPM_PKGNAME = "read-pkg-up"

inherit npmhelper
inherit native
