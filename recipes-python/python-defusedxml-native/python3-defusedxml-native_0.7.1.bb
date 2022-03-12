SUMMARY = "XML bomb protection for Python stdlib modules"
HOMEPAGE = "https://github.com/tiran/defusedxml"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=056fea6a4b395a24d0d278bf5c80249e"

PYPI_PACKAGE = "defusedxml"

SRC_URI[sha256sum] = "1bb3032db185915b62d7c6209c5a8792be6a32ab2fedacc84e01b52c51aa3e69"

inherit pypi
inherit setuptools3
inherit native
