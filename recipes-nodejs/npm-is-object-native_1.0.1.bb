SUMMARY = "NPM: is-object"
DESCRIPTION = "Checks whether a value is an object"
HOMEPAGE = "https://github.com/ljharb/is-object"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1c841959f01a2fc8da6242c32371b50"

SRC_URI = "https://registry.npmjs.org/is-object/-/is-object-1.0.1.tgz"
SRC_URI[md5sum] = "085e3af7ec61af544479680de9b7a3d9"
SRC_URI[sha256sum] = "50675d09b265aaa84062a14a3f19bc8cd70b08a433d1cadb5d29f1102e84fee3"

NPM_PKGNAME = "is-object"

inherit npmhelper
inherit native
