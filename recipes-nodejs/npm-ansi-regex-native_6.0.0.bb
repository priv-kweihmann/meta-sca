SUMMARY = "NPM: ansi-regex"
DESCRIPTION = "Regular expression for matching ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/ansi-regex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-regex/-/ansi-regex-6.0.0.tgz"
SRC_URI[md5sum] = "989495fe972e52b24cb1041d097e4614"
SRC_URI[sha256sum] = "22ffc64d165371e3f534af1618354744cd408d559b5a85ada10e12234748938d"

NPM_PKGNAME = "ansi-regex"

inherit npmhelper
inherit native
