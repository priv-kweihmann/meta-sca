SUMMARY = "NPM: vfile-reporter"
DESCRIPTION = "vfile utility to create a report for a file"
HOMEPAGE = "https://github.com/vfile/vfile-reporter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=2875345c4c25c82bc4cffdd96a77e2a4"

DEPENDS = "npm-string-width-native \
           npm-supports-color-native \
           npm-types-supports-color-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-sort-native \
           npm-vfile-statistics-native"

SRC_URI = "https://registry.npmjs.org/vfile-reporter/-/vfile-reporter-7.0.2.tgz"
SRC_URI[md5sum] = "72411b87088619d50992e0e6db71cae8"
SRC_URI[sha256sum] = "7a241fb0614c0c47ca2d4da4937310a5702cf118bc81a5431c4a4a3d10b49475"

NPM_PKGNAME = "vfile-reporter"

inherit npmhelper
inherit native
