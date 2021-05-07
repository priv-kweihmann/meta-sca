SUMMARY = "NPM: vfile-message"
DESCRIPTION = "vfile utility to create a virtual message"
HOMEPAGE = "https://github.com/vfile/vfile-message#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/vfile-message/-/vfile-message-3.0.1.tgz"
SRC_URI[md5sum] = "d766f239a13e93ae412382850201ffcd"
SRC_URI[sha256sum] = "606c1c39cd1f21273d5529bc9e3c99fd1552fbf8ef7feacd8cc2e8d6067a353f"

NPM_PKGNAME = "vfile-message"

inherit npmhelper
inherit native
