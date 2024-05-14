SUMMARY = "A library to manipulate gettext files (po and mo files)"
HOMEPAGE = "https://bitbucket.org/izi/polib/wiki/Home"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca9b0a3e473327024be9af47bc41fb14"

PYPI_PACKAGE = "polib"

SRC_URI[md5sum] = "3832de1c54ee8c9dac47b4a970d15fb0"
SRC_URI[sha256sum] = "f3ef94aefed6e183e342a8a269ae1fc4742ba193186ad76f175938621dbfc26b"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
