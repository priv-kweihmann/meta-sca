SUMMARY = "Safely add untrusted strings to HTML/XML markup"
HOMEPAGE = "https://github.com/pallets/markupsafe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

PYPI_PACKAGE = "MarkupSafe"

SRC_URI[md5sum] = "892e0fefa3c488387e5cc0cad2daa523"
SRC_URI[sha256sum] = "594c67807fb16238b30c44bdf74f36c02cdf22d1c8cda91ef8a0ed8dabf5620a"

inherit pypi
inherit setuptools3
inherit native
