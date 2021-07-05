SUMMARY = "NPM: vfile-reporter"
DESCRIPTION = "vfile utility to create a report for a file"
HOMEPAGE = "https://github.com/vfile/vfile-reporter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=2875345c4c25c82bc4cffdd96a77e2a4"

DEPENDS = "npm-repeat-string-native \
           npm-string-width-native \
           npm-supports-color-native \
           npm-types-repeat-string-native \
           npm-types-supports-color-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-sort-native \
           npm-vfile-statistics-native"

SRC_URI = "https://registry.npmjs.org/vfile-reporter/-/vfile-reporter-7.0.1.tgz"
SRC_URI[md5sum] = "56e3aba4d8634f0dbbda1b2c88273120"
SRC_URI[sha256sum] = "48d25a275fecd94069c3577326d7dac57bb0efb46a3a069c9bc434b8361f2f49"

NPM_PKGNAME = "vfile-reporter"

inherit npmhelper
inherit native
