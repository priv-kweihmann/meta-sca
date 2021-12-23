SUMMARY = "NPM: regexpp"
DESCRIPTION = "Regular expression parser for ECMAScript."
HOMEPAGE = "https://github.com/mysticatea/regexpp#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/regexpp/-/regexpp-3.2.0.tgz"
SRC_URI[md5sum] = "57799c5267ba34569b8f63f1e4554ec5"
SRC_URI[sha256sum] = "fa4c77eaaaf770fc07e5f834b9e3ff1ec39dca5e0e2f8f66a252c8c7eb840a7e"

NPM_PKGNAME = "regexpp"

inherit npmhelper
inherit native
