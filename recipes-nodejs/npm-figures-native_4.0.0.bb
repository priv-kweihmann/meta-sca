SUMMARY = "NPM: figures"
DESCRIPTION = "Unicode symbols with fallbacks for older terminals"
HOMEPAGE = "https://github.com/sindresorhus/figures#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-escape-string-regexp-native \
           npm-is-unicode-supported-native"

SRC_URI = "https://registry.npmjs.org/figures/-/figures-4.0.0.tgz"
SRC_URI[md5sum] = "c02eaffa99b0aa8f9d018f893d81767b"
SRC_URI[sha256sum] = "2b64953d0d9afaab117c6e26449acabe0cf72c19b39094831738a703c34c6624"

NPM_PKGNAME = "figures"

inherit npmhelper
inherit native
