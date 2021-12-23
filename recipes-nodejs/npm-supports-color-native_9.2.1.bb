SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-9.2.1.tgz"
SRC_URI[md5sum] = "e44d936fbd669441875c752c7f8841ba"
SRC_URI[sha256sum] = "bf3eb9d0adc75064a740617c8beaa4110f589bcdfea3e5acd13951d2cdfdfe48"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
