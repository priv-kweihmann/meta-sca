SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-9.2.2.tgz"
SRC_URI[md5sum] = "d3beaa6d387dee55e259d7f2a9627876"
SRC_URI[sha256sum] = "7eb845c5868c3dac7735b1eb4d903b8ab0a84b80333f4328d2c0ea809c5db5b4"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
