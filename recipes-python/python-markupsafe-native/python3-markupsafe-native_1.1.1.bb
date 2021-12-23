SUMMARY = "Safely add untrusted strings to HTML/XML markup"
HOMEPAGE = "https://github.com/pallets/markupsafe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

PYPI_PACKAGE = "MarkupSafe"

SRC_URI[md5sum] = "43fd756864fe42063068e092e220c57b"
SRC_URI[sha256sum] = "29872e92839765e546828bb7754a68c418d927cd064fd4708fab9fe9c8bb116b"

inherit pypi
inherit setuptools3
inherit native
