SUMMARY = "NPM: trim-newlines"
DESCRIPTION = "Trim newlines from the start and/or end of a string"
HOMEPAGE = "https://github.com/sindresorhus/trim-newlines#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim-newlines/-/trim-newlines-4.0.1.tgz"
SRC_URI[md5sum] = "35253755aebee52a284a6d76d00efaaa"
SRC_URI[sha256sum] = "5901f1d853b17dd8c5d7cc868230e1fe270b0250c089a36fb065fd3f43100505"

NPM_PKGNAME = "trim-newlines"

inherit npmhelper
inherit native
