SUMMARY = "NPM: ansi-escapes"
DESCRIPTION = "ANSI escape codes for manipulating the terminal"
HOMEPAGE = "https://github.com/sindresorhus/ansi-escapes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/ansi-escapes/-/ansi-escapes-4.3.2.tgz"
SRC_URI[md5sum] = "08256e7c9d977ebc76b0660408abde06"
SRC_URI[sha256sum] = "44280af12799a2ad1c4aa8109324bf597fdaa8f0ec594ca6d2760851ae7e0713"

NPM_PKGNAME = "ansi-escapes"

inherit npmhelper
inherit native
