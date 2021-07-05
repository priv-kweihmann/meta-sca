SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "617efbf3edb707c57008ec00f408972f"
SRC_URI[sha256sum] = "f5812b1e007e48cff63449a5e9f4e7ebea716b4111f9c4f9a645f91d579bf0c4"

inherit pypi
inherit setuptools3
inherit native
