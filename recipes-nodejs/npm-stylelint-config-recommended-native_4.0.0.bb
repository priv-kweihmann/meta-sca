SUMMARY = "NPM: stylelint-config-recommended"
DESCRIPTION = "Recommended shareable config for stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-recommended#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f692ad1565ee66c108b2d13b6f5e1575"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/stylelint-config-recommended/-/stylelint-config-recommended-4.0.0.tgz"
SRC_URI[md5sum] = "4ff25f1965d82450ec400ba455dd5f1e"
SRC_URI[sha256sum] = "af8b03dd87b1cf4c19236c918c3541396029fadcb403df7c9115547103fc14f6"

NPM_PKGNAME = "stylelint-config-recommended"

inherit npmhelper
inherit native
