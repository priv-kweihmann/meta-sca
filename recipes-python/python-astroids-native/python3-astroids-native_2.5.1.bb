SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += "\
            python3-native \
            python3-pylazy-object-proxy-native \
            python3-pytest-runner-native \
            python3-typed-ast-native \
            python3-wrapt-native \
            "

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "52ad092c3066cdc64870dfa7f9000363"
SRC_URI[sha256sum] = "cfc35498ee64017be059ceffab0a25bedf7548ab76f2bea691c5565896e7128d"

inherit pypi
inherit setuptools3
inherit native
