SUMMARY = "NPM: is-regex"
DESCRIPTION = "Is this value a JS regex? Works cross-realm/iframe, and despite ES6 @@toStringTag"
HOMEPAGE = "https://github.com/inspect-js/is-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native \
           npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-regex/-/is-regex-1.1.4.tgz"
SRC_URI[md5sum] = "13a02d0abc63ff0093ca592e999f713c"
SRC_URI[sha256sum] = "2791dd704e8ad3e7ec22e03c68fd8ae82dcc640a8592696fbf6c940691a3303c"

NPM_PKGNAME = "is-regex"

inherit npmhelper
inherit native
