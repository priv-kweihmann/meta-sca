SUMMARY = "NPM: cli-truncate"
DESCRIPTION = "Truncate a string to a specific width in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/cli-truncate#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/cli-truncate/-/cli-truncate-3.0.0.tgz"
SRC_URI[md5sum] = "83e5726751e655358fb756d558dd108a"
SRC_URI[sha256sum] = "ce5060625856d5233ea11fcc14f21cb95b79a41502cf7865ff393cf998a3ea89"

NPM_PKGNAME = "cli-truncate"

inherit npmhelper
inherit native
