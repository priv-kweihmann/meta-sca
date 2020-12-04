SUMMARY = "Get a public suffix for a domain name using the Public Suffix List"
HOMEPAGE = "https://www.tablix.org/~avian/git/publicsuffix.git/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0bb0a6ff16d6214bc6d686d0749264c6"

PYPI_PACKAGE = "publicsuffix"

SRC_URI[md5sum] = "6a17531803dda28ce4299c7368ca6f43"
SRC_URI[sha256sum] = "22ce1d65ab6af5e9b2122e2443facdb93fb5c4abf24138099cb10fe7989f43b6"

inherit pypi
inherit native
inherit setuptools3
