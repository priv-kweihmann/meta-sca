SUMMARY = "purl aka. Package URL parser and builder"
HOMEPAGE = "https://github.com/package-url/packageurl-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://mit.LICENSE;md5=ec425c78d8beabdb209b01c5fbcd38e0"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "packageurl_python"

SRC_URI[md5sum] = "9101b315cc2a963a598639cf466894e4"
SRC_URI[sha256sum] = "82e1150f1fc228e25e7b3be1c641ef96b6a0811526c0b4e4f7882a181e862607"

inherit pypi
inherit setuptools3
inherit_defer native
