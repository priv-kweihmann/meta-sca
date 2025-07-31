SUMMARY = "configparser extension for systemd files"
HOMEPAGE = "https://github.com/sgallagher/systemdunitparser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c76c4cc354acaac30ed4d5eefea7245"

PYPI_PACKAGE = "systemdunitparser"

SRC_URI[md5sum] = "ca9f41e0fffc4790074f9fa0812bca46"
SRC_URI[sha256sum] = "af5fb7c0ba9d27dab044fee9b4e632149af32545f5501ada9d7ecf8529e38f9f"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
