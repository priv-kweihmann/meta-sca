SUMMARY = "NPM: leven"
DESCRIPTION = "Measure the difference between two strings using the fastest JS implementation of the Levenshtein distance algorithm"
HOMEPAGE = "https://github.com/sindresorhus/leven#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/leven/-/leven-3.1.0.tgz"
SRC_URI[md5sum] = "7a780f3f2dcd9a434e66b33c48f440dd"
SRC_URI[sha256sum] = "7883560bc4f2c96d054ab98603a0b56ddee55f99b9945569e27919b7013f6ecd"

NPM_PKGNAME = "leven"

inherit npmhelper
inherit native
