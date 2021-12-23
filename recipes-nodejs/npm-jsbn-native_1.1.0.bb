SUMMARY = "NPM: jsbn"
DESCRIPTION = "The jsbn library is a fast, portable implementation of large-number math in pure JavaScript, enabling public-key crypto and other applications on desktop and mobile browsers."
HOMEPAGE = "https://github.com/andyperlitch/jsbn#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32052d48bacabd1c02e56c6889082a27"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/jsbn/-/jsbn-1.1.0.tgz"
SRC_URI[md5sum] = "fda9d9bfb60ce335fdeb2def419fd5a6"
SRC_URI[sha256sum] = "47cafa971709bb193242ef857fb25936ecd9522a1d44a01ce4858723a006ac45"

NPM_PKGNAME = "jsbn"

inherit npmhelper
inherit native
