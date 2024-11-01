SUMMARY = "configparser extension for systemd files"
HOMEPAGE = "https://github.com/sgallagher/systemdunitparser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c76c4cc354acaac30ed4d5eefea7245"

PYPI_PACKAGE = "systemdunitparser"

SRC_URI[md5sum] = "bb6e6c858df2e0b86eebae0e43e444fb"
SRC_URI[sha256sum] = "4efdc0ebc33c4aa69517a3dfa3c1f0a1379829af22e2371b5d06f7bc995acda7"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
