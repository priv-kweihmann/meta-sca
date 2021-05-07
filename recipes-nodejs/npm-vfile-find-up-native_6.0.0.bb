SUMMARY = "NPM: vfile-find-up"
DESCRIPTION = "vfile utility to find one or more files by searching the file system upwards"
HOMEPAGE = "https://github.com/vfile/vfile-find-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-to-vfile-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/vfile-find-up/-/vfile-find-up-6.0.0.tgz"
SRC_URI[md5sum] = "aa796de9da9c2316114d855e0506fd0e"
SRC_URI[sha256sum] = "007c5f9325afa70019d30e34a28d38b18c5d46e8edf2ebe3bde6536dec8ad99e"

NPM_PKGNAME = "vfile-find-up"

inherit npmhelper
inherit native
