SUMMARY = "NPM: vfile-reporter"
DESCRIPTION = "Stylish reporter for virtual files"
HOMEPAGE = "https://github.com/vfile/vfile-reporter#readme"

DEPENDS = "npm-repeat-string-native npm-string-width-native npm-supports-color-native npm-unist-util-stringify-position-native npm-vfile-statistics-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2875345c4c25c82bc4cffdd96a77e2a4"

SRC_URI = "https://registry.npmjs.org/vfile-reporter/-/vfile-reporter-4.0.0.tgz"
SRC_URI[md5sum] = "192823f84cf460950650e4078f7fd32c"
SRC_URI[sha256sum] = "e73535bf763973561d2df7d0b444b9122630691f2a9bd6ab8a36485aeb766ccf"

NPM_PKGNAME = "vfile-reporter"

inherit npmhelper
inherit native
