SUMMARY = "NPM: is-number"
DESCRIPTION = "Returns true if a number or string value is a finite number. Useful for regex matches, parsing, user input, etc."
HOMEPAGE = "https://github.com/jonschlinkert/is-number"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

SRC_URI = "https://registry.npmjs.org/is-number/-/is-number-7.0.0.tgz"
SRC_URI[md5sum] = "6c6e00114e00c2815fc0aeae3da1af23"
SRC_URI[sha256sum] = "7b75c1057198cf97696909a9bee176c9c5e9bcb5b03bf3ecef2f484defadd51e"

NPM_PKGNAME = "is-number"

inherit npmhelper
inherit native
