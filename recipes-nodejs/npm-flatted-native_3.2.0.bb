SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.2.0.tgz"
SRC_URI[md5sum] = "f828f234ddbc661278e2c4ec486f3433"
SRC_URI[sha256sum] = "244f44f9f8e203343d80032cb8d5791d74930bd8a38cb155de2b1abf4c2ef185"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
