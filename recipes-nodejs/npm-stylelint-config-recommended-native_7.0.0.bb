SUMMARY = "NPM: stylelint-config-recommended"
DESCRIPTION = "Recommended shareable config for Stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-recommended#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f692ad1565ee66c108b2d13b6f5e1575"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/stylelint-config-recommended/-/stylelint-config-recommended-7.0.0.tgz"
SRC_URI[md5sum] = "c4b23dde1168a618439324dbc68c038c"
SRC_URI[sha256sum] = "980f18c774064423abaa6508160b6c4af5f75d3999e15fee13476edc62c8bd41"

NPM_PKGNAME = "stylelint-config-recommended"

inherit npmhelper
inherit native
