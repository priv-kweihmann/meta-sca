SUMMARY = "NPM: mime-db"
DESCRIPTION = "Media Type Database"
HOMEPAGE = "https://github.com/jshttp/mime-db#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175b28b58359f8b4a969c9ab7c828445"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mime-db/-/mime-db-1.52.0.tgz"
SRC_URI[md5sum] = "50b2c443b49e7fb97b8bde58e493f497"
SRC_URI[sha256sum] = "b8e70bb4d52acd5d0d1ed848c0e6e3c903a533aa500acffbe003f011b18f9e3b"

NPM_PKGNAME = "mime-db"

inherit npmhelper
inherit native
