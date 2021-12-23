SUMMARY = "NPM: indent-string"
DESCRIPTION = "Indent each line in a string"
HOMEPAGE = "https://github.com/sindresorhus/indent-string#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/indent-string/-/indent-string-5.0.0.tgz"
SRC_URI[md5sum] = "9c926143e24973df6ae187ab0bea0aac"
SRC_URI[sha256sum] = "dd448adae5342e76483d69c4ff7451ebf0e1a16f10445abf45247c815e9bf7e6"

NPM_PKGNAME = "indent-string"

inherit npmhelper
inherit native
