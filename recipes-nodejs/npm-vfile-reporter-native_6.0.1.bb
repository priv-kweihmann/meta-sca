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

SRC_URI = "https://registry.npmjs.org/vfile-reporter/-/vfile-reporter-6.0.1.tgz"
SRC_URI[md5sum] = "bc89e0451f6b8479fa6d1835b35644a5"
SRC_URI[sha256sum] = "adb1c0a98387bd90e12997d399a6a0f5bd83cafc544795ec34c7d519cbf0b8fb"

NPM_PKGNAME = "vfile-reporter"

inherit npmhelper
inherit native
