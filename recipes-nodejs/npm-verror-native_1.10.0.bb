SUMMARY = "NPM: verror"
DESCRIPTION = "richer JavaScript errors"
HOMEPAGE = "https://github.com/davepacheco/node-verror"

DEPENDS = "npm-assert-plus-native npm-core-util-is-native npm-extsprintf-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0"

SRC_URI = "https://registry.npmjs.org/verror/-/verror-1.10.0.tgz"
SRC_URI[md5sum] = "75487bf6e91e3a17798930de0b6041af"
SRC_URI[sha256sum] = "019b4544dc60b21b7f325205967d0aafb72c618570499933ed25e16d0d799e6b"

S = "${WORKDIR}/package"

NPM_PKGNAME = "verror"

inherit npmhelper
inherit native
