SUMMARY = "NPM: form-data"
DESCRIPTION = "A library to create readable "multipart/form-data" streams. Can be used to submit forms and file uploads to other web applications."
HOMEPAGE = "https://github.com/form-data/form-data#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License;md5=7aa505292e2636a9e59d4d3f258f4819"

DEPENDS = "npm-asynckit-native \
           npm-combined-stream-native \
           npm-mime-types-native"

SRC_URI = "https://registry.npmjs.org/form-data/-/form-data-4.0.0.tgz"
SRC_URI[md5sum] = "524eb959b028ef26348aaec27eb071c1"
SRC_URI[sha256sum] = "c951c71b54ebcd58d737da62a1daece72fb930a00647208b6e4ab251ab56d81a"

NPM_PKGNAME = "form-data"

inherit npmhelper
inherit native
