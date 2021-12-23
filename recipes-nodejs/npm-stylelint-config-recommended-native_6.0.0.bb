SUMMARY = "NPM: stylelint-config-recommended"
DESCRIPTION = "Recommended shareable config for Stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-recommended#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f692ad1565ee66c108b2d13b6f5e1575"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/stylelint-config-recommended/-/stylelint-config-recommended-6.0.0.tgz"
SRC_URI[md5sum] = "caa154f13b688754d3b47f070fee7f38"
SRC_URI[sha256sum] = "15a52e57fb64a0e3dd94aadd35abab1fe7735c3582b5d70bf1639b146020f251"

NPM_PKGNAME = "stylelint-config-recommended"

inherit npmhelper
inherit native
