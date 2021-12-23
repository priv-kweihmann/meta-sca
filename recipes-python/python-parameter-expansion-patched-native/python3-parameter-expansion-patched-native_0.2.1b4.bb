SUMMARY = "POSIX parameter expansion in Python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PYPI_PACKAGE = "parameter-expansion-patched"

SRC_URI[md5sum] = "c50685466a9ffeae0892a6cd1a896655"
SRC_URI[sha256sum] = "fa177819ac4a8aa810fd9a31769887125d63e94bc2f27f154627ba2899861aee"

inherit pypi
inherit setuptools3
inherit native
