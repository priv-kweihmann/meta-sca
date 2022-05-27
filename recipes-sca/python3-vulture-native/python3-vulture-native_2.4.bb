SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI[md5sum] = "cdc7378a2d4cd50b4c1113ae67e3cf04"
SRC_URI[sha256sum] = "819439294a76b4e0b8e08c70d75565a8ce3dc1f6e03558ed123a5f2bb737c0ea"

PYPI_PACKAGE = "vulture"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "vulture"
