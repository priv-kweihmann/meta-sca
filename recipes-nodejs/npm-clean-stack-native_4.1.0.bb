SUMMARY = "NPM: clean-stack"
DESCRIPTION = "Clean up error stack traces"
HOMEPAGE = "https://github.com/sindresorhus/clean-stack#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-escape-string-regexp-native"

SRC_URI = "https://registry.npmjs.org/clean-stack/-/clean-stack-4.1.0.tgz"
SRC_URI[md5sum] = "91bdbfe4d16ebfb5e565f85f6fc9b356"
SRC_URI[sha256sum] = "49dccc5b5b896606f7d72b9a2fe4f9841154b495bdec996ba9293c3ad9d0ecf7"

NPM_PKGNAME = "clean-stack"

inherit npmhelper
inherit native
