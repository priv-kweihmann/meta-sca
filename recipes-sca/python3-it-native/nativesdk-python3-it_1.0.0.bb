SUMMARY = "IT, Inspector Tiger, is a modern python code review tool / framework"
HOMEPAGE = "https://github.com/thg-consulting/it"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[md5sum] = "1971946229672a7c7185963745f8001b"
SRC_URI[sha256sum] = "a1e1ab603798ebc895333f3753019a4be34a73e8eda7dc5f911916889a838cb2"

PYPI_PACKAGE = "it"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "it"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-asyncio \
    nativesdk-python3-core \
    nativesdk-python3-distutils \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-netclient \
    nativesdk-python3-netserver \
    nativesdk-python3-profile \
    nativesdk-python3-stringold \
"
