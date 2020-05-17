SUMMARY = "NPM: isobject"
DESCRIPTION = "Returns true if the value is an object and not an array or null."
HOMEPAGE = "https://github.com/jonschlinkert/isobject"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2f5638b0557426da0c3bd67e00a0ebde"

SRC_URI = "https://registry.npmjs.org/isobject/-/isobject-3.0.1.tgz"
SRC_URI[md5sum] = "9e7647515c0885e809f9aeb22de293f3"
SRC_URI[sha256sum] = "3cc6c92b005a644c93fbc9e3eb450b6a642bbca3443cc9dcc169152961367d37"

NPM_PKGNAME = "isobject"

inherit npmhelper
inherit native
