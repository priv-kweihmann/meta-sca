SUMMARY = "NPM: vfile-message"
DESCRIPTION = "vfile utility to create a virtual message"
HOMEPAGE = "https://github.com/vfile/vfile-message#readme"

DEPENDS = "npm-types-unist-native npm-unist-util-stringify-position-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

SRC_URI = "https://registry.npmjs.org/vfile-message/-/vfile-message-2.0.4.tgz"
SRC_URI[md5sum] = "0c71f625881a9f041db5ab82543442e4"
SRC_URI[sha256sum] = "83ad5da3942c9ac9d060e470845042de7aecf4fbe9903ae7cdb002dbcf18856c"

NPM_PKGNAME = "vfile-message"

inherit npmhelper
inherit native
