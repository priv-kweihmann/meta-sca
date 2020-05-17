SUMMARY = "NPM: vfile-statistics"
DESCRIPTION = "vfile utility to count messages per category: failures, warnings, etc"
HOMEPAGE = "https://github.com/vfile/vfile-statistics#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/vfile-statistics/-/vfile-statistics-1.1.4.tgz"
SRC_URI[md5sum] = "cb1c7c06266a14b6b594e59c3a9267b3"
SRC_URI[sha256sum] = "8482bc5e883624e58ebd760025c2f9ab878097f7f947575cda3db9bcad071f1e"

NPM_PKGNAME = "vfile-statistics"

inherit npmhelper
inherit native
