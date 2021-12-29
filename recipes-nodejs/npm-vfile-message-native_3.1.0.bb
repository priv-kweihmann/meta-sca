SUMMARY = "NPM: vfile-message"
DESCRIPTION = "vfile utility to create a virtual message"
HOMEPAGE = "https://github.com/vfile/vfile-message#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/vfile-message/-/vfile-message-3.1.0.tgz"
SRC_URI[md5sum] = "f27c085327ead1ed5275ca34654ecc55"
SRC_URI[sha256sum] = "98430a0aedee1ad4df73b091281ee33f0cfaa0850e652c6699c54df096ecf7cd"

NPM_PKGNAME = "vfile-message"

inherit npmhelper
inherit native
