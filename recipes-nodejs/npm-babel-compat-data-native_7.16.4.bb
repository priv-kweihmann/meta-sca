SUMMARY = "NPM: @babel/compat-data"
DESCRIPTION = ""
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/compat-data/-/compat-data-7.16.4.tgz"
SRC_URI[md5sum] = "65c8c703274d5582fa875adc1960a74a"
SRC_URI[sha256sum] = "00e95f78fbae9d9667f86217a911d4da8f408861eec746569cc6a6bb6045e25b"

NPM_PKGNAME = "@babel/compat-data"

inherit npmhelper
inherit native
