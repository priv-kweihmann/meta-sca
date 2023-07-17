SUMMARY = "A plugin for flake8 to ban the usage of unsafe naive datetime class"
HOMEPAGE = "https://github.com/pjknkda/flake8-datetimez"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=39;md5=2c0caeec719da2ceeb603cc5d7a82e17"

PYPI_PACKAGE = "flake8-datetimez"

DEPENDS += "nativesdk-python3-flake8"

SRC_URI[sha256sum] = "78939f3bcbe2b7fe48235998545c869c27cdfac3f45685099a3f7366c1ffebc6"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
