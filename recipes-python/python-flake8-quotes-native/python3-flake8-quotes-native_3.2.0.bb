SUMMARY = "Flake8 extension for checking quotes in python"
HOMEPAGE = "https://github.com/zheller/flake8-quotes"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-quotes"

SRC_URI[md5sum] = "5da3a231ce799d00e7af98058dceac06"
SRC_URI[sha256sum] = "3f1116e985ef437c130431ac92f9b3155f8f652fda7405ac22ffdfd7a9d1055e"

inherit pypi
inherit setuptools3
inherit native
