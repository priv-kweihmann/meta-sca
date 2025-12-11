SUMMARY = "A fast, extensible Markdown parser in pure Python."
HOMEPAGE = "https://github.com/miyuchina/mistletoe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57943b291c8e54f0e5b648dc17a6f76c"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "c5571ce6ca9cfdc7ce9151c3ae79acb418e067812000907616427197648030a3"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "mistletoe"
