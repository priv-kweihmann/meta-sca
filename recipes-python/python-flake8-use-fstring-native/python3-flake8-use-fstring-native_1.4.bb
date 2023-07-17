SUMMARY = "Flake8 plugin for string formatting style"
HOMEPAGE = "https://github.com/MichaelKim0407/flake8-use-fstring"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b480581b7e41b14dab3e9a8308f86834"

DEPENDS += "\
    python3-flake8-native \
"

PYPI_PACKAGE = "flake8-use-fstring"

SRC_URI[sha256sum] = "6550bf722585eb97dffa8343b0f1c372101f5c4ab5b07ebf0edd1c79880cdd39"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
