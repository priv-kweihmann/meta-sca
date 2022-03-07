SUMMARY = "NPM: vfile-message"
DESCRIPTION = "vfile utility to create a virtual message"
HOMEPAGE = "https://github.com/vfile/vfile-message#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/vfile-message/-/vfile-message-3.1.2.tgz"
SRC_URI[md5sum] = "c3962d1ce60778a8be1d8e2dff048712"
SRC_URI[sha256sum] = "daeedec528b370de0a08c1f4c21fd2f8006e25bbf6836a4e0e496ff3ba75e62f"

NPM_PKGNAME = "vfile-message"

inherit npmhelper
inherit native
