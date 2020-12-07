SUMMARY = "NPM: vfile-reporter"
DESCRIPTION = "vfile utility to create a report for a file"
HOMEPAGE = "https://github.com/vfile/vfile-reporter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=2875345c4c25c82bc4cffdd96a77e2a4"

DEPENDS = "npm-repeat-string-native \
           npm-string-width-native \
           npm-supports-color-native \
           npm-unist-util-stringify-position-native \
           npm-vfile-sort-native \
           npm-vfile-statistics-native"

SRC_URI = "https://registry.npmjs.org/vfile-reporter/-/vfile-reporter-6.0.2.tgz"
SRC_URI[md5sum] = "09f287f8b0787a6ebec55564df3fef88"
SRC_URI[sha256sum] = "8be0981935b2d03c7834b1b60e73ef93e6f0e926e26d5a779877329641ba5fc2"

NPM_PKGNAME = "vfile-reporter"

inherit npmhelper
inherit native
