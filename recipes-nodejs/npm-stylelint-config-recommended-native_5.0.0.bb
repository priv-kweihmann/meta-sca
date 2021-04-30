SUMMARY = "NPM: stylelint-config-recommended"
DESCRIPTION = "Recommended shareable config for stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-recommended#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f692ad1565ee66c108b2d13b6f5e1575"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/stylelint-config-recommended/-/stylelint-config-recommended-5.0.0.tgz"
SRC_URI[md5sum] = "383feb8068cb57b792efafb6e7e636d0"
SRC_URI[sha256sum] = "7233fdd34b540f333bac2840a89dd60d35f250f14f3c4ce00d3ce3e81112c6cc"

NPM_PKGNAME = "stylelint-config-recommended"

inherit npmhelper
inherit native
