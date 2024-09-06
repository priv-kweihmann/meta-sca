SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e34c75178086aca0a17551ffbacaca53"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "f511b370db4c80137aadf457a905fa53"
SRC_URI[sha256sum] = "3ff6c5d8b43e8c37bb6e6dd5085658d658a7a0bdcd20b6a07b1fcfc1c4e9d632"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-future"
