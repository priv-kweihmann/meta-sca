SUMMARY = "Code coverage measurement for Python"

HOMEPAGE = "https://github.com/nedbat/coveragepy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "c33cab2aed8780aac32880cb6c7616b7"
SRC_URI[sha256sum] = "e07d9f1a23e9e93ab5c62902833bf3e4b1f65502927379148b6622686223125c"
