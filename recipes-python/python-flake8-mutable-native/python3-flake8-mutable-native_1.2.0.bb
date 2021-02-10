SUMMARY = "flake8 extension for mutable default arguments"
HOMEPAGE = "https://github.com/ebeweber/flake8-mutable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d524be351dfcd0878798ce25ede527ce"

DEPENDS += "\
            python3-flake8-native \
            python3-mccabe-native \
            python3-pep8-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "flake8-mutable"

SRC_URI[md5sum] = "5976fbe6c578d8c43ba1a8c372bdc3a5"
SRC_URI[sha256sum] = "ee9b77111b867d845177bbc289d87d541445ffcc6029a0c5c65865b42b18c6a6"

inherit pypi
inherit setuptools3
inherit native
