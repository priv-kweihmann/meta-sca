SUMMARY = "Wildcard/glob file name matcher"
DESCRIPTION = "Wildcard Match provides an enhanced fnmatch, glob, and pathlib library."
HOMEPAGE = "https://github.com/facelessuser/wcmatch"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=838e17f50a700d2416b311b28960bcd3"

DEPENDS += "\
            python3-bracex-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "wcmatch"

SRC_URI[md5sum] = "3e8b058e22c24c35f3be0ed43f0452eb"
SRC_URI[sha256sum] = "4d54ddb506c90b5a5bba3a96a1cfb0bb07127909e19046a71d689ddfb18c3617"

inherit pypi
inherit setuptools3
inherit native
