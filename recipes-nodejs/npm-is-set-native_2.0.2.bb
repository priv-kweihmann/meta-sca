SUMMARY = "NPM: is-set"
DESCRIPTION = "Is this value a JS Set? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-set#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-set/-/is-set-2.0.2.tgz"
SRC_URI[md5sum] = "5719de7cbbb1eb19a7735bf0818013a9"
SRC_URI[sha256sum] = "22839ea8028f8700dccc90c78f1faf15d42dd6e321379a9a9ba7303cf1fd9301"

NPM_PKGNAME = "is-set"

inherit npmhelper
inherit native
