SUMMARY = "Safely add untrusted strings to HTML/XML markup"
HOMEPAGE = "https://github.com/pallets/markupsafe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

PYPI_PACKAGE = "MarkupSafe"

SRC_URI[md5sum] = "9809f9fdd98bc835b0c21aa8f79cbf30"
SRC_URI[sha256sum] = "7f91197cc9e48f989d12e4e6fbc46495c446636dfc81b9ccf50bb0ec74b91d4b"

inherit pypi
inherit setuptools3
inherit native
