SUMMARY = "plugin to provide system package provided sevenzip binary"
HOMEPAGE = "https://github.com/nexB/extractcode"

LICENSE = "Apache-2.0 & LGPL-2.1 & unRAR & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.txt;md5=b88ed37631527bdf35bcf5cb2dac553f \
"

DEPENDS += "\
    p7zip-native \
"

SRC_URI_append = " file://0001-override-paths-by-env-var.patch"

PYPI_PACKAGE = "extractcode_7z_system_provided"

SRC_URI[md5sum] = "5b9e0cbecc86a3c7ab76dc77a8e39049"
SRC_URI[sha256sum] = "0ac9dc361e5bab403963e21eca2003e3d2b893cb73dec73bbe1250809bd2b06a"

inherit pypi
inherit setuptools3
inherit native
