SUMMARY = "The strictest and most opinionated python linter ever!"
HOMEPAGE = "https://github.com/wemake-services/wemake-python-styleguide"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dee021f8214bb1b3fd62729a11603bf5"

DEPENDS += "\
            ${PYTHON_PN}-astor-native \
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-cognitive-complexity-native \
            ${PYTHON_PN}-flake8-annotations-complexity-native \
            ${PYTHON_PN}-flake8-bandit-native \
            ${PYTHON_PN}-flake8-broken-line-native \
            ${PYTHON_PN}-flake8-bugbear-native \
            ${PYTHON_PN}-flake8-builtins-native \
            ${PYTHON_PN}-flake8-coding-native \
            ${PYTHON_PN}-flake8-commas-native \
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-debugger-native \
            ${PYTHON_PN}-flake8-docstrings-native \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-executable-native \
            ${PYTHON_PN}-flake8-isort-native \
            ${PYTHON_PN}-flake8-logging-format-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-pep3101-native \
            ${PYTHON_PN}-flake8-print-native \
            ${PYTHON_PN}-flake8-quotes-native \
            ${PYTHON_PN}-flake8-rst-docstrings-native \
            ${PYTHON_PN}-flake8-string-format-native \
            ${PYTHON_PN}-pep8-naming-native \
            ${PYTHON_PN}-pydocstyle-native \
            ${PYTHON_PN}-pygments-native \
            ${PYTHON_PN}-radon-native \
            ${PYTHON_PN}-typing-extensions-native \
            "

PYPI_PACKAGE = "wemake-python-styleguide"

SRC_URI[md5sum] = "55d742735d786f687515a9a88a974da0"
SRC_URI[sha256sum] = "927236eef999ef4a67ec6e120586da7d9e33f99568775d6ed28c3c6670872264"

inherit pypi
inherit native
inherit setuptools3
