SUMMARY = "NPM: p-map"
DESCRIPTION = "Map over promises concurrently"
HOMEPAGE = "https://github.com/sindresorhus/p-map#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-aggregate-error-native"

SRC_URI = "https://registry.npmjs.org/p-map/-/p-map-5.3.0.tgz"
SRC_URI[md5sum] = "e03520d2d0d0ad3ede41e006a7671655"
SRC_URI[sha256sum] = "02e2ef56f8e1aca87a38d7e434c8bd82be722196e4af1f6b8d6975bd5f749830"

NPM_PKGNAME = "p-map"

inherit npmhelper
inherit native
