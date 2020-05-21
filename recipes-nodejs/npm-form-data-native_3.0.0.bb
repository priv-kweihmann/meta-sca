SUMMARY = "NPM: form-data"
DESCRIPTION = "A library to create readable "multipart/form-data" streams. Can be used to submit forms and file uploads to other web applications."
HOMEPAGE = "https://github.com/form-data/form-data#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=7aa505292e2636a9e59d4d3f258f4819"

DEPENDS = "npm-asynckit-native \
           npm-combined-stream-native \
           npm-mime-types-native"

SRC_URI = "https://registry.npmjs.org/form-data/-/form-data-3.0.0.tgz"
SRC_URI[md5sum] = "6b415302a72f371adf08c067d98ffacd"
SRC_URI[sha256sum] = "0c7f689cb4e7cd8cff60eb5c0fe1482e67488a9d7bb31acd663d837a82fb284e"

NPM_PKGNAME = "form-data"

inherit npmhelper
inherit native
