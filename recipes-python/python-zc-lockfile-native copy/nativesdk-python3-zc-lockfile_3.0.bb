SUMMARY = "Basic inter-process locks"
HOMEPAGE = "https://github.com/zopefoundation/zc.lockfile"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ZPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=78ccb3640dc841e1baecb3e27a6966b2"

PYPI_PACKAGE = "zc.lockfile"

SRC_URI[md5sum] = "bf9329ac41679cc0171d1661ebf9fb66"
SRC_URI[sha256sum] = "e58ffd9dd62c6d432e8682bfa196c90cac3e5c1e3f24dae3b89d60822855d788"

inherit pypi
inherit setuptools3
inherit nativesdk
