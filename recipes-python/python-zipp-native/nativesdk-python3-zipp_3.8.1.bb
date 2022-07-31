SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-toml-native \
"

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "6f15c3e3c78919f8936749b0033e0cea"
SRC_URI[sha256sum] = "05b45f1ee8f807d0cc928485ca40a07cb491cf092ff587c0df9cb1fd154848d2"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit nativesdk
