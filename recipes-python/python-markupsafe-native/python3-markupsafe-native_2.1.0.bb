SUMMARY = "Safely add untrusted strings to HTML/XML markup"
HOMEPAGE = "https://github.com/pallets/markupsafe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

PYPI_PACKAGE = "MarkupSafe"

SRC_URI[md5sum] = "1c3ef96104e89fc64f90e48194a4f154"
SRC_URI[sha256sum] = "80beaf63ddfbc64a0452b841d8036ca0611e049650e20afcb882f5d3c266d65f"

inherit pypi
inherit setuptools3
inherit native
