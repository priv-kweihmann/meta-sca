SUMMARY = "NPM: verror"
DESCRIPTION = "richer JavaScript errors"
HOMEPAGE = "https://github.com/joyent/node-verror#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0"

DEPENDS = "npm-assert-plus-native \
           npm-core-util-is-native \
           npm-extsprintf-native"

SRC_URI = "https://registry.npmjs.org/verror/-/verror-1.10.1.tgz"
SRC_URI[md5sum] = "d006b9a27d11451533983ca6ae42f6b4"
SRC_URI[sha256sum] = "8b5e34e3a7769774e68bca9eb4bd82e612c82117ab7ef1c6261f781172ece6a2"

NPM_PKGNAME = "verror"

inherit npmhelper
inherit native
