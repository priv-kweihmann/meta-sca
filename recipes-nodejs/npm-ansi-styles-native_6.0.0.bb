SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-6.0.0.tgz"
SRC_URI[md5sum] = "6945bc7bfe4425de10ae3c8565edf53e"
SRC_URI[sha256sum] = "a4d7b0a78337c3b96048187e50cb4605e7c6de4ef0f7da70e679bee6aec8502d"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native
