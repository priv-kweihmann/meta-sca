SUMMARY = "Bash style brace expander"
DESCRIPTION = "Bracex is a brace expanding library (à la Bash) for Python."
HOMEPAGE = "https://github.com/facelessuser/bracex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=afeaf26eb7075154cef8e8a5fe5fa5ee"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "bracex"

SRC_URI[md5sum] = "43d4fc88823550525fdedbbacfa2ddcf"
SRC_URI[sha256sum] = "01f715cd0ed7a622ec8b32322e715813f7574de531f09b70f6f3b2c10f682425"

inherit pypi
inherit setuptools3
inherit native
