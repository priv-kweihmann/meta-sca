SUMMARY = "NPM: cuss"
DESCRIPTION = "Map of English profane words to a rating of sureness"
HOMEPAGE = "https://github.com/words/cuss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/cuss/-/cuss-1.19.0.tgz"
SRC_URI[md5sum] = "4f0ca577668593da55057835b4c99d73"
SRC_URI[sha256sum] = "be0c09993aac6039be0e4f0f51968d3c99f99af434b86755d372b41f9e77fd9c"

NPM_PKGNAME = "cuss"

inherit npmhelper
inherit native
