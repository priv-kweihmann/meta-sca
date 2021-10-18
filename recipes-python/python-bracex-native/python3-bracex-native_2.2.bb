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

SRC_URI[md5sum] = "ef704c05bf12467e93fdc0ec63c995f3"
SRC_URI[sha256sum] = "8230f3a03f1f76c192a7844377124300fbaec83870a728b629dfabd9be9e83d0"

inherit pypi
inherit setuptools3
inherit native
