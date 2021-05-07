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

SRC_URI = "https://registry.npmjs.org/vfile-reporter/-/vfile-reporter-7.0.0.tgz"
SRC_URI[md5sum] = "2c8ab86f0d3386998249f522af943b35"
SRC_URI[sha256sum] = "e6335e526bf6f583f16dc22101fa48a089917901c880bb29ad28cb88c55197e1"

NPM_PKGNAME = "vfile-reporter"

inherit npmhelper
inherit native
